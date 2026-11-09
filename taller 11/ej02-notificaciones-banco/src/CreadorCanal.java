// Creador: declara el Factory Method crearCanal() y reutiliza el resultado.
public abstract class CreadorCanal {

    // FACTORY METHOD: cada subclase decide que canal concreto instanciar
    protected abstract Canal crearCanal();

    public void notificar(String usuario, String mensaje) {
        Canal canal = crearCanal();
        canal.enviar(usuario, mensaje);
    }
}
