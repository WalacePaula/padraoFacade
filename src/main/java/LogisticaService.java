public class LogisticaService {
    private static LogisticaService instancia = new LogisticaService();

    private LogisticaService() {};

    public static LogisticaService getInstancia() {
        return instancia;
    }

    public boolean agendarEntrega(Pedido pedido) {
        System.out.println("Entrega agendada para o endereço do cliente.");
        return true;
    }
}
