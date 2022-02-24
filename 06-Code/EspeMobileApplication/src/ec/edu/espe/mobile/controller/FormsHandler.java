/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.mobile.controller;

import ec.edu.espe.mobile.view.FrmEspeMobileApp;
import javax.swing.JFrame;

/**
 *
 * @author Juan Diego
 */
public class FormsHandler {
            public static void goToMainScreen(JFrame jFrameToClose){
        FrmEspeMobileApp frmEspeMobileApp  = new FrmEspeMobileApp ();
        jFrameToClose.setVisible(false);
        frmEspeMobileApp .setVisible(true);
            }
    
}
