package Vista;

import Controlador.ContadorPorGenero;
import Controlador.ContadorPorNacionalidad;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class guiGraficos extends JDialog {
    private JPanel jpInicial;
    private JLabel jbelTitulo;
    private JButton btnGraficaGenero;
    private JButton btnGraficoNacionalidad;
    private JPanel jpGraficaGenero;
    private JPanel jpGraficaNacionalidad;
    private JButton btnVolver;


    public guiGraficos() {

        setContentPane(jpInicial);
        setVisible(true);
        setTitle("Estadisticas");
        setLocationRelativeTo(null);
        setModal(true);
        setSize(700,500);
        setResizable(false);


        btnGraficaGenero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int contadorMasculino   = ContadorPorGenero.contarAlumnosMasculinos();
                int contadorFemenino    = ContadorPorGenero.contarAlumnosFemeninos();
                int contadorOtros       = ContadorPorGenero.contarAlumnosOtrosGeneros();

                DefaultPieDataset datosContadores = new DefaultPieDataset();

                datosContadores.setValue("Masculino",contadorMasculino);
                datosContadores.setValue("Femenino",contadorFemenino);
                datosContadores.setValue("Otro",contadorOtros);

                JFreeChart grafico_circular = ChartFactory.createPieChart("Alumnos por genero",datosContadores,true,true,false);

                ChartPanel panelGrafico = new ChartPanel(grafico_circular);
                panelGrafico.setMouseWheelEnabled(true);
                panelGrafico.setSize(220,150);

                jpGraficaGenero.setLayout(new BorderLayout());
                jpGraficaGenero.add(panelGrafico,BorderLayout.CENTER);
                jpGraficaGenero.setSize(250,200);


            }
        });
        btnVolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        btnGraficoNacionalidad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int contadorChilena = ContadorPorNacionalidad.contarAlumnosChilenos();
                int contadorVenezolano = ContadorPorNacionalidad.contarAlumnosVenezolanos();
                int contadorHaitiano = ContadorPorNacionalidad.contarAlumnosHaitianos();
                int contadorOtraNacionalidad = ContadorPorNacionalidad.contarAlumnosOtraNacionalidad();

                DefaultCategoryDataset datosNacionalidad = new DefaultCategoryDataset();

                datosNacionalidad.setValue(contadorChilena,"Cantidad","Chilena");
                datosNacionalidad.setValue(contadorVenezolano,"Cantidad","Venezolano");
                datosNacionalidad.setValue(contadorHaitiano,"Cantidad","Haitiano");
                datosNacionalidad.setValue(contadorOtraNacionalidad,"Cantidad","Otros");

                JFreeChart grafico_nacionalidad = ChartFactory.createBarChart(
                        "Estadisticas de Nacionalidad",
                        "Nacionalidad",
                        "Cantidad",
                        datosNacionalidad,
                        PlotOrientation.VERTICAL,
                        true,
                        true,
                        false
                );

                ChartPanel panelGrafico = new ChartPanel(grafico_nacionalidad);
                panelGrafico.setMouseWheelEnabled(true);
                panelGrafico.setSize(220,150);

                jpGraficaNacionalidad.setLayout(new BorderLayout());
                jpGraficaNacionalidad.add(panelGrafico,BorderLayout.CENTER);
                jpGraficaNacionalidad.setSize(220,150);

            }
        });

    }

}
