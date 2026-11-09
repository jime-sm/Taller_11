public class Glaciar extends Nivel {
    @Override public String getNombre()   { return "Glaciar"; }
    @Override public Enemigo crearEnemigo() { return new Golem(); }
}
