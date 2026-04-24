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

    @Override
    public boolean eliminarProducto(String nombre) {
        return false;
    }

    @Override
    public boolean editarProducto(String nombre, double precio, int cantidad) {
        return false;
    }

    @Override
    public boolean buscarProducto(String nombre, int cantidad, double precio) {
        Producto miProducto = new Producto(nombre, cantidad, precio);
        for (Producto producto : productos){
            if (producto.equals(miProducto)) {return true;}
        }
        return false;
    }

    public double getMonto() {
        double monto = 0, total = 0;
        for (Producto producto : productos) {
            total = producto.getCantidad() * producto.getPrecio();
            monto += total;
        }
        return monto;
    }

    public StringBuilder getFactura(){
        StringBuilder mensaje = new StringBuilder();

        mensaje.append("Factura");
        mensaje.append("\n");

        for(Producto producto : productos){
            mensaje.append(producto.getNombre());
            mensaje.append(" | ");
            mensaje.append(producto.getCantidad());
            mensaje.append(" | ");
            mensaje.append(producto.getPrecio());
            mensaje.append(" | ");
            mensaje.append(producto.getPrecio() * producto.getCantidad());

            mensaje.append("\n");
        }

        mensaje.append("\n");
        mensaje.append("Monto final: " + getMonto());

        return mensaje;
    }
}
