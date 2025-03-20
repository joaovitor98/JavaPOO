package Ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Estudante estudante = new Estudante();
        System.out.print("Digite o nome do aluno: ");
        estudante.nome = leitura.nextLine();
        System.out.print("Digite uma nota: ");
        estudante.nota1 = leitura.nextDouble();
        System.out.print("Digite uma nota: ");
        estudante.nota2 = leitura.nextDouble();
        System.out.print("Digite uma nota: ");
        estudante.nota3 = leitura.nextDouble();
        if (estudante.calcularNotaFinal() < 70) {
            estudante.exibirInformacoes();
        }
    }
}
