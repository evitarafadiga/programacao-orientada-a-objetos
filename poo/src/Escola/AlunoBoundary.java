package Escola;

import org.w3c.dom.Text;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AlunoBoundary extends Application
        implements EventHandler<ActionEvent> {
    private TextField txtId = new TextField("");
    private TextField txtRa = new TextField("");
    private TextField txtNome = new TextField("");
    private TextField txtNasc = new TextField("");

    private Button btnAdicionar = new Button("Adicionar");
    private Button btnPesquisar = new Button("Pesquisar");

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // M maiusculo de mes
    private AlunoControl control = new AlunoControl();

    @Override
    public void start(Stage stage) throws Exception {
        GridPane grid = new GridPane();
        Scene scn = new Scene(grid, 600, 400);
        grid.setStyle("-fx-margin: 30px");

        grid.add(new Label("Id: "), 0, 0);
        grid.add(txtId, 1, 0);
        grid.add(new Label("Ra: "), 0, 1);
        grid.add(txtRa, 1, 1);
        grid.add(new Label("Nome: "), 0, 2);
        grid.add(txtNome, 1, 2);
        grid.add(new Label("Nascimento: "), 0, 3);
        grid.add(txtNasc, 1, 3);
        grid.add(btnAdicionar, 0, 9);
        grid.add(btnPesquisar, 1, 9);

        btnAdicionar.addEventFilter(ActionEvent.ACTION, this);
        btnPesquisar.addEventFilter(ActionEvent.ACTION, this);

        stage.setScene(scn);
        stage.setTitle("Gestão de Jogos");
        stage.show();
    }

    public Aluno boundaryToEntity() {
        Aluno e = new Aluno();
        try {
            e.setId(Long.parseLong(txtId.getText()));
            e.setRa(txtRa.getText());
            e.setNome(txtNome.getText());
            LocalDate d = LocalDate.parse(txtNasc.getText(), formatter);
            e.setNascimento(d);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return e;
    }

    public void entityToBoundary(Aluno e) {
        if (e != null){
            try {
                String txtData = e.getNascimento().format(formatter);

                txtId.setText(String.valueOf(e.getId()));
                txtRa.setText(e.getRa());
                txtNome.setText(e.getNome());
                txtNasc.setText(txtData);

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() == btnAdicionar) {
            Aluno j = this.boundaryToEntity();
            control.adicionar( j );
        } else if (event.getSource() == btnPesquisar) {
            Aluno j = control.pesquisarPorTitulo( txtTitulo.getText() );
            this.entityToBoundary( j );

        }
    }
}
