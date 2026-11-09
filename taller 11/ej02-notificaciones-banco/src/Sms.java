public class Sms implements Canal {
    @Override
    public void enviar(String usuario, String mensaje) {
        System.out.println("  [SMS a " + usuario + "] " + mensaje);
    }
}
