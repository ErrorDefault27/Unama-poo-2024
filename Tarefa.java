import java.util.list;

public class Tarefa {
    private string titulo;
    List<Etiqueta> etiquetas;
    private DataPrazo prazo;

    public Tarefa(String titulo, LocalDate prazo) {
        this.titulo = titulo;
        this.etiquetas = new ArrayList<>();
        this.prazo = new DataPrazo(prazo);
    }

    public void adicionarEtiqueta(Etiqueta etiqueta) {
        this.etiquetas.add(etiqueta);
    }
}