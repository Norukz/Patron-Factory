/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.factory;

import ico.fes.productos.Computadora;
import ico.fes.productos.Smartphone;
import ico.fes.productos.Tablet;
import java.util.Scanner;

/**
 *
 * @author Norukz
 */
public class TestFactory {
    public static void main(String[] args) {
        
        int sel=0;
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Selecciona la opcion deseada:");
        
        System.out.println(Computadora.COMPUTADORA_HP + ")Computadora HP");
        System.out.println(Computadora.COMPUTADORA_DELL + ")Computadora DELL");
        System.out.println(Computadora.COMPUTADORA_ALIENWARE + ")Computadora Alienware");
        System.out.println(Tablet.TABLET_IPAD + ")Tablet Apple");
        System.out.println(Tablet.TABLET_HUAWEI + ")Tablet Huawei");
        System.out.println(Tablet.TABLET_SAMSUNG + ")Tablet Samsung");
        System.out.println(Smartphone.SMARTPHONE_APPLE + ")Smartphone Apple");
        System.out.println(Smartphone.SMARTPHONE_SAMSUNG + ")Smartphone Samsung");
        System.out.println(Smartphone.SMARTPHONE_MOTOROLA + ")Smartphone Motorola");
        
        
        
        
        
        try {
            System.out.print("Elige el numero de producto:");
            sel = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("No hiciste una seleccion valida");
        }
        
        Producto prodcuto = productoFactory.createProducto(sel);
        System.out.println(prodcuto.toString());
    }
}
