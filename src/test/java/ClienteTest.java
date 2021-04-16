import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    void clienteTieneDeuda() {
        Libro elTunel = new LibroRegular("El Túnel");
        Libro antesDelFin = new LibroRegular("Antes del Fin");

        Alquiler alquilerElTunel = new Alquiler(elTunel, 5);
        Alquiler alquilerAntesDelFin = new Alquiler(antesDelFin, 3);

        Cliente yo = new Cliente("Daiana");

        yo.alquilar(alquilerElTunel);
        yo.alquilar(alquilerAntesDelFin);
        Object[] resultado = new Object[]{10.0, 2};
        assertArrayEquals(resultado, yo.calcularDeudaYPuntosObtenidos());
    }
}
