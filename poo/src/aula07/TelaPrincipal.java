package aula07;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TelaPrincipal extends Application {

    public void start(Stage stage){
        Pane pane = new Pane();
        Scene scn = new Scene(pane);
        Label lblId = new Label("ID");
        Label lblNome = new Label("Nome");
        Label lblTelefone = new Label("Telefone");
        Button btn = new Button("Ok");
        Button btn1 = new Button("Pesquisar");
        TextField txt = new TextField("");
        TextField txt1 = new TextField("");
        TextField txt2 = new TextField("");
        pane.getChildren().add(lblId);
        pane.getChildren().add(lblNome);
        pane.getChildren().add(lblTelefone);
        pane.getChildren().add(btn);
        pane.getChildren().add(txt);
        pane.getChildren().add(txt1);
        pane.getChildren().add(txt2);
        lblNome.relocate (0,50);
        lblTelefone.relocate (0,100);
        btn.relocate(100, 150);
        btn1.relocate(0,170);
        txt.relocate(70, 0);
        txt1.relocate(70, 50);
        txt2.relocate(70, 100);
        stage.setScene(scn);
        stage.setTitle("Minha primeira janela JavaFX");
        stage.setWidth(400);
        stage.setHeight(400);
        stage.show();
    }
    public static void main(String[] args) {
        System.out.println("Teste de Java FX");
        Application.launch(TelaPrincipal.class, args);
    }
}
