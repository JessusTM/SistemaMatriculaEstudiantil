package Clases;

public class Alumno {
    private String    rut                   , nombres               , apellidos
            , edad                  , fechaDeNacimiento     , direccion
            , ciudad                , telefono              , gestionadoPor
            , email                 , viveCon               , nacionalidad
            , sector                , datosAdicionales      , etnia
            , matricula             , fechaDeMatricula      , insOrigen
            , enfermedades          , medicamentos          , genero
            , curso                 , letra                 , electivo
            , discAuditiva          , discVisual            , discIntelectual
            , tea;

    // constructor: toma cada atributo y da un valor inicial predeterminado
    public Alumno(  String rut              , String nombres                , String apellidos          ,
                    String edad             , String fechaDeNacimiento      , String direccion          ,
                    String ciudad           , String telefono               , String gestionadoPor      ,
                    String email            , String viveCon                , String nacionalidad       ,
                    String sector           , String datosAdicionales       , String etnia              ,
                    String matricula        , String fechaDeMatricula       , String insOrigen          ,
                    String enfermedades     , String medicamentos           , String genero             ,
                    String curso            , String letra                  , String electivo           ,
                    String discAuditiva     , String discVisual             , String discIntelectual    ,
                    String tea){

        //this sirve para q el atributo de este objeto le damos este valor,
        //se usa para referirse a los atributos de un objeto especifico de la clase

        this.rut                        = rut;
        this.nombres                    = nombres;
        this.apellidos                  = apellidos;
        this.edad                       = edad;
        this.fechaDeNacimiento          = fechaDeNacimiento;
        this.direccion                  = direccion;
        this.ciudad                     = ciudad;
        this.telefono                   = telefono;
        this.gestionadoPor              = gestionadoPor;
        this.email                      = email;
        this.viveCon                    = viveCon;
        this.nacionalidad               = nacionalidad;
        this.sector                     = sector;
        this.datosAdicionales           = datosAdicionales;
        this.etnia                      = etnia;
        this.matricula                  = matricula;
        this.fechaDeMatricula           = fechaDeMatricula;
        this.insOrigen                  = insOrigen;
        this.enfermedades               = enfermedades;
        this.medicamentos               = medicamentos;
        this.genero                     = genero;
        this.curso                      = curso;
        this.letra                      = letra;
        this.electivo                   = electivo;
        this.discAuditiva               = discAuditiva;
        this.discVisual                 = discVisual;
        this.discIntelectual            = discIntelectual;
        this.tea                        = tea;
    }

    //GETTERS Y SETTERS
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getGestionadoPor() {
        return gestionadoPor;
    }

    public void setGestionadoPor(String gestionadoPor) {
        this.gestionadoPor = gestionadoPor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getViveCon() {
        return viveCon;
    }

    public void setViveCon(String viveCon) {
        this.viveCon = viveCon;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getDatosAdicionales() {
        return datosAdicionales;
    }

    public void setDatosAdicionales(String datosAdicionales) {
        this.datosAdicionales = datosAdicionales;
    }

    public String getEtnia() {
        return etnia;
    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getFechaDeMatricula() {
        return fechaDeMatricula;
    }

    public void setFechaDeMatricula(String fechaDeMatricula) {
        this.fechaDeMatricula = fechaDeMatricula;
    }

    public String getInsOrigen() {
        return insOrigen;
    }

    public void setInsOrigen(String insOrigen) {
        this.insOrigen = insOrigen;
    }

    public String getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getElectivo() {
        return electivo;
    }

    public void setElectivo(String electivo) {
        this.electivo = electivo;
    }

    public String getDiscAuditiva() {
        return discAuditiva;
    }

    public void setDiscAuditiva(String discAuditiva) {
        this.discAuditiva = discAuditiva;
    }

    public String getDiscVisual() {
        return discVisual;
    }

    public void setDiscVisual(String discVisual) {
        this.discVisual = discVisual;
    }

    public String getDiscIntelectual() {
        return discIntelectual;
    }

    public void setDiscIntelectual(String discIntelectual) {
        this.discIntelectual = discIntelectual;
    }

    public String getTea() {
        return tea;
    }

    public void setTea(String tea) {
        this.tea = tea;
    }
}
