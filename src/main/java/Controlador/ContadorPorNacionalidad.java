package Controlador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * La clase ContadorPorNacionalidad proporciona métodos para contar el número de estudiantes
 * según su nacionalidad en un archivo CSV de matrículas.
 */
public class ContadorPorNacionalidad {

    // ==================== ATRIBUTOS ====================
    /**
     * Nombre del archivo CSV de matrículas
     */
    public static final String nombreArchivo = "Matrículas.csv";





    // ================================ CONTADOR ALUMNOS NACIONALIDAD: "CHILENA" TOTALES ==========================

    /**
     * Cuenta el número total de estudiantes chilenos en el archivo CSV de matrículas
     * @return Numero total de estudiantes chilenos
     */
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
            System.err.println();
        }

        return contadorChilenos;
    }





    // ================================ CONTADOR ALUMNOS NACIONALIDAD: "VENEZOLANA" TOTALES ==========================

    /**
     * Cuenta el número total de estudiantes venezolanos en el archivo CSV de matrículas
     * @return Número total de estudiantes venezolanos.
     */
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
            System.err.println();
        }

        return contadorVenezolanos;
    }





    // ================================ CONTADOR ALUMNOS NACIONALIDAD: "HAITIANA" TOTALES ==========================

    /**
     * Cuenta el número total de estudiantes haitianos en el archivo CSV de matrículas
     * @return Número total de estudiantes haitianos
     */
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
            System.err.println();
        }

        return contadorHaitianos;
    }





    // ================================ CONTADOR ALUMNOS NACIONALIDAD: "OTRA NACIONALIDAD" TOTALES ==========================

    /**
     * Cuenta el número total de estudiantes con otra nacionalidad en el archivo CSV de matrículas
     * @return Número total de estudiantes con otra nacionalidad
     */
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
            System.err.println();
        }

        return contadorOtraNacionalidad;
    }
}
