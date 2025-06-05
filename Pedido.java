public class Pedido {
    private Cliente cliente;
    private Produto produto;
    private int quantidade;

    public Pedido(Cliente cliente, Produto produto, int quantidade) {
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double calcularTotal() {
        return produto.getPreco() * quantidade;
    }

    public String getDetalhesPedido() {
        return "Cliente: " + cliente.getDadosCliente() + "\n" +
               "Produto: " + produto.getNome() + "\n" +
               "Quantidade: " + quantidade + "\n" +
               "Total: R$ " + calcularTotal();
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Joao", "joao@gmail.com");
        Produto produto = new Produto("Camiseta", 29.99);
        Pedido pedido = new Pedido(cliente, produto, 3);
        System.out.println(pedido.getDetalhesPedido());
    }
}