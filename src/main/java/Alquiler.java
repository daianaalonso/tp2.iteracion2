public class Alquiler {
    private final Libro libro;
    private final int diasAlquilado;

    public Alquiler(Libro libro, int diasAlquilado) {
        this.libro = libro;
        this.diasAlquilado = diasAlquilado;
    }

    public double obtenerCosto() {
        return libro.obtenerCosto(this.diasAlquilado);
    }

    public int obtenerPuntos() {
        return libro.obtenerPuntos(this.diasAlquilado);
    }
}
