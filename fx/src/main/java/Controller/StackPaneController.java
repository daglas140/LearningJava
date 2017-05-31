package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class StackPaneController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button b_pokaz;

    @FXML
    void initialize() {
        assert b_pokaz != null : "fx:id=\"b_pokaz\" was not injected: check your FXML file 'StackPaneWindow.fxml'.";

    }
    @FXML
    public void pokazNapis(){
    	System.out.println("No dzieñdobry");
    }
}