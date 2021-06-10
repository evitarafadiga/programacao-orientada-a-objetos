package sample;

import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class LivroControl {

    private ObservableList<Livro> lista = FXCollections.observableArrayList();
    private TableView<Livro> table = new TableView<>();

    private StringProperty nome = new SimpleStringProperty("");
    public StringProperty nomeProperty() {
        return nome;
    }

    private StringProperty raca = new SimpleStringProperty("");
    public StringProperty racaProperty() {
        return raca;
    }

    private DoubleProperty peso = new SimpleDoubleProperty(0.0);
    public DoubleProperty pesoProperty() {
        return peso;
    }

    private ObjectProperty<LocalDate> nascimento = new SimpleObjectProperty<>();
    public ObjectProperty<LocalDate> nascimentoProperty() { return nascimento; }

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LivroDAO livroDAO = new LivroDAOImpl();

    public LivroControl() {
    }

    public Livro getEntity() {
        Livro p = new Livro();
        p.setTitulo(nome.get());
        p.setAutor(raca.get());
        p.setPreco(peso.get());
        p.setDataPublicacao(nascimento.get());
        return p;
    }
    private void setEntity(Livro p) {
        if (p != null) {
            nome.set(p.getTitulo());
            raca.set(p.getAutor());
            peso.set(p.getPreco());
            nascimento.set(p.getDataPublicacao());
        }
    }

    public void adicionar() {
        Livro p = getEntity();
        livroDAO.adicionar( p );
    }

    public void pesquisarPorNome() {
        List<Livro> livros = livroDAO.pesquisarPorNome(nome.get());
        lista.clear();
        lista.addAll(livros);
    }

    public void generateTable() {
        TableColumn<Livro, String> colNome = new TableColumn<>("Nome");
        colNome.setCellValueFactory(new PropertyValueFactory<Livro, String>("nome"));

        TableColumn<Livro, String> colRaca = new TableColumn<>("Raça");
        colRaca.setCellValueFactory(new PropertyValueFactory<Livro, String>("raca"));

        TableColumn<Livro, Double> colPeso = new TableColumn<>("Peso");
        colPeso.setCellValueFactory(new PropertyValueFactory<Livro, Double>("peso"));

        TableColumn<Livro, String> colNascimento = new TableColumn<>("Nascimento");
        colNascimento.setCellValueFactory((item) -> {
            String txtData = item.getValue().getDataPublicacao().format(formatter);
            return new ReadOnlyStringWrapper(txtData);
        });

        TableColumn<Livro, String> colAcoes = new TableColumn<>("Ações");

        Callback<TableColumn<Livro, String>, TableCell<Livro, String>> cellFactory = new
                Callback<TableColumn<Livro, String>, TableCell<Livro, String>>() {
                    @Override
                    public TableCell<Livro, String> call(TableColumn<Livro, String> param) {
                        TableCell<Livro, String> tableCell = new TableCell<Livro, String>() {
                            private void handle(ActionEvent e) {
                                System.out.println(getIndex());
                                lista.remove(getIndex());
                                FXDialogs.show("Gestão de Livros",
                                        "Remoção de registro",
                                        "O registro " + getIndex() + " for removido com sucesso",
                                        Alert.AlertType.INFORMATION);
                            }

                            Button btn = new Button("Apagar");
                            @Override
                            public void updateItem(String item, boolean empty) {
                                super.updateItem(item, empty);
                                btn.setOnAction(this::handle);
                                if (empty) {
                                    setGraphic(null);
                                    setText(null);
                                } else {
                                    setGraphic(btn);
                                    setText(null);
                                }
                            }
                        };
                        return tableCell;
                    }
                };
        colAcoes.setCellFactory(cellFactory);

        table.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            setEntity(newValue);
        });

        table.getColumns().addAll(colNome, colRaca, colPeso, colNascimento, colAcoes);
        table.setItems(lista);
        pesquisarPorNome();
    }

    public TableView<Livro> getTable() {
        return table;
    }
}
