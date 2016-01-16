package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class mainController {
    private Communicator myProt;
    @FXML
    Button logoBtn;

    @FXML
    MenuItem plusPro;

    @FXML
    MenuItem plusMov;

    @FXML
    void initialize(){
        myProt=new Communicator();
        logoBtn.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                logo lg = new logo();
                try {
                    lg.show(myProt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        plusPro.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                AddPro ap = new AddPro();
                try {
                    ap.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        plusMov.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                AddMov am = new AddMov();
                try {
                    am.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
