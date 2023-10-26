package Clases;

public class Alumno {

    // ==================== ATRIBUTOS ====================
    private Apoderado nuevoApoderado;

    String  rut             , nombres               , apellidos             , edad              ,
            fechaNacimiento , email                 , ciudad                , telefono          ,
            nacionalidad    , fechaMatricula        , direccion             , curso             ,
            letra           , electivo              , enfermedades          , datosAdicionales  ,
            genero;




    //==================== Constructor ====================
    public Alumno(  String rut              , String nombres            , String apellidos          , String edad                   ,
                    String fechaNacimiento  , String email              , String ciudad             , String telefono               ,
                    String nacionalidad     , String fechaMatricula     , String direccion          , String curso                  ,
                    String letra            , String electivo           , String enfermedades       , String datosAdicionales       ,
                    String genero) {
        this.rut                = rut;
        this.nombres            = nombres;
        this.apellidos          = apellidos;
        this.edad               = edad;
        this.fechaNacimiento    = fechaNacimiento;
        this.email              = email;
        this.ciudad             = ciudad;
        this.telefono           = telefono;
        this.nacionalidad       = nacionalidad;
        this.fechaMatricula     = fechaMatricula;
        this.direccion          = direccion;
        this.curso              = curso;
        this.letra              = letra;
        this.electivo           = electivo;
        this.enfermedades       = enfermedades;
        this.datosAdicionales   = datosAdicionales;
        this.genero             = genero;
    }

    public Alumno() {
    }




    //==================== GET ====================
    public String getRut() {
        return rut;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEdad() {
        return edad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getFechaMatricula() {
        return fechaMatricula;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCurso() {
        return curso;
    }

    public String getLetra() {
        return letra;
    }

    public String getElectivo() {
        return electivo;
    }

    public String getEnfermedades() {
        return enfermedades;
    }

    public String getDatosAdicionales() {
        return datosAdicionales;
    }

    public String getGenero() {
        return genero;
    }

    public Apoderado getNuevoApoderado() {
        return nuevoApoderado;
    }



    //==================== SET ====================
    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setFechaMatricula(String fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public void setElectivo(String electivo) {
        this.electivo = electivo;
    }

    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }

    public void setDatosAdicionales(String datosAdicionales) {
        this.datosAdicionales = datosAdicionales;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNuevoApoderado(Apoderado nuevoApoderado) {
        this.nuevoApoderado = nuevoApoderado;
    }
}