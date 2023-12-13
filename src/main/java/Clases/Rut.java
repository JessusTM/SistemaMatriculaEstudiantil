package Clases;

/**
 * La clase Rut representa un número de RUT (Rol Único Tributario) con su respectivo dígito verificador
 */
public class Rut {

    // ==================== ATRIBUTOS ====================
    private int      rut     , digito    , multiplo  , acumulador;

    private String   rutDigito;



    // ==================== CONSTRUCTORES ====================

    /**
     * Constructor para la clase Rut
     * @param rut           Número base del RUT
     * @param digito        Dígito verificador del RUT
     * @param multiplo      Valor resultante del producto entre el dígito y su posición
     * @param acumulador    Acumulador para el cálculo del RUT
     * @param rutDigito     Representación del dígito verificador del RUT (puede ser un número o la letra "K")
     */
    public Rut(int rut, int digito, int multiplo, int acumulador, String rutDigito) {
        this.rut            = rut;
        this.digito         = digito;
        this.multiplo       = multiplo;
        this.acumulador     = acumulador;
        this.rutDigito      = rutDigito;
    }

    /**
     * Constructor vacío por defecto
     */
    public Rut() {
    }



    // ==================== VALIDAR RUT ====================

    /**
     * Método para validar el RUT y calcular su dígito verificador
     */
    public void validarRut() {
        int contador    = 2;
        acumulador      = 0;
        int tempRut     = rut;

        while (tempRut != 0) {
            int digito  = tempRut   % 10;
            multiplo    = digito    * contador;
            acumulador += multiplo;
            tempRut     = tempRut   / 10;
            contador    = contador  + 1;

            if (contador == 8) {
                contador = 2;
            }
        }

        // Cuando el RUT tenga una "K"
        if (rutDigito.equalsIgnoreCase("k")) {
            rutDigito = "10";
        }
    }



    // ==================== GETTER ====================
    // Metodos getter para obtener los valores de los atributos
    public int getRut() {
        return rut;
    }

    public int getDigito() {
        return digito;
    }

    public int getMultiplo() {
        return multiplo;
    }

    public int getAcumulador() {
        return acumulador;
    }

    public String getRutDigito() {
        return rutDigito;
    }


    // ==================== SETTER ====================
    // Métodos setter para establecer y/o modificar los valores de los atributos
    public void setRut(int rut) {
        this.rut = rut;
    }

    public void setDigito(int digito) {
        this.digito = digito;
    }

    public void setMultiplo(int multiplo) {
        this.multiplo = multiplo;
    }

    public void setAcumulador(int acumulador) {
        this.acumulador = acumulador;
    }

    public void setRutDigito(String rutDigito) {
        this.rutDigito = rutDigito;
    }
}
