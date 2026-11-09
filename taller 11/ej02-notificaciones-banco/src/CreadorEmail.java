public class CreadorEmail extends CreadorCanal {
    @Override
    protected Canal crearCanal() {
        return new Email();
    }
}
