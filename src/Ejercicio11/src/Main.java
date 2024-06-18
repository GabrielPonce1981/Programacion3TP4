import GUI.PantallaPrincipal;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        PantallaPrincipal pantalla = new PantallaPrincipal();
        pantalla.setVisible(true);
        pantalla.pack();
        pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}