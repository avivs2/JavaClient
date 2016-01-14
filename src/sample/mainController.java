package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class mainController {
    private TCP myProt;
    @FXML
    Button logoBtn;

    @FXML
    void initialize(){
        myProt=new TCP();
        logoBtn.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                logoController lg=new logoController();
                try {
                    lg.show(myProt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println(myProt.getPort());
    }

}
