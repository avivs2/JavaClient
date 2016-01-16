package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by אביב on 1/16/2016.
 * **/
public class AddMov {
    private FXMLLoader loader;
    private AddMovController controller;
    AddMov() {
    }
    public void show() throws IOException {
        loader = new FXMLLoader(getClass().getResource("addMov.fxml"));
        controller = new AddMovController();
        loader.setController(this.controller);

        Stage stage=new Stage();
        Parent root = loader.load();
        stage.setTitle("adding a movie");
        Scene scene = new Scene(root, 250, 350);
        scene.getStylesheets().add(getClass().getResource("logo.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
        //myProt.SetIpAndPort(controller.getip(),Integer.parseInt(controller.getport()));
    }
}


