package Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite a largura: ");
        double largura = leitura.nextDouble();
        System.out.print("Digite a altura: ");
        double altura = leitura.nextDouble();
        Retangulo retangulo = new Retangulo(largura, altura);
        System.out.printf("Area: %.2f%n", retangulo.area());
        System.out.printf("Perimetro: %.2f%n", retangulo.perimetro());
        System.out.printf("Diagonal %.2f", retangulo.diagonal());
    }
}
