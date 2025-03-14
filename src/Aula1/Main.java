package Aula1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite os valores do 'Triangulo X'");
        double a = leitura.nextDouble();
        double b = leitura.nextDouble();
        double c = leitura.nextDouble();
        Triangulo trianguloX = new Triangulo(a, b, c);
        System.out.println("Digite os valores do 'Triangulo Y'");
        a = leitura.nextDouble();
        b = leitura.nextDouble();
        c = leitura.nextDouble();
        Triangulo trianguloY = new Triangulo(a, b, c);
        System.out.printf("Triangulo X: %.2f%n", trianguloX.calculoTriangulo());
        System.out.printf("Triangulo Y: %.2f", trianguloY.calculoTriangulo());
    }
}
