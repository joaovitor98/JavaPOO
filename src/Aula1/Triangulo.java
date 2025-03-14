package Aula1;

public class Triangulo {
    private double a;
    private double b;
    private double c;

    public Triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculoTriangulo() {
        double p = ((a + b + c) / 2.0);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
