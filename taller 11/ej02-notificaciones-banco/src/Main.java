public class Main {
    public static void main(String[] args) {
        ServicioNotificaciones servicio = new ServicioNotificaciones();

        System.out.println("=== BancoPlata: notificaciones ===");
        servicio.notificarTransferencia(new CreadorSms(), "laura", 150000);
        servicio.notificarTransferencia(new CreadorEmail(), "andres", 80000);
        servicio.notificarCodigoSeguridad(new CreadorPush(), "sofia", "482913");

        // NUEVO REQUERIMIENTO: el banco quiere notificar por WhatsApp
        servicio.notificarTransferencia(new CreadorWhatsApp(), "camilo", 50000);
        servicio.notificarCodigoSeguridad(new CreadorWhatsApp(), "camilo", "775521");

        System.out.println();
        System.out.println("ESPERADO -> la linea de WhatsApp debe aparecer, sin agregar otro 'else if'");
    }
}
