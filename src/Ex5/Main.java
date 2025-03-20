package Ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite seu nome completo: ");
        String nomeTitular = leitura.nextLine();
        System.out.print("Digite o número da conta: ");
        int numeroConta = leitura.nextInt();
        System.out.println("Deseja fazer um deposito inicial?(sim/não)");
        String dec = leitura.next();

        if (dec.equalsIgnoreCase("Sim") || dec.equalsIgnoreCase("ss") || dec.equalsIgnoreCase("s")) {
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
        }else {
            System.out.println("Deseja depositar um valor na conta?");
            String dec1 = leitura.next();
            if (dec1.equalsIgnoreCase("Sim") || dec1.equalsIgnoreCase("ss") || dec1.equalsIgnoreCase("s")){
                double saldo = 0;
                ContaBancaria contaBancaria = new ContaBancaria(numeroConta, nomeTitular, saldo);
                System.out.print("Digite o valor que deseja depositar na sua conta: ");
                double valor = leitura.nextDouble();
                contaBancaria.depositar(valor);
                System.out.print("Digite o valor que deseja sacar na sua conta: ");
                double valor1 = leitura.nextDouble();
                contaBancaria.sacar(valor1);
                contaBancaria.exibirInformacoes();
            }
/*            double saldo = 0;
            ContaBancaria contaBancaria = new ContaBancaria(numeroConta, nomeTitular, saldo);
            contaBancaria.exibirInformacoes();*/
        }
    }
}
