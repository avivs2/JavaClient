package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

/**
 * Created by אביב on 1/16/2016.
 */
public class AddMovController {
    @FXML
    TextField idField,nameField,lengthField,yearField,ratingField;


    @FXML
    Button saveBtn;

    @FXML
    void initialize(){
        saveBtn.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                boolean flag=true;
                flag=!(idField.getText().isEmpty()|| nameField.getText().isEmpty()||lengthField.getText().isEmpty()
                        ||yearField.getText().isEmpty()||ratingField.getText().isEmpty());
                Error er=new Error();
//                try {
//                    er.show();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//                if(!flag){
//                    //one of the fields empty
//                    //Error er=new Error();
//                    try {
//                        er.show();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
            }
        });


    }
}
