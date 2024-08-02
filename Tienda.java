import java.util.List;

public class Tienda {
    private ColeccionGenerica<Producto> listaProductos;

    public Tienda() {
        listaProductos = new ColeccionGenerica<>();
    }


    public void add(Producto producto)
    {
        listaProductos.add(producto);
    }

    public void buy(int cantidad, Producto productoAComprar) throws ProductNotAvailableException
    {
        Producto productoCompra = listaProductos.get(productoAComprar);

        if(productoCompra.getStock()<cantidad)
            throw new ProductNotAvailableException("Este producto no tiene esa cantidad de stock");
        else
        {
            System.out.println("El precio de la compra de " + productoCompra.getNombre() + " es de " + productoCompra.getPrecio()*cantidad);
            productoAComprar.setStock(productoAComprar.getStock()-cantidad);
        }
    }

    public Producto getByName(String nombre)
    {
        for(Producto producto : listaProductos.getListaProductos())
        {
            if(producto.getNombre().equals(nombre));
            return producto;
        }

        return null;
    }

    public void deleteByName(String nombre) throws ProductNotFoundException
    {
        int i =0;
        for(Producto producto : listaProductos.getListaProductos())
        {
            if(producto.getNombre().equals(nombre))
                listaProductos.delete(producto);
            i=1;
        }

        if(i==0)
            throw new ProductNotFoundException("Ese nombre no existe");
    }

    public void mostrarProductos()
    {
        listaProductos.listAll();
    }

    public ColeccionGenerica<Producto> getListaProductos() {
        return listaProductos;
    }
}
