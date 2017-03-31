/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horasistemajavafx;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Maicon
 */
public class FXMLDocumentController implements Initializable {
    
    //Resebendo Horario Sistema
    Date horasistema = new Date();
   
    
    @FXML
    private Label lblHora;
    private Button btnClick;
    
    @FXML
    private void cliqueBotao(ActionEvent event) {
        lblHora.setText(horasistema.toString());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
