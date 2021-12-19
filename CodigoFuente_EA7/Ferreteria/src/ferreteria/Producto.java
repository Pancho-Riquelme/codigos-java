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
public abstract class Producto implements ProductoDescontable {
    //atributos
    protected int codigo;
    protected int precio;
    protected int stock;
    protected String tipo;
    protected String marca;

    //constructores
    public Producto() {
    }

    public Producto(int codigo, int precio, int stock, String tipo, String marca) {
        this.codigo = codigo;
        this.precio = precio;
        this.stock = stock;
        this.tipo = tipo;
        this.marca = marca;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if(stock>=0){
        this.stock = stock;
        }
        else{
            System.out.println("debe ser mayor o igual a cero");
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", precio=" + precio + ", stock=" + stock + ", tipo=" + tipo + ", marca=" + marca + '}';
    }


    public boolean validarValor(int valorNuevo) {
        if (tipo.indexOf("martillo")==-1 && valorNuevo >= 2000) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarStock(int stockNuevo) {
        if (stockNuevo >= 0) {
            return true;
        } else {
            return false;
        }
    }

    
    public boolean validarStockVenta(int cantidadComprar) {
        if (cantidadComprar <= this.stock) {
            return true; 
        } else {
            System.out.println("No hay stock");
            return false;
        }
    }

    public int calcularTotal(int cantidad, String dia) {
        int total = 0;
        int descuento = 0;
        if (validarStockVenta(cantidad)) {
            System.out.println(tipo+ " Stock anterior "+ stock);
            stock=stock-cantidad;
            System.out.println(tipo+ " Stock actual es "+stock);
            descuento = calcularDescuento(dia);
            total = this.precio * cantidad - descuento * cantidad;
        }
        return total;

    }

}
