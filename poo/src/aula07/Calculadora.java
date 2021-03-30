package aula07;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Calculadora extends Application {

    @Override
    public void start(Stage stage){

        FlowPane pane0 = new FlowPane();
        TilePane pane = new TilePane();
        Scene scene = new Scene(pane);
        pane.getChildren().add(pane0);
        TextField txt = new TextField();
        Button btn = new Button("CE");
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("+");
        Button btn5 = new Button("4");
        Button btn6 = new Button("5");
        Button btn7 = new Button("6");
        Button btn8 = new Button("-");
        Button btn9 = new Button("7");
        Button btn10 = new Button("8");
        Button btn11 = new Button("9");
        Button btn12 = new Button("*");
        Button btn13 = new Button(",");
        Button btn14 = new Button("0");
        Button btn15 = new Button("=");
        Button btn16 = new Button("/");
        pane.setPadding(new Insets(1));
        txt.setMaxWidth(70);
        pane0.getChildren().add(txt);
        pane0.getChildren().add(btn);
        pane.getChildren().add(btn1);
        pane.getChildren().add(btn2);
        pane.getChildren().add(btn3);
        pane.getChildren().add(btn4);
        pane.getChildren().add(btn5);
        pane.getChildren().add(btn6);
        pane.getChildren().add(btn7);
        pane.getChildren().add(btn8);
        pane.getChildren().add(btn9);
        pane.getChildren().add(btn10);
        pane.getChildren().add(btn11);
        pane.getChildren().add(btn12);
        pane.getChildren().add(btn13);
        pane.getChildren().add(btn14);
        pane.getChildren().add(btn15);
        pane.getChildren().add(btn16);
        stage.setScene(scene);
        stage.setTitle("Calculadora");
        stage.setWidth(100);
        stage.setHeight(200);
        stage.show();
    }

    public static void main(String[] args) {
        System.out.printf("Testando Calculadora...");
        Application.launch(Calculadora.class, args);
    }
}
