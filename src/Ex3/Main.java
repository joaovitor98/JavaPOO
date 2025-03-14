package Ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = leitura.nextLine();
        System.out.print("Digite uma nota: ");
        double nota1 = leitura.nextDouble();
        System.out.print("Digite uma nota: ");
        double nota2 = leitura.nextDouble();
        System.out.print("Digite uma nota: ");
        double nota3 = leitura.nextDouble();
        Estudante estudante = new Estudante(nome, nota1, nota2, nota3);
        if (estudante.calcularNotaFinal() < 70) {
            estudante.exibirInformacoes();
        }
    }
}
