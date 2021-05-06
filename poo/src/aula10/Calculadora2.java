package aula10;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Calculadora2 extends Application {

    class InterceptarEventos implements EventHandler<MouseEvent> {
        private Label label;
        InterceptarEventos(Label label) { this.label = label;}

        @Override
        public void handle(MouseEvent event) {
            label.setText("Apertado");
        }
    }

    @Override
    public void start(Stage stage){
        BorderPane principal = new BorderPane();
        FlowPane pane = new FlowPane();
        Scene scn = new Scene(principal, 120, 200);
        Label lblTexto = new Label("Insira um número:");
        TextField txt = new TextField();
        HBox hbox = new HBox();
        HBox hbox1 = new HBox();
        HBox hbox2 = new HBox();
        HBox hbox3 = new HBox();
        HBox hbox4 = new HBox();

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

        principal.setCenter(pane);
        hbox.getChildren().addAll(txt, btn);
        hbox1.getChildren().addAll(btn1, btn2, btn3, btn4);
        hbox2.getChildren().addAll(btn5, btn6, btn7, btn8);
        hbox3.getChildren().addAll(btn9, btn10, btn11,btn12);
        hbox4.getChildren().addAll(btn13,btn14,btn15,btn16);
        pane.getChildren().addAll(hbox, hbox1, hbox2, hbox3, hbox4);
        principal.setTop(lblTexto);

        BorderPane.setAlignment(lblTexto, Pos.CENTER);
        BorderPane.setAlignment(btn, Pos.BOTTOM_RIGHT);

        txt.setMaxWidth(70);

        btn.addEventFilter(MouseEvent.MOUSE_PRESSED,
                new Calculadora2.InterceptarEventos(lblTexto));

        stage.setScene(scn);
        stage.setTitle("Calculadora");
        stage.show();
    }

    public static void main(String[] args) { Application.launch(Calculadora2.class, args); }
}
