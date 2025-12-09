import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveRetornarFalhaEstoque() {
        Pedido pedido = new Pedido("Smartphone X", 1500.0);

        assertEquals(false, pedido.concluir());
    }

    @Test
    void deveRetornarFalhaPagamento() {
        Pedido pedido = new Pedido("Notebook", 0.0);

        assertEquals(false, pedido.concluir());
    }

    @Test
    void deveRetornarCompraConcluida() {
        Pedido pedido = new Pedido("Notebook", 2500.0);

        assertEquals(true, pedido.concluir());
    }
}