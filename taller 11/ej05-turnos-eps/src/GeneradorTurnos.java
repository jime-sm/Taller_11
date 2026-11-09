public class GeneradorTurnos {

    private static GeneradorTurnos instancia;   // unica instancia

    private int consecutivo = 0;

    // Constructor privado: "new GeneradorTurnos()" fuera de la clase no compila
    private GeneradorTurnos() { }

    public static synchronized GeneradorTurnos getInstance() {
        if (instancia == null) {
            instancia = new GeneradorTurnos();
        }
        return instancia;
    }

    // synchronized: dos ventanillas simultaneas nunca reciben el mismo turno
    public synchronized String siguienteTurno() {
        consecutivo++;
        return "T-" + String.format("%03d", consecutivo);
    }
}
