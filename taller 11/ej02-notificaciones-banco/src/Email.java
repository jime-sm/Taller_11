public class Email implements Canal {
    @Override
    public void enviar(String usuario, String mensaje) {
        System.out.println("  [EMAIL a " + usuario + "@correo.com] " + mensaje);
    }
}
