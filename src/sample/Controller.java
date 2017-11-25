package sample;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;

import static java.lang.Integer.parseInt;

/**
 * Created by DELL INC on 22/11/2017.
 */
public class Controller implements Initializable {

    @FXML
    Button InsertarBtn,BuscarBtn,ExtraerBtn,TamañoBtn,VaciarBtn;
    @FXML
    TextField insertarTxt,BuscarTxt;
    @FXML
    Label TamañoLB;
    @FXML
    ListView ColaLV;

    public Cola cola=new Cola();



    @Override
    public void initialize(URL location, ResourceBundle resources) {


    }
public void asd (ListView listView, int valor){
        listView.getSelectionModel().select(valor);
        listView.getFocusModel().focus(valor);
        listView.scrollTo(valor);
}



}




