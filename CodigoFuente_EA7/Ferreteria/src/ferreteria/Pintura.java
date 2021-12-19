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
public class Pintura extends Producto{
    private int litros;

    public Pintura() {
    }

    public Pintura(int litros, int codigo, int precio, int stock, String tipo, String marca) {
        super(codigo, precio, stock, tipo, marca);
        this.litros = litros;
    }

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }

    @Override
public int calcularDescuento(String dia) {
        int descuento =  0;
        dia = dia.toUpperCase();
        if(dia.equals("LUNES")){
            descuento = (int) (super.precio * ProductoDescontable.porcentajeDescuento);
        }
        return descuento;
    }    
    
}
