package Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = leitura.nextLine();
        System.out.print("Digite seu salário bruto: ");
        double salarioBruto = leitura.nextDouble();
        System.out.print("Digite o valor da taxa: ");
        double taxa = leitura.nextDouble();
        Empregado empregado = new Empregado(nome, salarioBruto, taxa);
        empregado.exibirInformacoes();

        System.out.println("Digite o valor da porcetagem do aumento salarial: ");
        double porcetagem = leitura.nextDouble();
        empregado.aumentoSalarial(porcetagem);

        empregado.exibirInformacoes();
    }
}
