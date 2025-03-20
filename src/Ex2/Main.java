package Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Empregado empregado = new Empregado();
        System.out.print("Digite seu nome: ");
        empregado.nome = leitura.nextLine();
        System.out.print("Digite seu salário bruto: ");
        empregado.salarioBruto = leitura.nextDouble();
        System.out.print("Digite o valor da taxa: ");
        empregado.taxa = leitura.nextDouble();
        empregado.exibirInformacoes();

        System.out.println("Digite o valor da porcetagem do aumento salarial: ");
        double porcetagem = leitura.nextDouble();
        empregado.aumentoSalarial(porcetagem);

        empregado.exibirInformacoes();
    }
}
