public abstract class Libro {
    private String nombre;

    public Libro(String nombre) {
        this.nombre = nombre;
    }

    public abstract double obtenerCosto(int diasAlquilado);

    public int obtenerPuntos(int diasAlquilado) {
        return 1;
    }
}
