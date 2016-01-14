package sample;
/**
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

public class logo {
    private FXMLLoader loader;
    private logoController controller;
    logo() {
    }


    public void show(TCP myProt) throws IOException {
        loader = new FXMLLoader(getClass().getResource("logo.fxml"));
        controller = new logoController();
        loader.setController(this.controller);

        Stage stage=new Stage();
        Parent root = loader.load();
        stage.setTitle("logo");
        Scene scene = new Scene(root, 400, 320);
        scene.getStylesheets().add(getClass().getResource("logo.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
        myProt.SetIpAndPort(controller.getip(),Integer.parseInt(controller.getport()));
    }

}
