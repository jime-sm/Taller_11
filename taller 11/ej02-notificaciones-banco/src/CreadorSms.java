public class CreadorSms extends CreadorCanal {
    @Override
    protected Canal crearCanal() {
        return new Sms();
    }
}
