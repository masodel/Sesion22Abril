package ni.uam.edu;

import ni.uam.edu.modelos.Producto;
import ni.uam.edu.servicios.ProductoServicios;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductoServicios productos = new ProductoServicios();

        String menu = "Jaguar Coffee \n1. Agregar \n2. Ver\n3. Salir\nOpcion: ";
        String nombre, precio, cantidad, opcion = "0";

        do {
            opcion = JOptionPane.showInputDialog(null, menu);
            switch (opcion){
                case "1" ->
                {
                    nombre = JOptionPane.showInputDialog(null, "Nombre del Producto");
                    precio = JOptionPane.showInputDialog(null, "Precio del Prodcuto");
                    cantidad = JOptionPane.showInputDialog(null, "Cantidad del Producto");
                    productos.agregarProducto(nombre, Double.parseDouble(precio), Integer.parseInt(cantidad));
                }
                case "2" ->
                {
                    JOptionPane.showMessageDialog(null, productos.getFactura());
                }
                case "3" -> {
                    nombre = JOptionPane.showInputDialog(null, "Nombre del Producto");
                    precio = JOptionPane.showInputDialog(null, "Precio del Prodcuto");
                    cantidad = JOptionPane.showInputDialog(null, "Cantidad del Producto");
                    JOptionPane.showMessageDialog(null, productos.buscarProducto(nombre, Integer.parseInt(cantidad), Double.parseDouble(precio)));
                }
                case "4" -> JOptionPane.showMessageDialog(null, "no oy a poner eso");
                default ->
                {
                    JOptionPane.showMessageDialog(null, "Opcion invalida");
                }

            }
        }while(!opcion.equals("3"));

        productos.agregarProducto("Cafe", 40, 3);
        productos.agregarProducto("Tajadas con queso", 60, 3);

        System.out.println("Factura");
        System.out.println(productos.getProductos());

        System.out.println("Total a pagar: $" + productos.getMonto());
    }
}
