package Launcher;

import Vista.*;
import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;

import javax.swing.*;

public class Main {

    //==================== MAIN ====================
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatDarkPurpleIJTheme()); // Configura el tema
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        fmrMenu menu = new fmrMenu();
        menu.setVisible(true);
    }
}

