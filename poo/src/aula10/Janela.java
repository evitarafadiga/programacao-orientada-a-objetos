package aula10;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Janela extends Application {

    class InterceptarEventos implements EventHandler<Event> {
        public void handle(Event event) {
            System.out.printf("Source ===>" + event.getSource());
            System.out.printf("%nType ===>" + event.getEventType());
            System.out.printf("%nTarget ===>" + event.getTarget());

        }
    }

    public void start(Stage stage) {
        BorderPane principal = new BorderPane();
        Scene scn = new Scene (principal,600,400);

        InterceptarEventos interEventos = new InterceptarEventos();
        stage.addEventFilter(Event.ANY, interEventos);

        stage.setScene(scn);
        stage.setTitle("Teste de Eventos");
        stage.show();
    }

    public static void main(String [] args) {
        Application.launch(Janela.class, args);

    }
}