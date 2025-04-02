package Aula5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite a quantidade de produtos que deseja comprar");
        int n = leitura.nextInt();
        Vetores[] vetores = new Vetores[n];
        for (int i = 0; i < vetores.length; i++) {
            System.out.println("Digite qual produto deseja comprar");
            String nome = leitura.nextLine();
            leitura.next();
            System.out.println("Digite o valor do produto");
            double preco = leitura.nextDouble();
            vetores[i] = new Vetores(nome, preco);
        }
        double soma = 0;
        for (int i = 0; i < vetores.length; i++) {
            soma += vetores[i].getPreco();
        }
        double medio = soma / vetores.length;
        System.out.printf("Preço médio: %.2f", medio);
    }
}
