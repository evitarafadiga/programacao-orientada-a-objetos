package livrariaPOO;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderImage;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class TelaPrincipal extends Application {

    @Override
    public void start(Stage stage) {

        BorderPane pane = new BorderPane();
        Scene scn = new Scene(pane);
        stage.setScene(scn);
        stage.setTitle("Livraria");
        stage.setWidth(750);
        stage.setHeight(500);
        stage.show();

    }

    public static void main(String[] args) {
        System.out.println("Teste Livraria");
        Application.launch(TelaPrincipal.class, args);
    }
}


