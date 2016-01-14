package sample;/**
 * Created by tohargilbar on 13/01/16.
 */

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class logoController {

    logoController(){

    }
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


    public void show(TCP myProt) throws IOException {
        System.out.println("Dafuq");
        Stage stage=new Stage();
        System.out.println("Dafuq");
        Parent root = FXMLLoader.load(getClass().getResource("logo1.fxml"));
        System.out.println("Dafuq");
        stage.setTitle("logoController");
        Scene scene = new Scene(root, 400, 320);
        scene.getStylesheets().add(getClass().getResource("logo.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
        //myProt.SetIpAndPort(ip.getText(),Integer.parseInt(port.getText()));
    }

}
