package Controlador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContadorPorNacionalidad {

    // ==================== ATRIBUTOS ====================
    public static final String nombreArchivo = "Matrículas.csv";





    // ================================ CONTADOR ALUMNOS NACIONALIDAD: "CHILENA" TOTALES ==========================
    public static int contarAlumnosChilenos() {
        int contadorChilenos = 0;

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
                if (campos.length >= 9) {
                    String nacionalidadAlumno = campos[8].trim();

                    if (nacionalidadAlumno.equalsIgnoreCase("Chilena")) {
                        contadorChilenos++;
                    }
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        return contadorChilenos;
    }





    // ================================ CONTADOR ALUMNOS NACIONALIDAD: "VENEZOLANA" TOTALES ==========================
    public static int contarAlumnosVenezolanos() {
        int contadorVenezolanos = 0;

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
                if (campos.length >= 9) {
                    String nacionalidadAlumno = campos[8].trim();

                    if (nacionalidadAlumno.equalsIgnoreCase("Venezolana")) {
                        contadorVenezolanos++;
                    }
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        return contadorVenezolanos;
    }





    // ================================ CONTADOR ALUMNOS NACIONALIDAD: "HAITIANA" TOTALES ==========================
    public static int contarAlumnosHaitianos() {
        int contadorHaitianos = 0;

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
                if (campos.length >= 9) {
                    String nacionalidadAlumno = campos[8].trim();

                    if (nacionalidadAlumno.equalsIgnoreCase("Haitiana")) {
                        contadorHaitianos++;
                    }
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        return contadorHaitianos;
    }





    // ================================ CONTADOR ALUMNOS NACIONALIDAD: "OTRA NACIONALIDAD" TOTALES ==========================
    public static int contarAlumnosOtraNacionalidad() {
        int contadorOtraNacionalidad = 0;

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
                if (campos.length >= 9) {
                    String nacionalidadAlumno = campos[8].trim();

                    if (nacionalidadAlumno.equalsIgnoreCase("Otra")) {
                        contadorOtraNacionalidad++;
                    }
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        return contadorOtraNacionalidad;
    }
}
