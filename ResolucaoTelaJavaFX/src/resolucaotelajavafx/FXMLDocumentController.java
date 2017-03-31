/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucaotelajavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Maicon
 */
public class FXMLDocumentController implements Initializable {
    
    
    // Para importar as configuracoes de resolucao de tela
    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension d = tk.getScreenSize();
    
        
       
    
    @FXML
    private Label lblResolucao;
    private Button btnClick;
    
    
    @FXML
    private void cliqueBotao(ActionEvent event) {
        
        lblResolucao.setText( d.width + "x" + d.height);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
