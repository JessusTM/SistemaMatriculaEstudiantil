package Vista;

import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GuiMenu extends JFrame {
    // ========== ATRIBUTOS ==========
    // ----- PANEL -----
    private JPanel  Menu;

    // ----- BUTTON -----
    private JButton btnSalir;
    private JButton btnAgregarAlumno;
    private JButton btnEstadisticas;

    // ----- LBL -----
    private JLabel lblAgregar;
    private JLabel lblStats;
    private JLabel lblClose;
    private JLabel lblLaGranja;
    private JLabel lblDirector;
    private JLabel lblNombreDirector;
    private JLabel lblFono;
    private JLabel lblFonoNum;
    private JLabel lblRbd;
    private JLabel lblRbdNum;



    // ========== CONSTRUCTOR ==========
    public GuiMenu(){
        // ----- APARIENCIA -----
        try {
            UIManager.setLookAndFeel(new FlatDarkPurpleIJTheme()); // Configura el tema
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        // ----- PROPIEDADES -----
        setTitle("Menú");
        setLocationRelativeTo(null);
        setSize(600,400);
        setResizable(false);
        setContentPane(Menu);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);


        // ----- BOTÓN CAMBIO DE VENTANA A AGREGAR ALUMNO -----
        btnAgregarAlumno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FmrAgregarAlumnos ventana = new FmrAgregarAlumnos();
                ventana.setLocationRelativeTo(null);
                ventana.setVisible(true);
            }
        });


        // ----- BOTÓN TERMINAR PROGRAMA -----
        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cerrarVentana();
            }
        });


        // ----- BOTÓN INSTITUCIÓN -----
        btnEstadisticas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiGraficos ventana = new GuiGraficos();
                ventana.setLocationRelativeTo(null);
            }
        });
    }





    // # ======================================== MÉTODOS ======================================== #
    // -------------------- Confirmar cerrar ventana --------------------
    private void cerrarVentana() {
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas salir?", "Salir", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
}