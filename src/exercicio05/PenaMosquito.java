package exercicio05;

public class PenaMosquito implements Escrita {

    private String ehFeitoDe;
    private String escreveCom;

    public PenaMosquito(String ehFeitoDe, String escreveCom) {
        this.ehFeitoDe = ehFeitoDe;
        this.escreveCom = escreveCom;
    }

    @Override
    public void escrever() {
        System.out.println("Escrevendo com: " + getEscreveCom());
        System.out.println("Material usado: " + getEhFeitoDe());

    }



    public String getEhFeitoDe() {
        return ehFeitoDe;
    }

    public String getEscreveCom() {
        return escreveCom;
    }


}
