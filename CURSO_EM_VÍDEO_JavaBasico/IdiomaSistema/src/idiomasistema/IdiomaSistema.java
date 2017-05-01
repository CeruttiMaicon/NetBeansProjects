/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Programa em Java que vai mostrar qual o idioma do sistema
 */
package idiomasistema;

import java.util.Locale;

/**
 *
 * @author Maicon
 */
public class IdiomaSistema {

    
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.println("O idioma do Sistema Operacional é");
        System.out.println(loc.getDisplayLanguage());
    
    }
    
}
