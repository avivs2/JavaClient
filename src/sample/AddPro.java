package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by tohargilbar on 14/01/16.
 */
public class AddPro {
    private FXMLLoader loader;
    private AddProController controller;
    AddPro() {
    }
    public void show(Communicator myProt) throws IOException {
        loader = new FXMLLoader(getClass().getResource("addPro.fxml"));
        controller = new AddProController();
        loader.setController(this.controller);

        Stage stage=new Stage();
        Parent root = loader.load();
        stage.setTitle("adding a profesional");
        Scene scene = new Scene(root, 250, 300);
        scene.getStylesheets().add(getClass().getResource("logo.css").toExternalForm());
        stage.setScene(scene);
        stage.showAndWait();
        //myProt.SetIpAndPort(controller.getip(),Integer.parseInt(controller.getport()));
    }
}
