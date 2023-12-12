package Launcher;

import Vista.*;
import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;

import javax.swing.*;

public class   Main {

    //==================== MAIN ====================
    public static void main(String[] args) {
        // ----- APARIENCIA -----
        try {
            UIManager.setLookAndFeel(new FlatDarkPurpleIJTheme());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        // ----- VENTANA PRINCIPAL -----
        GuiMenu menu = new GuiMenu();
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
    }
}

