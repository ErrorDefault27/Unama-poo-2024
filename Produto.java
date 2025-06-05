public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public static void main(String[] args) {
        Produto produto = new Produto("Camiseta", 29.99);
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço unitário: R$ " + produto.getPreco());
    }
}