public class Cripta extends Nivel {
    @Override public String getNombre()   { return "Cripta"; }
    @Override public Enemigo crearEnemigo() { return new Esqueleto(); }
}
