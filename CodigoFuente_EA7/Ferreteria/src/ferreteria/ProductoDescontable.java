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
public interface ProductoDescontable {
       double porcentajeDescuento = 0.08;
    
    public int calcularDescuento(String dia);
 
}
