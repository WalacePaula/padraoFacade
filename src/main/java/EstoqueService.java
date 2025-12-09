import java.util.ArrayList;
import java.util.List;

public class EstoqueService {
    private static EstoqueService instancia = new EstoqueService();
    private List<String> produtosSemEstoque = new ArrayList<>();

    private EstoqueService() {
        produtosSemEstoque.add("Smartphone X");
    };

    public static EstoqueService getInstancia() {
        return instancia;
    }

    public boolean isEstoqueDisponivel(Pedido pedido) {
        if (produtosSemEstoque.contains(pedido.getNomeProduto())) {
            System.out.println("Falha: Produto sem estoque.");
            return false;
        }
        return true;
    }
}
