
package Clases;

/**
 * La clase Apoderado representa a la persona encargada del cuidado y responsabilidad de un alumno
 */
public class Apoderado {

    // ==================== ATRIBUTOS ====================
    private String  rut             , nombres       , apellidos         , parentesco            ,
                    telefono        , ciudad        , direccion         , observaciones         ,
                    genero;


    // ==================== CONSTRUCTORES ====================

    /**
     *Constructor para la clase Apoderado
     * @param rut               Rut del apoderado
     * @param nombres           Nombres del apoderado
     * @param apellidos         Apellidos del apoderado
     * @param parentesco        Relación de parentesco con el alumno
     * @param telefono          Número de teléfono del apoderado
     * @param ciudad            Ciudad de residencia del apoderado
     * @param direccion         Dirección de residencia del apoderado
     * @param observaciones     Observaciones adicionales sobre el apoderado
     * @param genero            Género del apoderado
     */
    public Apoderado(   String rut              , String nombres            , String apellidos              , String parentesco         ,
                        String telefono         , String ciudad             , String direccion              , String observaciones      ,
                        String genero) {
        this.rut                = rut;
        this.nombres            = nombres;
        this.apellidos          = apellidos;
        this.parentesco         = parentesco;
        this.telefono           = telefono;
        this.ciudad             = ciudad;
        this.direccion          = direccion;
        this.observaciones      = observaciones;
        this.genero             = genero;
    }


    // ==================== GET ====================
    // Metodos getter para obtener los valores de los atributos
    public String getRut() {
        return rut;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getParentesco() {
        return parentesco;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public String getGenero() {
        return genero;
    }


    // ==================== SET ====================
    // Metodos setter para establecer y/o modificar los valores de los atributos
    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}