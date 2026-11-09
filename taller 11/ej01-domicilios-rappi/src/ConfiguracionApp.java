public class ConfiguracionApp {

    private static int vecesCargada = 0;
    private static ConfiguracionApp instancia;   // unica instancia compartida

    private double tarifaBase;
    private double valorPorKm;
    private double recargoLluvia;

    // Constructor privado: nadie fuera de la clase puede hacer "new"
    private ConfiguracionApp() {
        // Simula leer config.properties del disco (operacion lenta y costosa)
        vecesCargada++;
        System.out.println("   >> Leyendo config.properties... (carga #" + vecesCargada + ")");
        this.tarifaBase = 4500;
        this.valorPorKm = 800;
        this.recargoLluvia = 0;
    }

    // Punto de acceso global; crea la instancia solo la primera vez
    public static synchronized ConfiguracionApp getInstance() {
        if (instancia == null) {
            instancia = new ConfiguracionApp();
        }
        return instancia;
    }

    public double getTarifaBase()    { return tarifaBase; }
    public double getValorPorKm()    { return valorPorKm; }
    public double getRecargoLluvia() { return recargoLluvia; }

    public void setRecargoLluvia(double recargoLluvia) {
        this.recargoLluvia = recargoLluvia;
    }
}
