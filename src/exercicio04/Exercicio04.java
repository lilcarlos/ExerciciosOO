package exercicio04;

public class Exercicio04 {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("555","Joao",21,"São Paulo");
        Funcionario func1 = new Funcionario(1234, "Vinicius", 23,"Rio de janeiro");

        cliente1.exibirDados();
        func1.exibirDados();

    }




}
