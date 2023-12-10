package Vista;

import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class guiMenu extends JFrame {
    private JButton btnAgregarAlumno;
    private JButton btnEstadisticas;
    private JPanel  Menu;
    private JButton btnSalir;
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
    public guiMenu(){
        //APARIENCIA FLATLAF
        try {
            UIManager.setLookAndFeel(new FlatDarkPurpleIJTheme()); // Configura el tema
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        //TAMAÑO NO CAMBIABLE
        setMinimumSize(new Dimension(600, 400));
        setLocationRelativeTo(null);
        setTitle("Menú");
        setContentPane(Menu);
        setResizable(false);


        // ----- BOTÓN CAMBIO DE VENTANA A AGREGAR ALUMNO -----
        btnAgregarAlumno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fmrAgregarAlumnos ventana = new fmrAgregarAlumnos();
                ventana.setVisible(true);
                ventana.setSize(400, 300);
                ventana.setLocationRelativeTo(null);
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
                new guiGraficos();
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