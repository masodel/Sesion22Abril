package ni.uam.edu.interfaces;

import ni.uam.edu.modelos.Producto;

import java.util.List;

public interface ProductoInterfaz {

    public void agregarProducto(String nombre, double precio, int cantidad);

    public List<Producto> getProductos();

    public boolean eliminarProducto(String nombre);

    public boolean editarProducto(String nombre, double precio, int cantidad);

    public boolean buscarProducto(String nombre, int cantidad, double precio);
}
