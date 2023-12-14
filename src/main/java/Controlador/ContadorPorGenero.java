package Controlador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * La clase ContadorPorGenero proporciona métodos para contar el número de estudiantes
 * según su género a partir de un archivo de matrículas en formato CSV
 */
public class ContadorPorGenero {

    // ==================== ATRIBUTOS ====================
    /**
     * Nombre del archivo de matrículas en formato CSV.
     */
    public static final String nombreArchivo = "Matrículas.csv";





    // ================================ CONTADOR ALUMNOS GENERO: "MASCULINOS" TOTALES ==========================

    /**
     * Cuenta el número total de estudiantes masculinos en el archivo de matrículas
     * @return El número total de estudiantes masculinos
     */
    public static int contarAlumnosMasculinos() {
        int contadorMasculinos          = 0;

        try {
            FileReader archivoLectura   = new FileReader(nombreArchivo);
            BufferedReader lector       = new BufferedReader(archivoLectura);
            String linea;

            // Omitir encabezados
            lector.readLine();

            while ((linea = lector.readLine()) != null) {
                String[] campos         = linea.split(",");
                if (campos.length >= 17) {
                    String cursoAlumno  = campos[16].trim();

                    if (cursoAlumno.equalsIgnoreCase("masculino")) {
                        contadorMasculinos++;
                    }
                }
            }

            archivoLectura.close();
            lector.close();
        } catch (IOException e) {
            System.err.println();
        }

        return contadorMasculinos;
    }





    // ================================ CONTADOR ALUMNOS GENERO: "FEMENINOS" TOTALES ==========================

    /**
     * Cuenta el número total de estudiantes femeninos en el archivo de matrículas
     * @return El número total de estudiantes femeninos
     */
    public static int contarAlumnosFemeninos() {
        int contadorFemeninos           = 0;

        try {
            FileReader archivoLectura   = new FileReader(nombreArchivo);
            BufferedReader lector       = new BufferedReader(archivoLectura);
            String linea;

            // Omitir encabezados
            lector.readLine();

            while ((linea = lector.readLine()) != null) {
                String[] campos         = linea.split(",");
                if (campos.length >= 17) {
                    String cursoAlumno  = campos[16].trim();

                    if (cursoAlumno.equalsIgnoreCase("femenino")) {
                        contadorFemeninos++;
                    }
                }
            }

            archivoLectura.close();
            lector.close();
        } catch (IOException e) {
            System.err.println();
        }

        return contadorFemeninos;
    }





    // ================================ CONTADOR ALUMNOS GENERO: "OTRO" TOTALES ==========================

    /**
     * Cuenta el número total de estudiantes con género "otro" en el archivo de matrículas
     * @return El número total de estudiantes con género "otro"
     */
    public static int contarAlumnosOtrosGeneros() {
        int contadorOtrosGeneros        = 0;

        try {
            FileReader archivoLectura   = new FileReader(nombreArchivo);
            BufferedReader lector       = new BufferedReader(archivoLectura);
            String linea;

            // Omitir encabezados
            lector.readLine();

            while ((linea = lector.readLine()) != null) {
                String[] campos         = linea.split(",");
                if (campos.length >= 17) {
                    String generoAlumno = campos[16].trim();

                    if (generoAlumno.equalsIgnoreCase("otro")) {
                        contadorOtrosGeneros++;
                    }
                }
            }
            archivoLectura.close();
            lector.close();
        } catch (IOException e) {
            System.err.println();
        }

        return contadorOtrosGeneros;
    }
}
