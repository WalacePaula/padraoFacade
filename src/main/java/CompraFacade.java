public class CompraFacade {
    public static boolean finalizarCompra(Pedido pedido) {
        if (!EstoqueService.getInstancia().isEstoqueDisponivel(pedido)) {
            return false;
        }

        if (!PagamentoService.getInstancia().realizarCobranca(pedido)) {
            return false;
        }

        if (!LogisticaService.getInstancia().agendarEntrega(pedido)) {
            return false;
        }

        return true;
    }

}
