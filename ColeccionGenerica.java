import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ColeccionGenerica <T>{

    private List<T> listaProductos;

    public ColeccionGenerica() {
        listaProductos = new LinkedList<>();
    }

    public void add(T elemento)
    {
        listaProductos.add(elemento);
    }

    public T get(T elemento) throws ProductNotAvailableException
    {
        if(!listaProductos.contains(elemento))
            throw new ProductNotAvailableException("Producto no existente");
        else
            return elemento;
    }

    public List<T> getAll()
    {
        return listaProductos;
    }

    public void delete(T elemento)
    {
        listaProductos.remove(elemento);
    }


    public List<T> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<T> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public void listAll()
    {
        for(T producto : listaProductos)
            System.out.println(producto);
    }


}
