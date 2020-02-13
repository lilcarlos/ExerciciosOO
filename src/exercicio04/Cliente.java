package exercicio04;

public class Cliente extends Pessoa {

    private String cpf;

    public Cliente(String cpf, String nome, int idade, String cidade) {
        this.cpf = cpf;
        setNome(nome);
        setIdade(idade);
        setCidade(cidade);

    }

    public void exibirDados(){
        System.out.println("-------------------------------");
        System.out.println("CLIENTE");
        System.out.println("Nome: " + getNome());
        System.out.println("Cpf: " + getCpf());
        System.out.println("Idade: " + getIdade());
        System.out.println("Cidade :" + getCidade());
        System.out.println("-------------------------------");
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
