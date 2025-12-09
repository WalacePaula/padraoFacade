public class Pedido {
    private String nomeProduto;
    private double valor;

    public Pedido(String nomeProduto, double valor) {
        this.nomeProduto = nomeProduto;
        this.valor = valor;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getValor() {
        return valor;
    }

    public boolean concluir() {
        return CompraFacade.finalizarCompra(this);
    }
}
