public class TarefaUrg extends Tarefa{
    
    private String razaoPrioridade;
    
    public TarefaUrg(String titulo, String descricao, String prazo, String razaoPrioridade) {

    super(titulo, prazo, descricao, 5);

    this.razaoPrioridade = razaoPrioridade;
    }

    public String GetRazaoiPrioridade() {

        return razaoPrioridade;

    }
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Razão da prioridade" + this.razaoPrioridade);
    }
}