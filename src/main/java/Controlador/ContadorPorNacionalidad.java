package Controlador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContadorPorNacionalidad {

    // ==================== ATRIBUTOS ====================
    public static final String nombreArchivo = "Matrículas.csv";





    // ================================ CONTADOR ALUMNOS NACIONALIDAD: "CHILENA" TOTALES ==========================
    public static int contarAlumnosChilenos() {
        int contadorChilenos            = 0;

        try {
            FileReader archivoLectura   = new FileReader(nombreArchivo);
            BufferedReader lector       = new BufferedReader(archivoLectura);
            String linea;

            // Omitir encabezados
            lector.readLine();

            while ((linea = lector.readLine()) != null) {
                String[] campos         = linea.split(",");
                if (campos.length >= 9) {
                    String cursoAlumno  = campos[8].trim();

                    if (cursoAlumno.equalsIgnoreCase("Chilena")) {
                        contadorChilenos++;
                    }
                }
            }

            archivoLectura.close();
            lector.close();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        return contadorChilenos;
    }





    // ================================ CONTADOR ALUMNOS NACIONALIDAD: "VENEZOLANA" TOTALES ==========================
    public static int contarAlumnosVenezolanos() {
        int contadorVenezolanos         = 0;

        try {
            FileReader archivoLectura   = new FileReader(nombreArchivo);
            BufferedReader lector       = new BufferedReader(archivoLectura);
            String linea;

            // Omitir encabezados
            lector.readLine();

            while ((linea = lector.readLine()) != null) {
                String[] campos         = linea.split(",");
                if (campos.length >= 9) {
                    String cursoAlumno  = campos[8].trim();

                    if (cursoAlumno.equalsIgnoreCase("Venezolana")) {
                        contadorVenezolanos++;
                    }
                }
            }
            archivoLectura.close();
            lector.close();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        return contadorVenezolanos;
    }





    // ================================ CONTADOR ALUMNOS NACIONALIDAD: "HAITIANA" TOTALES ==========================
    public static int contarAlumnosHaitianos() {
        int contadorHaitianos           = 0;

        try {
            FileReader archivoLectura   = new FileReader(nombreArchivo);
            BufferedReader lector       = new BufferedReader(archivoLectura);
            String linea;

            // Omitir encabezados
            lector.readLine();

            while ((linea = lector.readLine()) != null) {
                String[] campos         = linea.split(",");
                if (campos.length >= 9) {
                    String cursoAlumno  = campos[8].trim();

                    if (cursoAlumno.equalsIgnoreCase("Haitiana")) {
                        contadorHaitianos++;
                    }
                }
            }


            archivoLectura.close();
            lector.close();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        return contadorHaitianos;
    }





    // ================================ CONTADOR ALUMNOS NACIONALIDAD: "OTRA NACIONALIDAD" TOTALES ==========================
    public static int contarAlumnosOtraNacionalidad() {
        int contadorOtraNacionalidad    = 0;

        try {
            FileReader archivoLectura   = new FileReader(nombreArchivo);
            BufferedReader lector       = new BufferedReader(archivoLectura);
            String linea;

            // Omitir encabezados
            lector.readLine();

            while ((linea = lector.readLine()) != null) {
                String[] campos         = linea.split(",");
                if (campos.length >= 9) {
                    String cursoAlumno  = campos[8].trim();

                    if (cursoAlumno.equalsIgnoreCase("Otra")) {
                        contadorOtraNacionalidad++;
                    }
                }
            }
            archivoLectura.close();
            lector.close();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        return contadorOtraNacionalidad;
    }
}
