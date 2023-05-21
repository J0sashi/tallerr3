package cl.ucn.disc.pa.cl.ucn.disc.pa.inventario.models;

import cl.ucn.disc.pa.cl.ucn.disc.pa.inventario.models.Instrumento;

public abstract class cuerda extends Instrumento {

    /**
     * Instrumento de cuerda
     * puede ser guitarra, bajo, arpa, violin
     */
    private String instrumento;

    /**
     * Tipo de Cuerda
     *puede ser nylon, acero o tripa
     */

    private String tipoDeCuerda;

    /**
     *numero de cuerdas
     * no puede ser null
     */

    private String numeroDeCuerda;

    /**
     * tipo de sonido
     * puede ser acustico o electrico
     */

    private String tipoDeSonido;


    /**
     * @codigo a usar
     * @precio a usar
     * @stock a usar
     * @tipo a usar
     * @instrumento a usar
     * @tipoDeCuerda a usar
     * numeroDeCuerda a usar
     * materialDeConstruccion a usar
     * tipoDeSonido a usar
     */

    public cuerda(String codigo, int precio, boolean stock, String tipo, String instrumento,String tipoDeCuerda,String numeroDeCuerda, String tipoDeSonido, String materialDeCostruccion){
        this.codigo = codigo;
        this.precio = precio;
        this.stock = stock;
        this.tipo = tipo;
        this.instrumento = instrumento;
        this.numeroDeCuerda = numeroDeCuerda;
        this.tipoDeCuerda = tipoDeCuerda;
        this.tipoDeSonido = tipoDeSonido;
        this.materialDeConstruccion = materialDeCostruccion;
    }

    /**
     *
     * @return the instrumento
     */
    public String getInstrumento(){

        return this.instrumento;
    }

    /**
     *
     * @return the Tipo de Cuerda
     */
    public String getTipoDecuerda(){

        return this.tipoDeCuerda;
    }

    /**
     *
     * @return the numero cuerdas
     */
    public int getNumeroCuerdas(){

        return this.numeroDeCuerda;
    }

    /**
     *
     * @return the tipo de sonido
     */
    public String getTipoDeSonido(){

        return this.tipoDeSonido;
    }
}
