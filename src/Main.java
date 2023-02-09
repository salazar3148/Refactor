public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro(65, 66, 85);
        Comparendo comparendo1 = new Comparendo(carro1);
        comparendo1.construirFotoMulta(80);

        Camion camion1 = new Camion(75, 76, 95);
        Comparendo comparendo2 = new Comparendo(camion1);
        comparendo2.construirFotoMulta(80);

        Mula mula1 = new Mula(95, 96, 110);
        Comparendo comparendo3 = new Comparendo(mula1);
        comparendo3.construirFotoMulta(109);
    }
}