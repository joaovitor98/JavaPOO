package Aula1;

public class Triangulo {
    public double a;
    public double b;
    public double c;

    public double calculoTriangulo() {
        double p = ((a + b + c) / 2.0);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
