class Balancotrimestral {
    public static void main(String[] args) {
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;

        int gastosTrimestrais = gastosJaneiro + gastosFevereiro + gastosMarco;
        int media = gastosTrimestrais / 3;

        System.out.println(gastosTrimestrais);
        System.out.println(media);
    }
}