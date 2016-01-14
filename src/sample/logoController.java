package sample;/**
 * Created by tohargilbar on 13/01/16.
 */

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class logoController {

    logoController(){

    }
    @FXML
    TextField ip;

    @FXML
    TextField port;


    public void show(TCP myProt) throws IOException {
        Stage stage=new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("logo.fxml"));
        stage.setTitle("logoController");
        Scene scene = new Scene(root, 400, 320);
        scene.getStylesheets().add(getClass().getResource("logo.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
        myProt.SetIpAndPort(ip.getText(),Integer.parseInt(port.getText()));
    }

}
