package Escola;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Janela extends Application {

    public void start(Stage stage) {
        BorderPane principal = new BorderPane();
        Scene scn = new Scene (principal,600,400);

        Escola.AlunoHandler interEventos = new AlunoHandler() {
            @Override
            public void handle(ActionEvent e) {
                System.out.printf("Source ===>" + event.getSource());
                System.out.printf("%nType ===>" + event.getEventType());
                System.out.printf("%nTarget ===>" + event.getTarget());
            }
        };
        stage.addEventFilter(ActionEvent.ANY, interEventos);

        stage.setScene(scn);
        stage.setTitle("Teste de Eventos");
        stage.show();
    }

    public static void main(String [] args) {
        Application.launch(Escola.Janela.class, args);

    }
}
