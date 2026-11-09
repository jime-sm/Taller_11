public class Castillo extends Nivel {
    @Override public String getNombre()   { return "Castillo"; }
    @Override public Enemigo crearEnemigo() { return new Fantasma(); }
}
