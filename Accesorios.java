public class Accesorios extends Producto{
    private String conexion;
    private String compatibilidad;


    public Accesorios(String nombre, String marca, float precio, int stock, String conexion, String compatibilidad) {
        super(nombre, marca, precio, stock);
        this.conexion = conexion;
        this.compatibilidad = compatibilidad;
    }

    public String getConexion() {
        return conexion;
    }

    public void setConexion(String conexion) {
        this.conexion = conexion;
    }

    public String getCompatibilidad() {
        return compatibilidad;
    }

    public void setCompatibilidad(String compatibilidad) {
        this.compatibilidad = compatibilidad;
    }

    @Override
    public String toString() {
        return super.toString() + "Accesorios{" +
                "Conexion: " + conexion + '\'' +
                ", Compatibilidad: " + compatibilidad + '\'' +
                '}';
    }
}
