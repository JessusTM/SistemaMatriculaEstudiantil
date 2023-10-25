package Clases;
public class Apoderado {
    String rut, nombre, apellidos,
            parentesco, telefono, ciudad,
            direccion, observaciones, genero;


    public Apoderado(String rut,            String nombre,
                     String apellidos,     String parentesco,
                     String telefono,      String ciudad, String direccion,
                     String observaciones, String genero ) {

        this.rut           = rut;
        this.nombre        = nombre;
        this.apellidos     = apellidos;
        this.parentesco    = parentesco;
        this.telefono      = telefono;
        this.ciudad        = ciudad;
        this.direccion     = direccion;
        this.observaciones = observaciones;
        this.genero        = genero;

    }
    public Apoderado() {
    }


    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


}
