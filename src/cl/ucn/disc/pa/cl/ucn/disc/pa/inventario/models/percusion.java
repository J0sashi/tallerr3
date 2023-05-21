package cl.ucn.disc.pa.cl.ucn.disc.pa.inventario.models;

import cl.ucn.disc.pa.cl.ucn.disc.pa.inventario.models.Instrumento;

public abstract class percusion extends Instrumento {
    /**
     * Instrumento de cuerda
     * puede ser guitarra, bajo, arpa, violin
     */
    private String instrumento;

    private String percusion;

    private double altura;

    /**
     * tipo de percusion
     * pude ser membranofono o idiofono
     */

    private String percusion;

    /**
     * Altura de instrumento
     * puede ser definida o indefinida
     */

    private double Altura;

    /**
     * @codigo a usar
     * @precio a usar
     * @stock a usar
     * @tipo a usar
     * @instrumento a usar
     * @percusion a usar
     * @materialDeConstruccion a usar
     * @altura a usar
     */

    public percusion(String codigo, int precio, boolean stock, String tipo, String instrumento,String percusion, String materialDeCostruccion, String altura){

        this.codigo = codigo;
        this.precio = precio;
        this.stock = stock;
        this.tipo = tipo;
        this.instrumento = instrumento;
        this.percusion =percusion;
        this.materialDeConstruccion = materialDeCostruccion;
        this.altura = altura;

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
     * @return the percusion
     */
    public String getPercusion(){
        return this.percusion;
    }

    /**
     *
     * @return the altura
     */
    public double getAltura(){
        return this.altura;
    }

}
