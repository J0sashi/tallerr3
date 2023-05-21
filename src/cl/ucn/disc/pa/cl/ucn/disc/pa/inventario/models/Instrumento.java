package cl.ucn.disc.pa.cl.ucn.disc.pa.inventario.models;

public abstract class Instrumento {

    /**
     * Codigo de instrumento
     * - Formato: XXXXX
     */
    private String codigo;

    /**
     * precio del Instrumento
     * - no puede ser 0
     */

    private int precio;

    /**
     * stock del Instrumento
     * - puede ser true o false
     */

    private Boolean stock;

    /**
     * Material de construccion del instrumento
     * - puede ser madera o metal
     */

    private String materialDeConstruccion;

    /**
     * tipo de instrumento
     * -cuerda, percusion, viento
     */

    private String tipo;

    /**
     * @codigo a usar
     * @precio a usar
     * @stock a usar
     * @materialDeConstruccion a usar
     */
    public Instrumento(String codigo,int precio,boolean stock,String materialDeConstruccion){
        this.codigo = codigo;
        this.precio = precio;
        this.tipo = tipo;
        this.stock = stock;
        this.materialDeConstruccion = materialDeConstruccion;
    }

    /**
     *
     * @return the codigo
     */
    public String getCodigo(){
        return this.codigo;

    }

    /**
     *
     * @return the precio
     */
    public int getPrecio(){

        return this.precio;
    }

    /**
     *
     * @return the stock
     */
    public boolean getStock(){

        return this.stock;
    }

    /**
     *
     * @return the tipo
     */
    public String getTipo(){

        return this.tipo;
    }

    /**
     *
     * @return the Material de Construccion
     */
    public String getMaterialDeConstruccion(){

        return this.materialDeConstruccion;
    }
}
