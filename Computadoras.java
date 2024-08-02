public class Computadoras extends Producto{
    private String procesador;
    private String ram;
    private float tamanioDisco;

    public Computadoras(String nombre, String marca, float precio, int stock, String procesador, String ram, float tamanioDisco) {
        super(nombre, marca, precio, stock);
        this.procesador = procesador;
        this.ram = ram;
        this.tamanioDisco = tamanioDisco;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public float getTamanioDisco() {
        return tamanioDisco;
    }

    public void setTamanioDisco(float tamanioDisco) {
        this.tamanioDisco = tamanioDisco;
    }

    @Override
    public String toString() {
        return super.toString() + "Computadoras{" +
                "Procesador: '" + procesador + '\'' +
                ", RAM: " + ram + '\'' +
                ", Tamanio del disco: " + tamanioDisco +
                '}';
    }
}
