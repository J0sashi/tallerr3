package cl.ucn.disc.pa.cl.ucn.disc.pa.inventario.models;

public class Saxofon extends  viento{

    /**
     * Constructor
     *
     * @codigo a usar
     * @precio a usar
     * @stock a usar
     * @tipo a usar
     * @instrumento a usar
     * @materialDeConstruccion a usar
     */
    public Clarinete(String codigo, int precio, boolean stock, String tipo, String instrumento, String materialDeConstruccion){
        this.codigo = codigo;
        this.precio = precio;
        this.stock = stock;
        this.tipo = tipo;
        this.instrumento = instrumento;
        this.materialDeConstruccion = materialDeConstruccion;
    }
}
