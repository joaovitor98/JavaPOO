package Aula7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Forma> lista = new ArrayList<>();
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite a quantidade de formas: ");
        int n = leitura.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Forma " + (i + 1) + " dados:");
            System.out.println("Retangulo ou Circulo?(r/c)");
            char forma = leitura.next().charAt(0);
            System.out.println("Cor (Preto/Azul/Vermelho)");
            Cor cor = Cor.valueOf(leitura.next());

            if (forma == 'r') {
                System.out.println("Largura: ");
                double largura = leitura.nextDouble();
                System.out.println("Altura: ");
                double altura = leitura.nextDouble();
                lista.add(new Retangulo(cor, largura, altura));
            } else if (forma == 'c') {
                System.out.println("Raio: ");
                double raio = leitura.nextDouble();
                lista.add(new Circulo(raio));
            } else {
                System.out.println("Forma invalida");
            }

            System.out.println(" ");
            System.out.println("Area das formas: ");
            for (Forma formas : lista) {
                System.out.println(String.format("Area: %.2f", formas.area()));
            }
        }
    }
}
