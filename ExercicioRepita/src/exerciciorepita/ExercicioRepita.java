/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;


/**
 *
 * @author Maicon
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "olá mundo", "Boas Vindas", JOptionPane.ERROR_MESSAGE );
        int n;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número: "
                    + "(valor 0 interrompe)"));
            
        } while (n != 0);
    }
    
}
