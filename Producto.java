public abstract class Producto {
    private String nombre;
    private String marca;
    private float precio;
    private int stock;

    public Producto(String nombre, String marca, float precio, int stock) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "Nombre: " + nombre + '\'' +
                ", Marca: " + marca + '\'' +
                ", Precio: " + precio +
                ", Stock: " + stock +
                '}';
    }
}
