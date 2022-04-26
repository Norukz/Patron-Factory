
package ico.fes.productos;

import ico.fes.factory.Producto;

/**
 *
 * @author Norukz
 */
public class Computadora implements Producto{
    private String marca;
    private String procesador;
    private int ram;
    private int almacenamiento;

    
    
    public Computadora() {
    }

    
    
    public Computadora(String marca, String procesador, int ram, int almacenamiento) {
        this.marca = marca;
        this.procesador = procesador;
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

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    
    
    
    
    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", procesador=" + procesador + ", ram=" + ram + ", almacenamiento=" + almacenamiento + '}';
    }
    
    
    
    
}
