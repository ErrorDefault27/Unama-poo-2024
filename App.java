public class App {
    public static void main(String[] args) {
        // Testando a classe Cliente
        Cliente cliente = new Cliente("Joao", "joao@gmail.com");
        Produto produto = new Produto("Camiseta", 29.99);
        Pedido p1 = new Pedido(cliente, produto, 3);
        System.out.println(p1.getDetalhesPedido());
        Cliente cliente2 = new Cliente("Maria", "maria@gmail.com");
        Produto produto2 = new Produto("Calça", 49.99);
        Pedido p2 = new Pedido(cliente2, produto2, 2);
        System.out.println(p2.getDetalhesPedido());
    }
    
}