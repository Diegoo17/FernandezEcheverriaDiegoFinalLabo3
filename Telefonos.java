public class Telefonos extends Producto{
    private String sistemaOperativo;
    private int capacidadAlmacenamiento;

    private float tamanioPantalla;


    public Telefonos(String nombre, String marca, float precio, int stock, String sistemaOperativo, int capacidadAlmacenamiento, float tamanioPantalla) {
        super(nombre, marca, precio, stock);
        this.sistemaOperativo = sistemaOperativo;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.tamanioPantalla = tamanioPantalla;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public float getTamanioPantalla() {
        return tamanioPantalla;
    }

    public void setTamanioPantalla(float tamanioPantalla) {
        this.tamanioPantalla = tamanioPantalla;
    }

    @Override
    public String toString() {
        return super.toString() + "Telefonos{" +
                "SistemaOperativo: " + sistemaOperativo + '\'' +
                ", Capacidad almacenamiento: " + capacidadAlmacenamiento +
                ", Tamanio pantalla: " + tamanioPantalla +
                '}';
    }
}
