package cl.ucn.disc.pa.cl.ucn.disc.pa.inventario.models;

public class Cliente {

    /**
     * rut del Cliente
     * tipo XXXXXXXX-X
     */
    private String rut;

    /**
     * nombre del cliente
     *no puede ser null
     */
    private String nombre;

    /**
     * Constructor
     *
     * @param rut
     * @param nombre
     */

    public Cliente(String rut, String nombre){

        this.rut = rut;
        this.nombre = nombre;

    }

    /**
     *
     * @return the rut
     */
    public String getRut(){
        return this.rut;
    }

    /**
     *
     * @return the nombre
     */
    public String nombre(){
        return this.nombre;
    }
}
