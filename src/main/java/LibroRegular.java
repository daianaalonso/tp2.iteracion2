public class LibroRegular extends Libro {
    public LibroRegular(String nombre) {
        super(nombre);
    }

    @Override
    public double obtenerCosto(int diasAlquilado) {
        double monto = 2;
        if (diasAlquilado > 2) {
            monto += (diasAlquilado - 2) * 1.5;
        }
        return monto;
    }
}
