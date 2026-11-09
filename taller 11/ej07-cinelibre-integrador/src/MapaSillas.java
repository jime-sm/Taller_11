import java.util.HashSet;
import java.util.Set;

public class MapaSillas {

    private static MapaSillas instancia;   // un solo mapa para toda la sala

    private final Set<String> ocupadas = new HashSet<>();

    private MapaSillas() { }

    public static synchronized MapaSillas getInstance() {
        if (instancia == null) {
            instancia = new MapaSillas();
        }
        return instancia;
    }

    // synchronized: la revision y la reserva son una sola operacion atomica
    public synchronized boolean reservar(String silla) {
        return ocupadas.add(silla);   // false si ya estaba ocupada
    }
}
