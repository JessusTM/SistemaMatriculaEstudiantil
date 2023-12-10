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
            BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo));
            String linea;

            // Omitir línea de encabezados
            boolean primeraLinea = true;
            while ((linea = lector.readLine()) != null) {
                if (primeraLinea) {
                    primeraLinea = false;
                    continue;
                }

                contador++;
            }
            lector.close();
        } catch (IOException e) {
            System.err.println(" Error al leer el archivo: " + e.getMessage());
        }

        return contador;
    }
}
