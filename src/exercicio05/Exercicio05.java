package exercicio05;

public class Exercicio05 {

    public static void main(String[] args) {

        Caneta caneta = new Caneta("Plastico","Tinta");
        Lapis lapis = new Lapis("Madeira","Carvao");
        PenaMosquito pena = new PenaMosquito("Pena", "Tinta");

        caneta.escrever();
        lapis.escrever();
        pena.escrever();

    }
}
