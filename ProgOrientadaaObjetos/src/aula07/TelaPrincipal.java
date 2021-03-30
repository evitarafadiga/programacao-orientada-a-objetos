package aula07;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
        Button btn1 = new Button("Pesquisa");
        pane.getChildren().add(lblId);
        pane.getChildren().add(lblNome);
        pane.getChildren().add(lblTelefone);
        pane.getChildren().add(btn);
        lblNome.relocate (0,10);
        lblTelefone.relocate (0,20);
        btn.relocate(100, 50);
        btn1.relocate(200,50);
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
