package cl.ucn.disc.pa.cl.ucn.disc.pa.inventario.models;

import cl.ucn.disc.pa.cl.ucn.disc.pa.inventario.models.Instrumento;

public abstract class viento extends Instrumento {

    /**
     * Instrumento de viento
     * puede ser Clarinete, Flauta Traversa, Saxofon, Trompeta
     */
    private String instrumento;

    /**
     * @codigo a usar
     * @precio a usar
     * @stock a usar
     * @tipo a usar
     * @instrumento a usar
     * @materialDeConstruccion a usar
     */

    public Viento(String codigo, int precio, boolean stock, String tipo, String instrumento, String materialDeConstruccion){
        this.codigo = codigo;
        this.precio = precio;
        this.stock = stock;
        this.tipo = tipo;
        this.instrumento = instrumento;
        this.materialDeConstruccion = materialDeConstruccion;
    }

    /**
     *
     * @return the instrumento
     */
    public String getInstrumento(){

        return this.instrumento;
    }

}
