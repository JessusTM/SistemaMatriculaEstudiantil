package Controlador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContadorPorGenero {

    // ==================== ATRIBUTOS ====================
    public static final String nombreArchivo = "Matrículas.csv";





    // ================================ CONTADOR ALUMNOS GENERO: "MASCULINOS" TOTALES ==========================
    public static int contarAlumnosMasculinos() {
        int contadorMasculinos = 0;

        try {
            BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo));
            String linea;

            // Omitir línea de encabezados
            boolean primeraLinea = true;
            while ((linea = lector.readLine()) != null) {
                if (primeraLinea) {
                    primeraLinea = false;
                    continue;
                }

                String[] campos = linea.split(",");
                if (campos.length >= 17) {
                    String generoAlumno = campos[16].trim();

                    if (generoAlumno.equalsIgnoreCase("masculino")) {
                        contadorMasculinos++;
                    }
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println(" Error al leer el archivo: " + e.getMessage());
        }

        return contadorMasculinos;
    }





    // ================================ CONTADOR ALUMNOS GENERO: "FEMENINOS" TOTALES ==========================
    public static int contarAlumnosFemeninos() {
        int contadorFemeninos = 0;

        try {
            BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo));
            String linea;

            // Omitir línea de encabezados
            boolean primeraLinea = true;
            while ((linea = lector.readLine()) != null) {
                if (primeraLinea) {
                    primeraLinea = false;
                    continue;
                }

                String[] campos = linea.split(",");
                if (campos.length >= 17) {
                    String generoAlumno = campos[16].trim();

                    if (generoAlumno.equalsIgnoreCase("femenino")) {
                        contadorFemeninos++;
                    }
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println(" Error al leer el archivo: " + e.getMessage());
        }

        return contadorFemeninos;
    }





    // ================================ CONTADOR ALUMNOS GENERO: "OTRO" TOTALES ==========================
    public static int contarAlumnosOtrosGeneros() {
        int contadorOtrosGeneros = 0;

        try {
            BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo));
            String linea;

            // Omitir línea de encabezados
            boolean primeraLinea = true;
            while ((linea = lector.readLine()) != null) {
                if (primeraLinea) {
                    primeraLinea = false;
                    continue;
                }

                String[] campos = linea.split(",");
                if (campos.length >= 17) {
                    String generoAlumno = campos[16].trim();

                    if (generoAlumno.equalsIgnoreCase("otro")) {
                        contadorOtrosGeneros++;
                    }
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println(" Error al leer el archivo: " + e.getMessage());
        }

        return contadorOtrosGeneros;
    }

}
