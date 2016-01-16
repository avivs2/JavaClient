package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by אביב on 1/16/2016.
 */
public class Error {
    private FXMLLoader loader;
    private AddProController controller;
    Error(){

    }
    public void show() throws IOException {
        loader = new FXMLLoader(getClass().getResource("error.fxml"));
        controller = new AddProController();
        loader.setController(this.controller);

        Stage stage=new Stage();
        Parent root = loader.load();
        stage.setTitle("Error");
        Scene scene = new Scene(root, 100 , 50);

        stage.setScene(scene);
        stage.showAndWait();
        //myProt.SetIpAndPort(controller.getip(),Integer.parseInt(controller.getport()));
    }
}
