class TesteIdade {
    public static void main(String[] args) {
        double idade;
        idade = 15;

        double idadeAnoQueVem = idade + 1;

        double metadeidade = idade / 2;

        double dobroidade = idade * 2;

        double resultado = idade % 2;

        boolean maioridade;
        maioridade = idade >= 18;

        boolean sangue;
        sangue = 'a' == 'A';

        char tipoSangue = 'O';

        int i = 5;
        int j = i;
        i = j + 1;

        System.out.println(idade);
        System.out.println(idadeAnoQueVem);
        System.out.println(metadeidade);
        System.out.println(dobroidade);
        System.out.println(resultado);
        System.out.println(maioridade);
        System.out.println(tipoSangue);
        System.out.println(sangue);
        System.out.println(i);
        System.out.println(j);
    }
}