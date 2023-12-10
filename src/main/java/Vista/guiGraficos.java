package Vista;

import Controlador.Controlador;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class guiGraficos extends JDialog {
    private JPanel jpInicial;
    private JLabel jbelTitulo;
    private JButton btnGraficaGenero;
    private JButton btnGraficoNose;
    private JPanel jpGraficaGenero;
    private JPanel jpGraficaNoSe;
    private JButton btnVolver;


    public guiGraficos() {

        setContentPane(jpInicial);
        setVisible(true);
        setTitle("Estadisticas");
        setLocationRelativeTo(null);
        setModal(true);
        setSize(1000,700);
        setResizable(false);


        btnGraficaGenero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int contadorMasculino = Controlador.contarAlumnosMasculinos();
                int contadorFemenino = Controlador.contarAlumnosFemeninos();
                int contadorOtros = Controlador.contarAlumnosOtrosGeneros();

                DefaultPieDataset datosContadores = new DefaultPieDataset();

                datosContadores.setValue("Masculino",contadorMasculino);
                datosContadores.setValue("Femenino",contadorFemenino);
                datosContadores.setValue("Otro",contadorOtros);

                JFreeChart grafico_circular = ChartFactory.createPieChart("Alumnos por genero",datosContadores,true,true,false);

                ChartPanel panelGrafico = new ChartPanel(grafico_circular);
                panelGrafico.setMouseWheelEnabled(true);
                panelGrafico.setSize(300,200);

                jpGraficaGenero.setLayout(new BorderLayout());
                jpGraficaGenero.add(panelGrafico,BorderLayout.NORTH);
                jpGraficaGenero.setSize(300,200);




            }
        });
        btnVolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

}
