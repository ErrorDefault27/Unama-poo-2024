import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Tarefa {
        
    private String titulo;
    private String descricao;
    private String prazo;
    private int prioridade = 10;
//construtor 1: completo
    public Tarefa(String titulo, String descricao, String prazo, int prioridade){
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
        this.prioridade = prioridade;
    }
    // construtor com menos paramentros
    public Tarefa(String titulo, String prazo) {
        this.titulo = titulo;
        this.prazo = prazo;
        this.descricao = "";
        this.prioridade = 0;
    }
    
    public String getTitulo() {

        return this.titulo;

    }
    public String getDescricao() {

        return this.descricao;

    }
    public String getPrazo() {

        return this.prazo;

    }
    public int getPrioridade() {

        return this.prioridade;

    }
    public void setTitulo(String titulo){

        this.titulo = titulo;

    }
    public void exibirDetalhes() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Prazo: " + this.prazo);
        System.out.println("Prioridade: " + this.prioridade);
    }
    public long calcularDiasRestantes() {
        LocalDate dataPrazo = LocalDate.parse(this.prazo);
        LocalDate hoje = LocalDate.now();

        return ChronoUnit.DAYS.between(hoje,dataPrazo);
    }
}

public class Main {
public static void main(String[] args) {
    Tarefa tarefa1 = new Tarefa("Estudar POO", "Revisar os conceitos de classes e objetos", "2024-09-15", 1);
    System.out.println("========Imprimindo com get==========");
    System.out.println(tarefa1.getTitulo());
    System.out.println(tarefa1.getDescricao());
    System.out.println(tarefa1.getPrazo());
    System.out.println(tarefa1.getPrioridade());
    System.out.println("========Imprimindo com o construtor 1==========");
    tarefa1.exibirDetalhes();
    
    System.out.println("========Imprimindo com o construtor 2==========");
    Tarefa tarefa2 = new Tarefa("Estudar para provas", "2050-10-25");
    tarefa2.exibirDetalhes();

    System.out.println("Dias restantes para entregar a tarefa 1: " + tarefa1.calcularDiasRestantes());
}
}
