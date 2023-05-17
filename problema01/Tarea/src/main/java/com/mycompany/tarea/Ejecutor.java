/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tarea;

/**
 *
 * @author Usuario PC
 */
public class Ejecutor {

   
    private String producto;
    private double precio;
    private int numProductos;
    private double descuento;
    private double totDescuento;

    public Ejecutor(String pro, double pre, int numPro) {
        producto = pro;
        precio = pre;
        numProductos = numPro;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        precio = precio;
    }

    public int getNumProductos() {
        return numProductos;
    }

    public void setNumProductos(int numProductos) {
        numProductos = numProductos;
    }

    public double descuento(int desc) {
        if (precio >= 1000 && numProductos >= 10) {
            desc = 10;
        } else {
            if (precio < 1000) {
                desc = 5;
            }
        }
        return desc;
    }

    public double calcularDesc() {
        double descu = 0;
        if (precio >= 1000 && numProductos >= 10) {
            descu = precio * 0.1;
        } else {
            if (precio < 1000) {
                descu = precio * 0.05;
            }
        }
        return descu;
    }

    public double calcularPrecioFinal() {
        double descuento = calcularDesc();
        double totDescuento = precio - descuento;

        return totDescuento;
    }
}
