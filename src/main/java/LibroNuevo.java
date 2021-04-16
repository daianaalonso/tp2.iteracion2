public class LibroNuevo extends Libro {
    public LibroNuevo(String nombre) {
        super(nombre);
    }

    @Override
    public double obtenerCosto(int diasAlquilado) {
        return diasAlquilado * 3;
    }

    public int obtenerPuntos(int diasAlquilado) {
        int puntos = 1;
        if (diasAlquilado > 1) {
            puntos++;
        }
        return puntos;
    }
}

