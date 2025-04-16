package Aula6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o tipo de conta que deseja criar:" + "\n1 - Conta Corrent"
                + "\n2 - Conta Empresárial" + "\n3 - Conta Poupança\n");
        int tipo = leitura.nextInt();

        if (tipo == 1) {
            System.out.println("Digite o numero da conta: ");
            int num = leitura.nextInt();
            System.out.println("Digite seu nome: ");
            leitura.nextLine();
            String nomeTitular = leitura.nextLine();
            System.out.println("Digite o seu saldo: ");
            double balanco = leitura.nextDouble();
            Conta conta = new Conta(num, nomeTitular, balanco);
            conta.toString();
            System.out.println("Digite o valor do saque:");
            conta.saque(leitura.nextDouble());
            System.out.println(conta.toString());
            System.out.println(conta.getBalanco());
        } else if (tipo == 2) {
            System.out.print("Digite o numero da conta: ");
            int num = leitura.nextInt();
            System.out.print("Digite seu nome: ");
            leitura.nextLine();
            String nomeTitular = leitura.nextLine();
            System.out.println("Digite o seu saldo: ");
            double balanco = leitura.nextDouble();
            System.out.println("Digite o limite: ");
            double limiteEmprestimo = leitura.nextDouble();
            Conta contaEmpresarial = new ContaEmpresarial(num, nomeTitular, balanco, limiteEmprestimo);
            System.out.println("Digite o valor do saque:");
            contaEmpresarial.saque(leitura.nextDouble());
            System.out.println(contaEmpresarial.toString());
        } else if (tipo == 3) {
            System.out.println("Digite o numero da conta:");
            int num = leitura.nextInt();
            leitura.nextLine();
            System.out.println("Digite seu nome:");
            String nomeTitular = leitura.nextLine();
            System.out.println("Digite o seu saldo:");
            double balanco = leitura.nextDouble();
            System.out.println("Digite a taxa de juros:");
            double taxaJuros = leitura.nextDouble();
            Conta contaPoupanca = new ContaPoupanca(num, nomeTitular, balanco, taxaJuros);
            System.out.println(contaPoupanca.toString());

        } else {
            System.out.print("Tipo de conta inexistente");
        }
    }
}