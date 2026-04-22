package ni.uam.edu;

import ni.uam.edu.modelos.Producto;
import ni.uam.edu.servicios.ProductoServicios;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductoServicios productos = new ProductoServicios();

        productos.agregarProducto("Cafe", 40, 3);
        productos.agregarProducto("Tajadas con queso", 60, 3);

        System.out.println("Factura");
        System.out.println(productos.getProductos());

        System.out.println("Total a pagar: $" + productos.getMonto());
    }
}
