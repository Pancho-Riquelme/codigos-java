/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferreteria;

/**
 *
 * @author 
 */
public class Ferreteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pintura pintura1,pintura2;
        Martillo martillo1,martillo2;

        //crear objetos
        pintura1  = new Pintura(1,1,14500,11,"Pintura al temple","ceresita");
        pintura2  = new Pintura(10,20,14500,10,"Pintura al aceite","soquina");
        martillo1 = new Martillo('G',2,2400,3,"Martillo de bola","martillo");
        martillo2 = new Martillo('G',25,24000,20,"Martillo de geologo","martillo");

        //obtener total
        System.out.println("Total: $" + pintura1.calcularTotal(1, "LUNES"));
        System.out.println("Total: $" + martillo1.calcularTotal(3, "VIERNES"));

        //mostrar atributos
        System.out.println("-----------------");
        System.out.println(pintura1.toString());
        System.out.println("/////////////////");
        System.out.println(martillo1.toString());

    }
    
}
