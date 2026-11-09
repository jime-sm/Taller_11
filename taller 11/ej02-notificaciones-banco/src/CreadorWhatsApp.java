public class CreadorWhatsApp extends CreadorCanal {
    @Override
    protected Canal crearCanal() {
        return new WhatsApp();
    }
}
