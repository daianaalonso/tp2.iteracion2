import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private final List<Alquiler> alquileres;
    private final String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.alquileres = new ArrayList<>();
    }

    public Object[] calcularDeudaYPuntosObtenidos() {
        Object[] resultado = new Object[2];
        double totalDeuda = 0;
        int puntos = 0;
        for (Alquiler alquiler : this.alquileres) {
            totalDeuda += alquiler.obtenerCosto();
            puntos += alquiler.obtenerPuntos();
        }
        resultado[0] = totalDeuda;
        resultado[1] = puntos;
        return resultado;
    }

    public void alquilar(Alquiler rental) {
        alquileres.add(rental);
    }
}
