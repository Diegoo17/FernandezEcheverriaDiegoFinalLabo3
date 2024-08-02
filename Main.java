import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        //Creacion de la tienda

        Tienda tienda = new Tienda();

        Producto producto1 = new Telefonos("Celular", "Iphone", 1523, 10, "Sistema operativo", 123, 15 );
        Producto producto2 = new Computadoras("Compu", "Mac", 100, 5, "Procesador", "Ram", 10 );
        Producto producto3 = new Accesorios("Accesorio", "MARCA", 500, 3, "Conexion", "Compatibilidad");

        tienda.add(producto1);
        tienda.add(producto2);
        tienda.add(producto3);


        //Listado de productos
        tienda.mostrarProductos();



        //Compra de un producto
        try
        {
            tienda.buy(10, producto1);
        }
        catch(ProductNotAvailableException e)
        {
            e.printStackTrace();
        }


        //Producto con nuevo stock
        tienda.mostrarProductos();


        //Eliminar producto
        try
        {
            tienda.deleteByName("Compu");
        }
        catch(ProductNotFoundException e)
        {
            e.printStackTrace();
        }


        System.out.println("El listado sin el producto");
        tienda.mostrarProductos();

        //Escritura del archivo json
        ObjectMapper mapper = new ObjectMapper();

        try{
            mapper.writeValue(new File("archi.json"), tienda.getListaProductos());
            System.out.println("Archivo json escrito correctamente");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }



    }
}