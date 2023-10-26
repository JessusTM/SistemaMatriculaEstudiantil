package Controlador;

import Clases.Alumno;
import Clases.Apoderado;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controlador {

    // ========== ATRIBUTOS ==========
    public static final String nombreArchivo = "Matriculas.csv";



    // ========== AGREGAR ALUMNO CSV ==========
    public static void agregarAlumnoCSV(Alumno nuevoAlumno) {
        try {
            File archivo = new File(nombreArchivo);

            // ----- SI EL ARCHIVO NO EXISTE-----
            if (!archivo.exists()) {
                BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo));

                // ----- Encabezados -----
                escritor.write( " [ALUMNO] Rut, [ALUMNO] Nombres, [ALUMNO] Apellidos, " +
                        " [ALUMNO] Edad, [ALUMNO] Fecha nacimiento, [ALUMNO] Email, " +
                        " [ALUMNO] Ciudad, [ALUMNO] Teléfono, [ALUMNO] Nacionalidad, " +
                        " [ALUMNO] Fecha Matrícula, [ALUMNO] Dirección, [ALUMNO] Curso, " +
                        " [ALUMNO] Letra, [ALUMNO] Electivo, [ALUMNO] Enfermedades, " +
                        " [ALUMNO] Matrícula, [ALUMNO] Fecha matrícula, [ALUMNO] Institución de origen, " +
                        " [ALUMNO] Enfermedades, [ALUMNO] Datos Adicionales, [ALUMNO] Género, " +
                        " [APODERADO] Rut, [APODERADO] Nombres, [APODERADO] Apellidos, " +
                        " [APODERADO] Paréntesco, [APODERADO] Teléfono, [APODERADO] Email, " +
                        " [APODERADO] Ciudad, [APODERADO] Situación laboral, [APODERADO] Escolaridad, " +
                        " [APODERADO] Dirección, [APODERADO] Observaciones");

                // Nueva línea después del encabezado
                escritor.newLine();
                escritor.close();
            }



            // ----- ATRIBUTOS ALUMNO -----
            String rutAlumno                    = nuevoAlumno.getRut();
            String nombresAlumno                = nuevoAlumno.getNombres();
            String apellidosAlumno              = nuevoAlumno.getApellidos();
            String edadAlumno                   = nuevoAlumno.getEdad();
            String fechaNacimientoAlumno        = nuevoAlumno.getFechaNacimiento();
            String emailAlumno                  = nuevoAlumno.getEmail();
            String ciudadAlumno                 = nuevoAlumno.getCiudad();
            String telefonoAlumno               = nuevoAlumno.getTelefono();
            String nacionalidadAlumno           = nuevoAlumno.getNacionalidad();
            String fechaMatriculaAlumno         = nuevoAlumno.getFechaMatricula();
            String direccionAlumno              = nuevoAlumno.getDireccion();
            String cursoAlumno                  = nuevoAlumno.getCurso();
            String letraCursoAlumno             = nuevoAlumno.getLetra();
            String electivoAlumno               = nuevoAlumno.getElectivo();
            String enfermedadesAlumno           = nuevoAlumno.getEnfermedades();
            String datosAdicionalesAlumno       = nuevoAlumno.getDatosAdicionales();
            String generoAlumno                 = nuevoAlumno.getGenero();




            // ----- ATRIBUTOS APODERADO -----
            Apoderado apoderado = nuevoAlumno.getNuevoApoderado();
            String rutApoderado                 = apoderado.getRut();
            String nombresApoderado             = apoderado.getNombres();
            String apellidosApoderado           = apoderado.getApellidos();
            String parentescoApoderado          = apoderado.getParentesco();
            String telefonoApoderado            = apoderado.getTelefono();
            String ciudadApoderado              = apoderado.getCiudad();
            String direccionApoderado           = apoderado.getDireccion();
            String observacionesApoderado       = apoderado.getObservaciones();


            // Agregar datos al final del archivo en modo append
            BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo, true));

            escritor.write( rutAlumno                   + "," + nombresAlumno               + "," + apellidosAlumno             + "," + edadAlumno                  + "," +
                    fechaNacimientoAlumno       + "," + emailAlumno                 + "," + ciudadAlumno                + "," + telefonoAlumno              + "," +
                    nacionalidadAlumno          + "," + fechaMatriculaAlumno        + "," + direccionAlumno             + "," + cursoAlumno                 + "," +
                    letraCursoAlumno            + "," + electivoAlumno              + "," + enfermedadesAlumno          + "," + datosAdicionalesAlumno      + "," +
                    generoAlumno                + "," + rutApoderado                + "," + nombresApoderado            + "," + apellidosApoderado          + "," +
                    parentescoApoderado         + "," + telefonoApoderado           + "," + ciudadApoderado             + "," + direccionApoderado          + "," +
                    observacionesApoderado);


            // ----- NUEVA LÍNEA DESPUÉS PARA AGREGAR UN ALUMNO -----
            escritor.newLine();
            escritor.close();

        } catch (IOException e) {
            System.out.println("Error al registrar: " + e.getMessage());
        }
    }



    //==================== MOSTRAR ALUMNOS CSV ====================
    public static List<Object[]> listadoAlumnos(String filtroRut) {
        List<Object[]> alumnosData  = new ArrayList<>();

        try {
            BufferedReader lector   = new BufferedReader(new FileReader(nombreArchivo));
            String linea;

            boolean primeraLinea    = true;

            while ((linea = lector.readLine()) != null) {
                if (primeraLinea) {
                    primeraLinea    = false;
                    continue;
                }

                String[] campos = linea.split(",");

                if (campos.length >= 1) {
                    String rutAlumno                = campos[0].trim();
                    String nombresAlumno            = campos[1].trim();
                    String apellidosAlumno          = campos[2].trim();
                    String edadAlumno               = campos[3].trim();
                    String fechaNacimientoAlumno    = campos[4].trim();
                    String emailAlumno              = campos[5].trim();
                    String ciudadAlumno             = campos[6].trim();
                    String telefonoAlumno           = campos[7].trim();
                    String nacionalidadAlumno       = campos[8].trim();
                    String fechaMatriculaAlumno     = campos[9].trim();
                    String direccionAlumno          = campos[10].trim();
                    String cursoAlumno              = campos[11].trim();
                    String letraAlumno              = campos[12].trim();
                    String electivoAlumno           = campos[13].trim();
                    String enfermedadesAlumno       = campos[14].trim();
                    String datosAdicionalesAlumno   = campos[15].trim();
                    String generoAlumno             = campos[16].trim();



                    // Si se proporciona un filtroRut, solo agrega la información del
                    // alumno al resultado si el rut coincide con el filtro

                    // Si no se proporciona ningún filtro, se agregan todos los alumnos.
                    if (filtroRut == null || rutAlumno.equals(filtroRut)) {
                        Object[] rowData = {    rutAlumno               , nombresAlumno             , apellidosAlumno           , edadAlumno                    ,
                                fechaNacimientoAlumno   , emailAlumno               , ciudadAlumno              , telefonoAlumno                ,
                                nacionalidadAlumno      , fechaMatriculaAlumno      , direccionAlumno           , cursoAlumno                   ,
                                letraAlumno             , electivoAlumno            , enfermedadesAlumno        , datosAdicionalesAlumno        ,
                                generoAlumno};

                        alumnosData.add(rowData);
                    }
                }
            }
            lector.close();

        } catch (IOException e) {
            System.err.println("Hubo un error al leer el archivo: " + e.getMessage());
        }

        return alumnosData;
    }



    // ==================== ELIMINAR ALUMNO ====================
    public static void eliminarAlumnoCSV(String rutEstudiante) {
        try {
            File archivo = new File(nombreArchivo);

            // Verificar si el archivo existe
            if (!archivo.exists()) {
                JOptionPane.showMessageDialog(null, "El archivo de matrículas no existe.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }


            Scanner lector                  = new Scanner(archivo);
            File archivoTemp                = new File(nombreArchivo + ".temp");
            BufferedWriter escritor         = new BufferedWriter(new FileWriter(archivoTemp));

            boolean estudianteEncontrado    = false;

            while (lector.hasNextLine()) {
                String linea = lector.nextLine();


                if (linea.contains("," + rutEstudiante + ",")) {
                    estudianteEncontrado = true;
                } else {
                    escritor.write(linea);
                    escritor.newLine();
                }
            }

            lector.close();
            escritor.close();

            // Eliminar el archivo original y renombrar el temporal
            archivo.delete();
            archivoTemp.renameTo(archivo);

            if (estudianteEncontrado) {
                JOptionPane.showMessageDialog(null, "El estudiante de RUT " + rutEstudiante + " fue eliminado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un estudiante con el RUT " + rutEstudiante, "Advertencia", JOptionPane.WARNING_MESSAGE);
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Hubo un error al eliminar el estudiante: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
