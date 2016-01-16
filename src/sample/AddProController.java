package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * Created by tohargilbar on 14/01/16.
 */
public class AddProController {
    @FXML
    MenuItem ioactor, iscreenwriter, iproducer, idirector;
    @FXML
    MenuItem imale, ifemale;
    @FXML
    MenuButton igender, itype;
    @FXML
    TextField iid, iage, iname, idescription;
    @FXML
    Button saveBtn;
    @FXML
    void initialize(){
        saveBtn.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                boolean flag = true;
                flag = !(iid.getText().isEmpty() || iage.getText().isEmpty() || iname.getText().isEmpty()
                        || idescription.getText().isEmpty());
                if(flag) {
                    // send data to server
                } else {
                    // print error
                }
            }
        });

    }

    }
