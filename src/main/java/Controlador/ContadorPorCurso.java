package Controlador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ContadorPorCurso {

    // ==================== ATRIBUTOS ====================
    public static final String nombreArchivo = "Matrículas.csv";





    // ================================ CONTADOR ALUMNOS DE 1° AÑO TOTALES ==========================
    public static int contarAlumnosPrimeroMedio() {
        int contadorPrimeroMedio    = 0;

        try {
            BufferedReader lector   = new BufferedReader(new FileReader(nombreArchivo));
            String linea;

            // Omitir línea de encabezados
            boolean primeraLinea    = true;
            while ((linea = lector.readLine()) != null) {
                if (primeraLinea) {
                    primeraLinea    = false;
                    continue;
                }

                String[] campos = linea.split(",");
                if (campos.length >= 12) {
                    String cursoAlumno = campos[11].trim();

                    if (cursoAlumno.equalsIgnoreCase("1°")) {
                        contadorPrimeroMedio++;
                    }
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        return contadorPrimeroMedio;
    }




    // ================================ CONTADOR ALUMNOS DE 2° MEDIO TOTALES ==========================
    public static int contarAlumnosSegundoMedio() {
        int contadorSegundoMedio    = 0;

        try {
            BufferedReader lector   = new BufferedReader(new FileReader(nombreArchivo));
            String linea;

            // Omitir línea de encabezados
            boolean primeraLinea    = true;
            while ((linea = lector.readLine()) != null) {
                if (primeraLinea) {
                    primeraLinea    = false;
                    continue;
                }

                String[] campos = linea.split(",");
                if (campos.length >= 12) {
                    String cursoAlumno = campos[11].trim();

                    if (cursoAlumno.equalsIgnoreCase("2°")) {
                        contadorSegundoMedio++;
                    }
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        return contadorSegundoMedio;
    }





    // ================================ CONTADOR ALUMNOS DE 3° MEDIO TOTALES ==========================
    public static int contarAlumnosTerceroMedio() {
        int contadorTerceroMedio    = 0;

        try {
            BufferedReader lector   = new BufferedReader(new FileReader(nombreArchivo));
            String linea;

            // Omitir línea de encabezados
            boolean primeraLinea    = true;
            while ((linea = lector.readLine()) != null) {
                if (primeraLinea) {
                    primeraLinea    = false;
                    continue;
                }

                String[] campos     = linea.split(",");
                if (campos.length >= 12) {
                    String cursoAlumno = campos[11].trim();

                    if (cursoAlumno.equalsIgnoreCase("3°")) {
                        contadorTerceroMedio++;
                    }
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        return contadorTerceroMedio;
    }





    // ================================ CONTADOR ALUMNOS DE 4° MEDIO TOTALES ==========================

    public static int contarAlumnosCuartoMedio() {
        int contadorCuartoMedio     = 0;

        try {
            BufferedReader lector   = new BufferedReader(new FileReader(nombreArchivo));
            String linea;

            // Omitir línea de encabezados
            boolean primeraLinea    = true;
            while ((linea = lector.readLine()) != null) {
                if (primeraLinea) {
                    primeraLinea    = false;
                    continue;
                }

                String[] campos     = linea.split(",");
                if (campos.length >= 12) {
                    String cursoAlumno = campos[11].trim();

                    if (cursoAlumno.equalsIgnoreCase("4° Medio")) {
                        contadorCuartoMedio++;
                    }
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        return contadorCuartoMedio;
    }
}
