public class CreadorPush extends CreadorCanal {
    @Override
    protected Canal crearCanal() {
        return new Push();
    }
}
