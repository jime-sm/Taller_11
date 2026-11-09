public class Volcan extends Nivel {
    @Override public String getNombre()   { return "Volcan"; }
    @Override public Enemigo crearEnemigo() { return new Dragon(); }
}
