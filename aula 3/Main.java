class Tarefa {
        
        private String titulo;
        private String descricao;
        private String prazo;
        private int prioridade = 10;

        public Tarefa(String titulo, String descricao, String prazo, int prioridade){
            this.titulo = titulo;
            this.descricao = descricao;
            this.prazo = prazo;
            this.prioridade = prioridade;
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
    }

public class Main {
    public static void main(String[] args) {
        Tarefa tarefa1 = new Tarefa("Estudar POO", "Revisar os conceitos de classes e objetos", "2024-09-05", 1);

        System.out.println(tarefa1.getTitulo());
        System.out.println(tarefa1.getDescricao());
        System.out.println(tarefa1.getPrazo());
        System.out.println(tarefa1.getPrioridade());
        tarefa1.exibirDetalhes();
    }
}