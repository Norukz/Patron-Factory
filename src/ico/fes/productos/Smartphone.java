
package ico.fes.productos;

import ico.fes.factory.Producto;

/**
 *
 * @author Norukz
 */
public class Smartphone implements Producto {
    private String marca;
    private int ram;
    private int almacenamiento;

    public Smartphone() {
    }

    public Smartphone(String marca, int ram, int almacenamiento) {
        this.marca = marca;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Celular{" + "marca=" + marca + ", ram=" + ram + ", almacenamiento=" + almacenamiento + '}';
    }
    
    
}
