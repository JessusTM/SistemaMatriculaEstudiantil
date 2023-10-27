package Vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class fmrMenu extends JFrame {
    private JButton btnAgregarAlumno;
    private JButton btnInstitucion;
    private JPanel Menu;
    private JButton btnSalir;


    // ========== CONSTRUCTOR ==========
    public fmrMenu(){

        // ----- APARIENCIA WINDOWS -----
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        // ------------------------------




        // TAMAÑO
        setSize(1024, 768);
        // POSICIÓN AL MEDIO
        setLocationRelativeTo(null);
        // TÍTULO VENTANA
        setTitle("Menú");
        // DISEÑO DE VENTANA DEL PANEL MENU
        setContentPane(Menu);



        // ----- BOTÓN CAMBIO DE VENTANA A AGREGAR ALUMNO -----
        btnAgregarAlumno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // OBJETO DE LA VENTANA QUE QUEREMOS ABRIR
                fmrAgregarAlumnos ventana = new fmrAgregarAlumnos();
                // SE MUESTRA
                ventana.setVisible(true);
                // TAMAÑO
                ventana.setSize(400, 300);
                // CENTRAMOS
                ventana.setLocationRelativeTo(null);
            }
        });



        // ----- BOTÓN TERMINAR PROGRAMA  -----
        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });



        // ----- BOTÓN INSTITUCIÓN -----
        btnInstitucion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, " Ventana en trabajo... ");
            }
        });
    }
}