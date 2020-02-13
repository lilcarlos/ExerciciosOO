package exercicio04;

public class Funcionario extends Pessoa {

    private int matricula;

    public Funcionario(int matricula,String nome, int idade, String cidade) {
        this.matricula = matricula;
        setNome(nome);
        setIdade(idade);
        setCidade(cidade);
    }


    public void exibirDados(){
        System.out.println("-------------------------------");
        System.out.println("FUNCIONÁRIO");
        System.out.println("Nome: " + getNome());
        System.out.println("Matricula: "+ getMatricula());
        System.out.println("Idade: " + getIdade());
        System.out.println("Cidade de nascimento: " + getCidade());
        System.out.println("-------------------------------");
    }


    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }


}
