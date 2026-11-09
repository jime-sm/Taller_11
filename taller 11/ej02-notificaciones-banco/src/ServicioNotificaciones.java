public class ServicioNotificaciones {

    public void notificarTransferencia(CreadorCanal creador, String usuario, double monto) {
        String mensaje = "Recibiste $" + monto + " en tu cuenta BancoPlata";
        creador.notificar(usuario, mensaje);
    }

    public void notificarCodigoSeguridad(CreadorCanal creador, String usuario, String codigo) {
        String mensaje = "Tu codigo de seguridad es " + codigo + ". No lo compartas.";
        creador.notificar(usuario, mensaje);
    }
}
