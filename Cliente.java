public class Cliente {
    private String nome;
    private String email;
    
    public Cliente(String n, String e) {
        this.nome = n;
        this.email = e;
    }
    
    public String getDadosCliente() {
        return nome + " - " + email;
    }

    public static void main(String[] args) {
        Cliente a = new Cliente("Joao", "joao@gmail.com");
        System.out.println(a.getDadosCliente());
    }
}
