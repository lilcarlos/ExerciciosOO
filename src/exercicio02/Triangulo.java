package exercicio02;

public class Triangulo {

    private double base;
    private double altura;


    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }



    public void area () {
        System.out.println("A área do triangulo é: " + ((this.base * this.altura) / 2));

    }


    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
