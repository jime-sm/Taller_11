// Creador: cada nivel es responsable de crear su propio enemigo.
public abstract class Nivel {

    public abstract String getNombre();

    // FACTORY METHOD
    public abstract Enemigo crearEnemigo();
}
