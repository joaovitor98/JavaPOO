package Aula3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o valor do raio");
        double raio = leitura.nextDouble();
        double circun = Calculadora.circunferencia(raio);
        double vol = Calculadora.volume(raio);

        System.out.printf("Circuncferencia: %.2f%n", circun);
        System.out.printf("Volume: %.2f%n", vol);
        System.out.printf("Valor do PI: %.2f%n", Calculadora.PI);
    }
}
