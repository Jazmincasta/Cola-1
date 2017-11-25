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
        this.InsertarBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    int numero = Integer.parseInt(insertarTxt.getText());
                    ColaLV.getItems().addAll(cola.insertar(numero));
                    insertarTxt.clear();
                } catch (Exception e) {
                }
            }
        }
        );

        this.BuscarBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                try {
                    int bus = parseInt(BuscarTxt.getText());
                    cola.busqueda(bus);
                    asd (ColaLV,cola.getI());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Ingresa números en el recuadro");
                }

            }
        });
    }
public void asd (ListView listView, int valor){
        listView.getSelectionModel().select(valor);
        listView.getFocusModel().focus(valor);
        listView.scrollTo(valor);
}



}




