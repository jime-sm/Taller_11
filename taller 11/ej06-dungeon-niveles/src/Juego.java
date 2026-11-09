// Clase CERRADA: no se modifica al agregar niveles nuevos.
public class Juego {

    public void jugarNivel(Nivel nivel, int cantidadEnemigos) {
        System.out.println(">> Entrando a: " + nivel.getNombre());
        for (int i = 0; i < cantidadEnemigos; i++) {
            Enemigo enemigo = nivel.crearEnemigo();
            enemigo.atacar();
        }
    }
}
