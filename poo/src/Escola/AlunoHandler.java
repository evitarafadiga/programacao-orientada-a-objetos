package Escola;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;

public interface AlunoHandler implements EventHandler<ActionEvent> {

        public void handle(ActionEvent e) {
            System.out.printf("Source ===>" + event.getSource());
            System.out.printf("%nType ===>" + event.getEventType());
            System.out.printf("%nTarget ===>" + event.getTarget());
        }

}
