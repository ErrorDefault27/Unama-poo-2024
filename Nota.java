public class Nota {

    private String nomeAluno;
    private double nap1;
    private double nap2;
    private double subs;
    private double media;
    
    public Nota(String nomeAluno, double nap1, double nap2, double subs) {
        this.nomeAluno = nomeAluno;
        this.nap1 = nap1;
        this.nap2 = nap2;
        this.subs = subs;
        this.media = calcularMedia();
    }
    private double calcularMedia() {
        double valorBase = (nap1 + nap2) / 2;
        double resultado;
        if (subs != 0) {
            resultado = valorBase + subs;
        } else {
            resultado = valorBase;
        }
        return resultado;
    }
    public double getMedia() {
        return media;
    }
    public String getNomeAluno() {
        return nomeAluno;
    }
    public double getNap1() {
        return nap1;
    }
    public double getNap2() {
        return nap2;
    }
    public double getSubs() {
        return subs;
    }
    @Override
    public String toString() {
        return "Nome do Aluno: " + nomeAluno +
               "\nMédia: " + media;
    }
}
