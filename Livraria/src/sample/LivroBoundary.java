package sample;


import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import javafx.util.converter.DoubleStringConverter;
import javafx.util.converter.LocalDateStringConverter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class NossoConversorString extends StringConverter<LocalDate> {

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public String toString(LocalDate object) {
        if (object != null) {
            return object.format(formatter);
        } else {
            return "";
        }
    }

    @Override
    public LocalDate fromString(String string) {
        try {
            System.out.print("Convertendo data --> " + string);
            LocalDate d = LocalDate.parse(string);
            System.out.println("para --> " + d);
            return(d);
        } catch (Exception e) {
            return null;
        }
    }
}

public class LivroBoundary extends Application {

    private ObservableList<String> tipoMidia =
            FXCollections.observableArrayList("Físico", "Digital");
    private TextField txtTitulo = new TextField();
    private TextField txtAutor = new TextField();
    private ComboBox<String> cmbMidia = new ComboBox<>();
    private TextField txtValor = new TextField();
    // private TextField txtNascimento = new TextField();
    private DatePicker txtPublicacao = new DatePicker(LocalDate.now());
    private LivroControl control = new LivroControl();
    private Button btnAdicionar = new Button("Adicionar");
    private Button btnPesquisar = new Button("Pesquisar");

    @Override
    public void start(Stage stage) throws Exception {
        cmbMidia.setItems(tipoMidia);
        BorderPane panePrincipal = new BorderPane();
        GridPane gp = new GridPane();
        Scene scn = new Scene(panePrincipal, 600, 400);
        panePrincipal.setTop(gp);

        gp.add(new Label( "Título"), 0, 0);
        gp.add(txtTitulo, 1, 0);
        gp.add(new Label("Autor"), 1, 2);
        gp.add(txtAutor, 1, 0);
        gp.add(new Label("Tipo de Mídia"), 0, 1);
        gp.add(cmbMidia, 1, 1);
        gp.add(new Label("Preço"), 0, 2);
        gp.add(txtValor, 1, 2);
        gp.add(new Label("Data de Publicação"), 0, 3);
        gp.add(txtPublicacao, 1, 3);
        gp.add(btnAdicionar, 0, 4);
        gp.add(btnPesquisar, 1, 4);

        control.generateTable();
        panePrincipal.setCenter(control.getTable());

        btnAdicionar.setOnAction((e) -> { control.adicionar();});
        btnPesquisar.setOnAction((e) -> { control.pesquisarPorNome();});

        StringConverter conversorStringDouble = new DoubleStringConverter();
        StringConverter conversorStringLocalDate = new LocalDateStringConverter();
        // StringConverter conversorStringLocalDate = new NossoConversorString();

        Bindings.bindBidirectional(txtTitulo.textProperty(), control.tituloProperty());
        Bindings.bindBidirectional(txtAutor.textProperty(), control.autorProperty());
        Bindings.bindBidirectional(cmbMidia.valueProperty(), control.tipoMidiaProperty());
        Bindings.bindBidirectional(txtValor.textProperty(), control.precoProperty(), conversorStringDouble);
        Bindings.bindBidirectional(txtPublicacao.valueProperty(), control.publicacaoProperty());

        stage.setScene(scn);
        stage.setTitle("Livros BCE Tradicional");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(LivroBoundary.class, args);
    }
}
