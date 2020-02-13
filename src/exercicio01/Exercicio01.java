package exercicio01;

public class Exercicio01 {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Jonas", 35, "111.111.111-11");
        Pessoa pessoa2 = new Pessoa("Ivo", 35, "333.333.333-33");
        Pessoa pessoa3 = new Pessoa("Fabio", 35, "222.222.222-22");

        pessoa1.andar();
        pessoa2.andar();
        pessoa3.andar();

        pessoa1.comer();
        pessoa2.comer();
        pessoa3.comer();




    }
}
