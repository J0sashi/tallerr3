package cl.ucn.disc.pa.cl.ucn.disc.pa.inventario.services;

/**
 * @author Jorge Nunez - Alexander Rivera
 */
public interface inventario {

    /**
     * agregar un instrumento
     * @param "archivo.csv"
     */
    void agregarInstrumento();

    /**
     * vender un instrumento
     */

    void venderInstrumento();

    /**
     * consultar instrumento con el inventario
     */

    void ConsultarInventario();

    /**
     * cerrar el programa
     */

    void Cierre();




}
