package Vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class fmrMenu extends JFrame {
    private JButton btnAgregarAlumno;
    private JButton btnInstitucion;
    private JPanel  Menu;
    private JButton btnSalir;


    // ========== CONSTRUCTOR ==========
    public fmrMenu(){

        setSize(1024, 768);
        setLocationRelativeTo(null);
        setTitle("Menú");
        setContentPane(Menu);


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