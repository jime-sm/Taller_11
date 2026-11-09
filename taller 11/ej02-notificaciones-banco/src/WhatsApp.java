public class WhatsApp implements Canal {
    @Override
    public void enviar(String usuario, String mensaje) {
        System.out.println("  [WHATSAPP a " + usuario + "] " + mensaje);
    }
}
