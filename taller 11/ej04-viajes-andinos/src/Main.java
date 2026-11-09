public class Main {

    // Intenta construir y muestra el paquete o el motivo del rechazo
    private static void intentar(String etiqueta, PaqueteViaje.Builder builder) {
        try {
            System.out.println(builder.build());
        } catch (IllegalArgumentException e) {
            System.out.println(etiqueta + " RECHAZADO: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Viajes Andinos: paquetes vendidos ===");

        PaqueteViaje p1 = new PaqueteViaje.Builder()
                .destino("Cartagena").noches(4)
                .conVuelo().hotel("Decameron").conDesayuno()
                .tour("Islas del Rosario")
                .build();
        System.out.println(p1);

        // Solo hotel + seguro: se indica unicamente lo que incluye
        PaqueteViaje p2 = new PaqueteViaje.Builder()
                .destino("Villa de Leyva").noches(2)
                .hotel("Posada del Sol").conSeguro()
                .build();
        System.out.println(p2);

        // Sin destino -> rechazado
        intentar("p3", new PaqueteViaje.Builder()
                .noches(3).tour("Cafe en Salento"));

        // 0 noches -> rechazado
        intentar("p4", new PaqueteViaje.Builder()
                .destino("San Andres").noches(0));

        System.out.println();
        System.out.println("ESPERADO -> p1 y p2 se construyen leyendo claramente que incluyen,");
        System.out.println("            p3 y p4 se RECHAZAN al construirse (sin destino / 0 noches)");
    }
}
