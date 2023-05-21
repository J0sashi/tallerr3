package cl.ucn.disc.pa.cl.ucn.disc.pa.inventario.models;

import cl.ucn.disc.pa.cl.ucn.disc.pa.inventario.models.cuerda;

public class Bajo extends cuerda {

    /**
     * Constructor
     *
     * @param codigo
     * @param precio
     * @param stock
     * @param tipo
     * @param instrumento
     * @param tipoDeCuerda
     * @param numeroDeCuerda
     * @param tipoDeSonido
     * @param materialDeCostruccion
     */

    public Bajo(String codigo, int precio, boolean stock, String tipo, String instrumento,String tipoDeCuerda,String numeroDeCuerda, String tipoDeSonido, String materialDeCostruccion){
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
}
