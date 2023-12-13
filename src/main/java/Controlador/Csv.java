package Controlador;

import Clases.*;
import Vista.*;
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * La clase Csv se encarga de manejar la lectura y escritura de datos en formato CSV (Comma-Separated Values)
 */
public class Csv {

    // ==================== ATRIBUTOS ====================
    // Nombre del archivo CSV utilizando para almacenar las matriculas
    public static final String nombreArchivo = "Matrículas.csv";





    /**
     * Agrega un nuevo alumno al archivo CSV de matrículas.
     * @param nuevoAlumno Objeto Alumno a agregar
     */
    // ==================== AGREGAR ALUMNO CSV ====================
    public static void agregarAlumnoCSV(Alumno nuevoAlumno) {
        // Verificar si ya existe un alumno con el mismo RUT
        if (existeAlumnoConRut(nuevoAlumno.getRut())) {
            JOptionPane.showMessageDialog(null, " Ya hay un Alumno registrado con el rut: " + nuevoAlumno.getRut(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // -→ Si el archivo no existe
        crearArchivo();

        // -→ Si el archivo ya existe
        try {
            File archivo = new File(nombreArchivo);

            // ----- Atributos Alumno -----
            String atributosAlumno      = atributosAlumno(nuevoAlumno);

            // ----- Atributos Apoderado -----
            String atributosApoderado   = atributosApoderado(nuevoAlumno.getNuevoApoderado());

            // ----- Agregar datos a el archivo en modo append -----
            FileWriter fileWriter       = new FileWriter(nombreArchivo, true);
            BufferedWriter escritor     = new BufferedWriter(fileWriter);
            escritor.write(atributosAlumno + "," + atributosApoderado);

            // Mostrar mensaje solo si se agregó un nuevo alumno
            JOptionPane.showMessageDialog(  null, "Alumno y apoderado agregados correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);

            // ----- Nueva linea para un nuevo alumno -----
            escritor.newLine();
            escritor.close();


        } catch (IOException e) {
            System.out.println(" Error al agregar alumno: " + e.getMessage());
        }
    }
    // ----- Crear archivo si no existe ------
    public static void crearArchivo(){
        try{
            File archivo = new File(nombreArchivo);

            if (!archivo.exists()) {
                FileWriter fileWriter   = new FileWriter(nombreArchivo, true);
                BufferedWriter escritor = new BufferedWriter(fileWriter);

                // ----- Encabezados -----
                escritor.write( "Rut,Nombres,Apellidos,Edad,"                                                       +
                                "Fecha Nacimiento,Email,Ciudad,Teléfono,"                                           +
                                "Nacionalidad,Fecha Matrícula,Dirección,Curso,"                                     +
                                "Letra,Electivo,Enfermedades,Datos Adicionales,"                                    +
                                "Género,Rut Apoderado,Nombres Apoderado,Apellidos Apoderado,"                       +
                                "Paréntesco Apoderado,Teléfono Apoderado,Ciudad Apoderado,Dirección Apoderado,"     +
                                "Observaciones Apoderado,Género Apoderado");


                escritor.newLine();
                escritor.close();
            }
        } catch (IOException e) {
            System.out.println(" El archivo Matrículas.csv, aún no ha sido creado: " + e.getMessage());
        }
    }
    // ----- Atributos alumno ------
    private static String atributosAlumno(Alumno nuevoAlumno) {
        return  nuevoAlumno.getRut()                + "," +
                nuevoAlumno.getNombres()            + "," +
                nuevoAlumno.getApellidos()          + "," +
                nuevoAlumno.getEdad()               + "," +
                nuevoAlumno.getFechaNacimiento()    + "," +
                nuevoAlumno.getEmail()              + "," +
                nuevoAlumno.getCiudad()             + "," +
                nuevoAlumno.getTelefono()           + "," +
                nuevoAlumno.getNacionalidad()       + "," +
                nuevoAlumno.getFechaMatricula()     + "," +
                nuevoAlumno.getDireccion()          + "," +
                nuevoAlumno.getCurso()              + "," +
                nuevoAlumno.getLetra()              + "," +
                nuevoAlumno.getElectivo()           + "," +
                nuevoAlumno.getEnfermedades()       + "," +
                nuevoAlumno.getDatosAdicionales()   + "," +
                nuevoAlumno.getGenero();
    }
    // ----- Atributos apoderado ------
    private static String atributosApoderado(Apoderado apoderado) {
        if (apoderado == null) {
            return "";
        }
        return  apoderado.getRut()                  + "," +
                apoderado.getNombres()              + "," +
                apoderado.getApellidos()            + "," +
                apoderado.getParentesco()           + "," +
                apoderado.getTelefono()             + "," +
                apoderado.getCiudad()               + "," +
                apoderado.getDireccion()            + "," +
                apoderado.getObservaciones()        + "," +
                apoderado.getGenero();
    }





    // ==================== EXISTE ALUMNO CON EL MISMO RUT ====================
    private static boolean existeAlumnoConRut(String rut) {
        try {
            FileReader fileReader       = new FileReader(nombreArchivo);
            BufferedReader lector       = new BufferedReader(fileReader);
            String linea;

            while ((linea = lector.readLine()) != null) {
                String[] campos         = linea.split(",");

                if (campos.length >= 1) {
                    String rutAlumno    = campos[0].trim();
                    if (rutAlumno.equals(rut.trim())) {
                        lector.close();
                        // Ya existe un alumno con el mismo RUT
                        return true;
                    }
                }
            }

            lector.close();
        } catch (IOException e) {
            System.err.println(" Hubo un error al leer Matrículas.csv " + e.getMessage());
        }

        // No existe un alumno con el mismo RUT
        return false;
    }





    /**
     * Obtiene una lista de datos de alumnos desde el archivo CSV
     * @param filtroRut Filtro opcional para buscar un alumno específico por su RUT
     * @return Lista de arreglos de objetos que representan datos de alumnos
     */
    // ==================== MOSTRAR ALUMNOS CSV ====================
    public static List<Object[]> listadoAlumnos(String filtroRut) {
        List<Object[]> alumnosData  = new ArrayList<>();

        try {
            FileReader fileReader   = new FileReader(nombreArchivo);
            BufferedReader lector   = new BufferedReader(fileReader);
            String linea;


            while ((linea = lector.readLine()) != null) {
                String[] campos     = linea.split(",");

                if (campos.length >= 26) {
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

                    String rutApoderado             = campos[17].trim();
                    String nombresApoderado         = campos[18].trim();
                    String apellidosApoderado       = campos[19].trim();
                    String parentescoApoderado      = campos[20].trim();
                    String telefonoApoderado        = campos[21].trim();
                    String ciudadApoderado          = campos[22].trim();
                    String direccionApoderado       = campos[23].trim();
                    String observacionesApoderado   = campos[24].trim();
                    String generoApoderado          = campos[25].trim();

                    if (filtroRut == null || rutAlumno.equals(filtroRut)) {
                        Object[] rowData = {rutAlumno                   ,nombresAlumno              ,apellidosAlumno            ,edadAlumno                 ,
                                            fechaNacimientoAlumno       ,emailAlumno                ,ciudadAlumno               ,telefonoAlumno             ,
                                            nacionalidadAlumno          ,fechaMatriculaAlumno       ,direccionAlumno            ,cursoAlumno                ,
                                            letraAlumno                 ,electivoAlumno             ,enfermedadesAlumno         ,datosAdicionalesAlumno     ,
                                            generoAlumno                ,rutApoderado               ,nombresApoderado           ,apellidosApoderado         ,
                                            parentescoApoderado         ,telefonoApoderado          ,ciudadApoderado            ,direccionApoderado         ,
                                            observacionesApoderado      ,generoApoderado};
                        alumnosData.add(rowData);
                    }
                }
            }
            lector.close();
        } catch (IOException e) {
            System.err.println(" Error al leer el archivo, el archivo Matrículas.csv, aún no ha sido creado " + e.getMessage());
        }
        return alumnosData;
    }







    // ==================== ELIMINAR ALUMNO ====================
    /**
     * Elimina un alumno del archivo CSV de matrículas
     * @param rutEstudiante RUT del estudiante a eliminar
     */
    public static void eliminarAlumnoCSV(String rutEstudiante) {
        try {
            File archivo                    = new File(nombreArchivo);
            Scanner lector                  = new Scanner(archivo);
            File archivoTemp                = new File(nombreArchivo + ".temp");
            FileWriter fileWriterTemp       = new FileWriter(archivoTemp);
            BufferedWriter escritor         = new BufferedWriter(fileWriterTemp);

            boolean estudianteEncontrado    = false;

            while (lector.hasNextLine()) {
                String linea        = lector.nextLine();
                String[] campos     = linea.split(",");

                if (campos.length >= 1) {
                    String rutAlumnoSinEspacios     = campos[0].trim();
                    String rutEstudianteSinEspacios = rutEstudiante.trim();

                    if (rutAlumnoSinEspacios.equals(rutEstudianteSinEspacios)) {
                        estudianteEncontrado = true;
                    } else {
                        escritor.write(linea);
                        escritor.newLine();
                    }
                }
            }

            lector.close();
            escritor.close();

            archivo.delete();
            archivoTemp.renameTo(archivo);

            if (estudianteEncontrado) {
                JOptionPane.showMessageDialog(null, " El alumno de RUT " + rutEstudiante + " fue eliminado correctamente ", " Éxito ", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, " No se encontró un estudiante con el RUT " + rutEstudiante, " Advertencia ", JOptionPane.WARNING_MESSAGE);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, " Hubo un error al eliminar el estudiante: " + e.getMessage(), " Error ", JOptionPane.ERROR_MESSAGE);
        }
    }





    // ==================== MODIFICAR ALUMNO ====================
    /**
     * Modifica los datos de un alumno en el archivo CSV de matrículas
     * @param alumnoModificado Objeto Alumno con los datos modificados
     */
    public static void modificarAlumno(Alumno alumnoModificado) {
        try {
            File archivo                    = new File(nombreArchivo);
            Scanner lector                  = new Scanner(archivo);
            File archivoTemp                = new File(nombreArchivo + ".temp");
            FileWriter fileWriterTemp       = new FileWriter(archivoTemp, true);
            BufferedWriter escritor         = new BufferedWriter(fileWriterTemp);

            boolean estudianteEncontrado    = false;

            while (lector.hasNextLine()) {
                String linea    = lector.nextLine();
                String[] campos = linea.split(",");

                if (campos.length >= 1) {
                    String rutAlumnoSinEspacios     = campos[0].trim();
                    String rutModificadoSinEspacios = alumnoModificado.getRut().trim();

                    if (rutAlumnoSinEspacios.equals(rutModificadoSinEspacios)) {
                        String nuevaLinea   = atributosAlumno(alumnoModificado);
                        Apoderado apoderado = alumnoModificado.getNuevoApoderado();
                        if (apoderado != null) {
                            nuevaLinea += "," + atributosApoderado(apoderado);
                        }

                        // Agregar el resto de los campos
                        for (int i = 17; i < campos.length; i++) {
                            nuevaLinea += "," + campos[i].trim();
                        }

                        escritor.write(nuevaLinea);
                        escritor.newLine();
                        estudianteEncontrado = true;
                    } else {
                        escritor.write(linea);
                        escritor.newLine();
                    }
                }
            }

            lector.close();
            escritor.close();

            archivo.delete();
            archivoTemp.renameTo(new File(nombreArchivo));

            if (!estudianteEncontrado) {
                JOptionPane.showMessageDialog(null, " No hay un alumno registrado con ese RUT " + alumnoModificado.getRut(), "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, " No se pudo modificar el alumno" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
