/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomadosistemajavafx;

import java.net.URL;
import java.util.Locale;
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
    
    //Identifica o Idioma do Sistema Operacional
    Locale loc = Locale.getDefault();
        
    
    
    
    @FXML
    private Label lblIdioma;
    private Button btnClick;
    
    @FXML
    private void cliqueBotao(ActionEvent event) {
        
        lblIdioma.setText(loc.getDisplayLanguage());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
