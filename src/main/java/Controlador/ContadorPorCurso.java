package Controlador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Esta clase proporciona métodos para contar el número de estudiantes en diferentes cursos
 * Lee la información desde un archivo CSV llamado "Matrículas.csv"
 */
public class ContadorPorCurso {

    // ==================== ATRIBUTOS ====================
    public static final String nombreArchivo = "Matrículas.csv";





    // ================================ CONTADOR ALUMNOS DE 1° AÑO TOTALES ==========================

    /**
     * Cuenta el número total de estudiantes en 1° Medio
     * @return Número total de estudiantes en 1° Medio
     */
    public static int contarAlumnosPrimeroMedio() {
        int contadorPrimeroMedio        = 0;

        try {
            FileReader archivoLectura   = new FileReader(nombreArchivo);
            BufferedReader lector       = new BufferedReader(archivoLectura);
            String linea;

            // Omitir encabezados
            lector.readLine();

            while ((linea = lector.readLine()) != null) {
                String[] campos         = linea.split(",");
                if (campos.length >= 12) {
                    String cursoAlumno  = campos[11].trim();

                    if (cursoAlumno.equalsIgnoreCase("1°")) {
                        contadorPrimeroMedio++;
                    }
                }
            }
            archivoLectura.close();
            lector.close();
        } catch (IOException e) {
            System.err.println();
        }

        return contadorPrimeroMedio;
    }




    // ================================ CONTADOR ALUMNOS DE 2° MEDIO TOTALES ==========================

    /**
     * Cuenta el número total de estudiantes en 2° Medio
     * @return Número total de estudiantes en 2° Medio
     */
    public static int contarAlumnosSegundoMedio() {
        int contadorSegundoMedio        = 0;

        try {
            FileReader archivoLectura   = new FileReader(nombreArchivo);
            BufferedReader lector       = new BufferedReader(archivoLectura);
            String linea;

            // Omitir encabezados
            lector.readLine();

            while ((linea = lector.readLine()) != null) {
                String[] campos         = linea.split(",");
                if (campos.length >= 12) {
                    String cursoAlumno  = campos[11].trim();

                    if (cursoAlumno.equalsIgnoreCase("2°")) {
                        contadorSegundoMedio++;
                    }
                }
            }
            archivoLectura.close();
            lector.close();
        } catch (IOException e) {
            System.err.println();
        }

        return contadorSegundoMedio;
    }





    // ================================ CONTADOR ALUMNOS DE 3° MEDIO TOTALES ==========================

    /**
     * Cuenta el número total de estudiantes en 3° Medio
     * @return Número total de estudiantes en 3° Medio
     */
    public static int contarAlumnosTerceroMedio() {
        int contadorTerceroMedio        = 0;

        try {
            FileReader archivoLectura   = new FileReader(nombreArchivo);
            BufferedReader lector       = new BufferedReader(archivoLectura);
            String linea;

            // Omitir encabezados
            lector.readLine();

            while ((linea = lector.readLine()) != null) {
                String[] campos         = linea.split(",");
                if (campos.length >= 12) {
                    String cursoAlumno  = campos[11].trim();

                    if (cursoAlumno.equalsIgnoreCase("3°")) {
                        contadorTerceroMedio++;
                    }
                }
            }
            archivoLectura.close();
            lector.close();
        } catch (IOException e) {
            System.err.println();
        }

        return contadorTerceroMedio;
    }





    // ================================ CONTADOR ALUMNOS DE 4° MEDIO TOTALES ==========================

    /**
     * Cuenta el número total de estudiantes en 4° Medio
     * @return Número total de estudiantes en 4° Medio
     */
    public static int contarAlumnosCuartoMedio() {
        int contadorCuartoMedio         = 0;

        try {
            FileReader archivoLectura   = new FileReader(nombreArchivo);
            BufferedReader lector       = new BufferedReader(archivoLectura);
            String linea;

            // Omitir encabezados
            lector.readLine();

            while ((linea = lector.readLine()) != null) {
                String[] campos         = linea.split(",");
                if (campos.length >= 12) {
                    String cursoAlumno  = campos[11].trim();

                    if (cursoAlumno.equalsIgnoreCase("4°")) {
                        contadorCuartoMedio++;
                    }
                }
            }
            archivoLectura.close();
            lector.close();
        } catch (IOException e) {
            System.err.println();
        }

        return contadorCuartoMedio;
    }
}
