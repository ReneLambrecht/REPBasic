/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rene.control;

import br.com.rene.view.PrincipalView;
import java.awt.Menu;
import javax.swing.JFrame;

/**
 *
 * @author PLASMAT
 */
public class IniciaSistema {
    
    public static void main(String[] args) {
    
        PrincipalView principal = PrincipalView.getIntancia();
        principal.setExtendedState(principal.getExtendedState()|JFrame.MAXIMIZED_BOTH);
        principal.setVisible(true);
    }
}
