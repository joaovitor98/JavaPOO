package Ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite seu nome completo: ");
        String nomeTitular = leitura.nextLine();
        System.out.print("Digite o número da conta: ");
        int numeroConta = leitura.nextInt();
        System.out.println("Deseja fazer um deposito inicial?(s/n)");
        char dec = leitura.next().charAt(0);

        if (dec == 's' || dec == 'S') {
            System.out.print("Digite qual saldo quer por na conta: ");
            double saldo = leitura.nextDouble();
            ContaBancaria contaBancaria = new ContaBancaria(numeroConta, nomeTitular, saldo);
            contaBancaria.exibirInformacoes();
            System.out.print("Digite o valor que deseja depositar na sua conta: ");
            double valor = leitura.nextDouble();
            contaBancaria.depositar(valor);
            System.out.print("Digite o valor que deseja sacar na sua conta: ");
            double valor1 = leitura.nextDouble();
            contaBancaria.sacar(valor1);
        }
    }
}