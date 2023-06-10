/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minhaescola;

import controller.GuiController;

/**
 *
 * @author Allan Neves Melquíades Silva
 */
public class MinhaEscola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GuiController guiController = GuiController.getInstance();
        guiController.abrirMenu();
    }

}
