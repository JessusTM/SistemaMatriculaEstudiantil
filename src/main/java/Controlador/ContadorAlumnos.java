package Controlador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * La clase `ContadorAlumnos` proporciona métodos para contar el número total de alumnos
 * basado en un archivo de matrículas en formato CSV
 */
public class ContadorAlumnos {

    // ==================== ATRIBUTOS ====================
    // nombre del archivo CSV que contiene la información de las matrículas.
    public static final String nombreArchivo = "Matrículas.csv";





    // ===================================== CONTADOR ALUMNOS TOTALES ================================

    /**
     * Cuenta el número total de alumnos registrados en el archivo de matrículas.
     * @return El número total de alumnos
     */
    public static int contarAlumnos() {
        int contador = 0;

        try {
            FileReader archivoLectura   = new FileReader(nombreArchivo);
            BufferedReader lector       = new BufferedReader(archivoLectura);
            String linea;

            // Omitir encabezados
            lector.readLine();

            while ((linea = lector.readLine()) != null) {
                contador++;
            }

            archivoLectura.close();
            lector.close();
        } catch (IOException e) {
            System.err.println(" Error al leer el archivo: " + e.getMessage());
        }

        return contador;
    }
}
