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

    private StringProperty titulo = new SimpleStringProperty("");
    public StringProperty tituloProperty() {
        return titulo;
    }

    private StringProperty autor = new SimpleStringProperty("");
    public StringProperty autorProperty() {
        return autor;
    }

    private StringProperty tipoMidia = new SimpleStringProperty("");
    public StringProperty tipoMidiaProperty() {
        return tipoMidia;
    }

    private DoubleProperty preco = new SimpleDoubleProperty(0.0);
    public DoubleProperty precoProperty() {
        return preco;
    }

    private ObjectProperty<LocalDate> publicacao = new SimpleObjectProperty<>();
    public ObjectProperty<LocalDate> publicacaoProperty() { return publicacao; }

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LivroDAO livroDAO = new LivroDAOImpl();

    public LivroControl() {
    }

    public Livro getEntity() {
        Livro p = new Livro();
        p.setTitulo(titulo.get());
        p.setAutor(autor.get());
        p.setTipoMidia(tipoMidia.get());
        p.setPreco(preco.get());
        p.setDataPublicacao(publicacao.get());
        return p;
    }
    private void setEntity(Livro p) {
        if (p != null) {
            titulo.set(p.getTitulo());
            autor.set(p.getAutor());
            tipoMidia.set(p.getTipoMidia());
            preco.set(p.getPreco());
            publicacao.set(p.getDataPublicacao());
        }
    }

    public void adicionar() {
        Livro p = getEntity();
        livroDAO.adicionar( p );
    }

    public void pesquisarPorNome() {
        List<Livro> livros = livroDAO.pesquisarPorNome(titulo.get());
        lista.clear();
        lista.addAll(livros);
    }

    public void generateTable() {
        TableColumn<Livro, String> colTitulo = new TableColumn<>("Título");
        colTitulo.setCellValueFactory(new PropertyValueFactory<Livro, String>("titulo"));

        TableColumn<Livro, String> colAutor = new TableColumn<>("Autor");
        colAutor.setCellValueFactory(new PropertyValueFactory<Livro, String>("autor"));

        TableColumn<Livro, String> colMidia = new TableColumn<>("Tipo de Mídia");
        colAutor.setCellValueFactory(new PropertyValueFactory<Livro, String>("tipomidia"));

        TableColumn<Livro, Double> colPreco = new TableColumn<>("Preço");
        colPreco.setCellValueFactory(new PropertyValueFactory<Livro, Double>("preço"));

        TableColumn<Livro, String> colPublicacao = new TableColumn<>("Publicação");
        colPublicacao.setCellValueFactory((item) -> {
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

        table.getColumns().addAll(colTitulo, colAutor, colMidia, colPreco, colPublicacao, colAcoes);
        table.setItems(lista);
        pesquisarPorNome();
    }

    public TableView<Livro> getTable() {
        return table;
    }
}
