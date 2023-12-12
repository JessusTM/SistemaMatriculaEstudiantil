package Vista;

import Controlador.*;
import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;
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

public class GuiGraficos extends JDialog {
    // ========== ATRIBUTOS ==========
    // ----- PANEL -----
    private JPanel jpInicial;

    // ----- LABEL -----
    private JLabel jbelAlumnosTotales;
    private JLabel jbelTitulo;
    private JLabel lblPeopleIcon;
    private JLabel lblFlagIcon;

    // ----- BUTTON -----
    private JButton btnGraficaGenero;
    private JButton btnGraficoNacionalidad;
    private JButton btnVolver;
    private JButton btnGraficoCurso;

    // ----- PANEL ------
    private JPanel jpGraficaGenero;
    private JPanel jpGraficaNacionalidad;
    private JPanel jpGraficaCurso;



    // ========== CONSTRUCTOR ==========
    public GuiGraficos() {
        // ----- APARIENCIA -----
        try {
            UIManager.setLookAndFeel(new FlatDarkPurpleIJTheme());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        // ----- PROPIEDADES -----
        setContentPane(jpInicial);
        setVisible(true);
        setTitle("Estadísticas");
        setLocationRelativeTo(null);
        setModal(true);
        setSize(1050,850);
        setResizable(false);


        // ----- GRÁFICA GÉNERO -----
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

                JFreeChart grafico_circular = ChartFactory.createPieChart("Alumnos por género",datosContadores,true,true,false);

                ChartPanel panelGrafico     = new ChartPanel(grafico_circular);
                panelGrafico.setMouseWheelEnabled(true);
                panelGrafico.setSize(300,200);

                jpGraficaGenero.setLayout(new BorderLayout());
                jpGraficaGenero.add(panelGrafico,BorderLayout.CENTER);
                jpGraficaGenero.setSize(300,200);
            }
        });


        // ----- BOTÓN VOLVER -----
        btnVolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });


        // ----- GRÁFICO NACIONALIDAD -----
        btnGraficoNacionalidad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int contadorChilena             = ContadorPorNacionalidad.contarAlumnosChilenos();
                int contadorVenezolano          = ContadorPorNacionalidad.contarAlumnosVenezolanos();
                int contadorHaitiano            = ContadorPorNacionalidad.contarAlumnosHaitianos();
                int contadorOtraNacionalidad    = ContadorPorNacionalidad.contarAlumnosOtraNacionalidad();

                DefaultCategoryDataset datosNacionalidad = new DefaultCategoryDataset();

                datosNacionalidad.setValue(contadorChilena          ,"Cantidad","Chilena"       );
                datosNacionalidad.setValue(contadorVenezolano       ,"Cantidad","Venezolano"    );
                datosNacionalidad.setValue(contadorHaitiano         ,"Cantidad","Haitiano"      );
                datosNacionalidad.setValue(contadorOtraNacionalidad ,"Cantidad","Otros"         );

                JFreeChart grafico_nacionalidad = ChartFactory.createBarChart(
                        "Estadísticas de Nacionalidad",
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
                panelGrafico.setSize(300,200);

                jpGraficaNacionalidad.setLayout(new BorderLayout());
                jpGraficaNacionalidad.add(panelGrafico,BorderLayout.CENTER);
                jpGraficaNacionalidad.setSize(300,200);

            }
        });


        // ----- GRÁFICO CURSOS -----
        btnGraficoCurso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int contador1MEDIO = ContadorPorCurso.contarAlumnosPrimeroMedio();
                int contador2MEDIO = ContadorPorCurso.contarAlumnosSegundoMedio();
                int contador3MEDIO = ContadorPorCurso.contarAlumnosTerceroMedio();
                int contador4MEDIO = ContadorPorCurso.contarAlumnosCuartoMedio();

                DefaultPieDataset datosCursos = new DefaultPieDataset();
                datosCursos.setValue("1° Medio", contador1MEDIO);
                datosCursos.setValue("2° Medio", contador2MEDIO);
                datosCursos.setValue("3° Medio", contador3MEDIO);
                datosCursos.setValue("4° Medio", contador4MEDIO);

                JFreeChart grafico_circular = ChartFactory.createPieChart("Estadísticas de los Cursos", datosCursos, true, true, false);

                ChartPanel panelGrafico     = new ChartPanel(grafico_circular);
                panelGrafico.setMouseWheelEnabled(true);
                panelGrafico.setSize(300,200);

                jpGraficaCurso.setLayout(new BorderLayout());
                jpGraficaCurso.add(panelGrafico,BorderLayout.CENTER);
                jpGraficaCurso.setSize(300,200);
            }
        });

        int contadorTotal = ContadorAlumnos.contarAlumnos();
        jbelAlumnosTotales.setText("Alumnos matrículados: " + contadorTotal);
    }
}
