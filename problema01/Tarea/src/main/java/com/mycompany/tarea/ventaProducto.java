/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea;

import java.util.Scanner;

/**
 *
 * @author Usuario PC
 */
public class ventaProducto {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String producto;
        double precio;
        int numProductos;

        System.out.println("Ingrese el nombre del producto: ");
        producto = entrada.nextLine();
        System.out.println("Ingrese el precio del prodcuto: ");
        precio = entrada.nextDouble();
        System.out.println("Ingrese el numero de productos: ");
        numProductos = entrada.nextInt();

        Ejecutor e = new Ejecutor(producto, precio, numProductos);
        System.out.println("El producto que ingreso es: " + e.getProducto());
        System.out.println("El numero de productos que ingreso es: " + e.getNumProductos());
        System.out.println("El precio del producto que ingreso es: " + e.getPrecio());
        System.out.println("El descuento establecido para el producto que ingreso es: " + e.descuento(numProductos) + "%");
        System.out.println("El descuento que se le aplico al producto que ingreso es: " + e.calcularDesc());
        System.out.println("El precio final del producto que ingreso es: " + e.calcularPrecioFinal());
    }
}
