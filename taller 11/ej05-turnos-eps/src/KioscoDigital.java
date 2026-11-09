public class KioscoDigital {

    public void pedirTurno(String paciente) {
        GeneradorTurnos generador = GeneradorTurnos.getInstance();
        System.out.println("  [Kiosco] " + paciente + " -> " + generador.siguienteTurno());
    }
}
