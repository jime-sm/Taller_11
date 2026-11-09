public class Main {
    public static void main(String[] args) {
        PanelAdmin admin = new PanelAdmin();
        CalculadoraDomicilio calculadora = new CalculadoraDomicilio();
        AppRepartidor repartidor = new AppRepartidor();

        System.out.println("=== Domicilios Rappi: tarde lluviosa en Bogota ===");
        admin.activarModoLluvia(2000);

        double precio = calculadora.calcular(3);
        System.out.println("[Cliente] Precio domicilio 3 km: $" + precio);
        repartidor.mostrarGanancia(3);

        System.out.println();
        System.out.println("ESPERADO -> precio: $8900.0 | ganancia: $4400.0 | config cargada 1 sola vez");
    }
}
