
package ico.fes.productos;

import ico.fes.factory.Producto;

/**
 *
 * @author Norukz
 */
public class Tablet implements Producto {
    
    private String marca;
    private int ram;
    private int almacenamiento;
    private int pulgadas;

    public Tablet() {
    }

    public Tablet(String marca, int ram, int almacenamiento, int pulgadas) {
        this.marca = marca;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.pulgadas = pulgadas;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
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

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    @Override
    public String toString() {
        return "Tablet{" + "marca=" + marca + ", ram=" + ram + ", almacenamiento=" + almacenamiento + ", pulgadas=" + pulgadas + '}';
    }
    
    
    
}
