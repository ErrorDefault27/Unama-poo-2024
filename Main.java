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
        public void setTitulo(String titulo){

            this.titulo = titulo;

        }
    }

public class Main {
    public static void main(String[] args) {
        Tarefa tarefa1 = new Tarefa("Estudar poo", "a", "a", 1);
        System.out.println(tarefa1.getTitulo());
    }
}