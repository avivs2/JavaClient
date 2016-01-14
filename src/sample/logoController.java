package sample;/**
 * Created by tohargilbar on 14/01/16.
 */

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class logoController {
    @FXML
    TextField ip;

    @FXML
    TextField port;

    @FXML
    Button saveBtn;

    @FXML
    void initialize(){
        saveBtn.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Stage stage=(Stage)saveBtn.getScene().getWindow();

                stage.close();
            }
        });
    }
    public String getip() {
        return ip.getText();
    }
    public String getport() {
        return port.getText();
    }

}

