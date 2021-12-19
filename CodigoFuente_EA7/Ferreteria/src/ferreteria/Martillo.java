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
public class Martillo extends Producto{
    //atributo
    private int tamano;

    
    public Martillo() {
    }

    public Martillo(int tamano, int codigo, int precio, int stock,String tipo, String marca) {
        super(codigo, precio, stock, tipo, marca);
        this.tamano = tamano;
    }

        public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        if(tamano=='G' || tamano=='P')
        {
        this.tamano = tamano;}
        else
        {
          System.out.println("debe ser tamaño [G]Grande [P]Pequeño");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Martillo{" + "tamano=" + tamano + '}';
    }
   
    //calcularDescuento por unidad de producto
    @Override
    public int calcularDescuento(String dia) {
        int descuento =  0;
        dia = dia.toUpperCase();
        if(dia.equals("VIERNES")){
            descuento = (int) (super.precio * ProductoDescontable.porcentajeDescuento);
        }
        return descuento;
    }
}
