package exercicio01;

public class Pessoa {

    private String nome;
    private int idade;
    private String cpf;


    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }


    public void andar () {
        System.out.println(this.nome + " está andando!");
    }


    public void comer() {
        System.out.println(this.nome + " esta comendo!");
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
