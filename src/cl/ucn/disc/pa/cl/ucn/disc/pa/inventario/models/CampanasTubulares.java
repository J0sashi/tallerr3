package cl.ucn.disc.pa.cl.ucn.disc.pa.inventario.models;

public class CampanasTubulares extends cl.ucn.disc.pa.cl.ucn.disc.pa.inventario.models.percusion {
    public CampanasTubulares(String codigo, int precio, boolean stock, String tipo, String instrumento,String percusion, String materialDeCostruccion, String altura){

        /**
         * Constructor
         *
         * @codigo a usar
         * @precio a usar
         * @stock a usar
         * @tipo a usar
         * @instrumento a usar
         * @percusion a usar
         * @materialDeConstruccion a usar
         * @altura a usar
         */

        this.codigo = codigo;
        this.precio = precio;
        this.stock = stock;
        this.tipo = tipo;
        this.instrumento = instrumento;
        this.percusion =percusion;
        this.materialDeConstruccion = materialDeCostruccion;
        this.altura = altura;

    }
}
