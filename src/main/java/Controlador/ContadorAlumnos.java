package Controlador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContadorAlumnos {

    // ==================== ATRIBUTOS ====================
    public static final String nombreArchivo = "Matrículas.csv";





    // ===================================== CONTADOR ALUMNOS TOTALES ================================
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
