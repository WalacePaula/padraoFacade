public class PagamentoService {
    private static PagamentoService instancia = new PagamentoService();

    private PagamentoService() {};

    public static PagamentoService getInstancia() {
        return instancia;
    }

    public boolean realizarCobranca(Pedido pedido) {
        if (pedido.getValor() > 0) {
            System.out.println("Pagamento autorizado.");
            return true;
        }
        System.out.println("Falha: Pagamento recusado.");
        return false;
    }
}
