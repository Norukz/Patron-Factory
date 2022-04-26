/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.factory;

import ico.fes.productos.Computadora;
import ico.fes.productos.Smartphone;
import ico.fes.productos.Tablet;



/**
 *
 * @author Norukz
 */
public class productoFactory {
    
    public static Producto createProducto(int tipo){
    
        switch (tipo) {
            case Producto.COMPUTADORA_ALIENWARE:
                return new Computadora("Alienware", "Intel i9", 64, 2000);
            case Producto.COMPUTADORA_DELL:
                return new Computadora("Dell", "Intel i5", 16, 1000);
            case Producto.COMPUTADORA_HP:
                return new Computadora("HP", "Ryzen 5", 16, 500);
            case Producto.SMARTPHONE_APPLE:
                return new Smartphone("Apple", 4, 128);
            case Producto.SMARTPHONE_MOTOROLA:
                return new Smartphone("Moto Z2", 6, 64);
            case Producto.SMARTPHONE_SAMSUNG:
                return new Smartphone("Samsung", 6, 256);
            case Producto.TABLET_HUAWEI:
                return new Tablet("Huawei", 3, 64, 10);
            case Producto.TABLET_IPAD:
                return new Tablet("Ipad", 3, 128, 11);
            case Producto.TABLET_SAMSUNG:
                return new Tablet("Samsung Tab", 12, 500, 13);
               
            default:
                throw new AssertionError();
        }
    
    
    }
}
