package Aula1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Triangulo trianguloX = new Triangulo();
        Triangulo trianguloY = new Triangulo();
        System.out.println("Digite os valores do 'Triangulo X'");
        trianguloX.a = leitura.nextDouble();
        trianguloX.b = leitura.nextDouble();
        trianguloX.c = leitura.nextDouble();
        System.out.println("Digite os valores do 'Triangulo Y'");
        trianguloY.a = leitura.nextDouble();
        trianguloY.b = leitura.nextDouble();
        trianguloY.c = leitura.nextDouble();
        System.out.printf("Triangulo X: %.2f%n", trianguloX.calculoTriangulo());
        System.out.printf("Triangulo Y: %.2f", trianguloY.calculoTriangulo());
    }
}
