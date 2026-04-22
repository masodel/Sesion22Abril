package ni.uam.edu.servicios;

import ni.uam.edu.interfaces.ProductoInterfaz;
import ni.uam.edu.modelos.Producto;

import java.util.ArrayList;
import java.util.List;

public class ProductoServicios implements ProductoInterfaz {

    private List<Producto> productos;

    public ProductoServicios() {
        this.productos = new ArrayList<>();
    }

    @Override
    public void agregarProducto(String nombre, double precio, int cantidad) {
        this.productos.add(new Producto(nombre, cantidad, precio));
    }

    @Override
    public List<Producto> getProductos() {
        return productos;
    }

    public double getMonto() {
        double monto = 0, total = 0;
        for (Producto producto : productos) {
            total = producto.getCantidad() * producto.getPrecio();
            monto += total;
        }
        return monto;
    }
}
