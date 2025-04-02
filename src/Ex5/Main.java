package Ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite a quantidade de estudantes: ");
        int n = leitura.nextInt();
        leitura.nextLine();
        Aluguel aluguel[] = new Aluguel[n];
        for (int i = 0; i < aluguel.length; i++) {
            System.out.print("Digite seu nome: ");
            String nome = leitura.nextLine();
            System.out.print("Digite seu email: ");
            String email = leitura.nextLine();
            System.out.print("Digite o quarto que deseja alugar: ");
            int numQuarto = leitura.nextInt();
            leitura.nextLine();
            aluguel[i] = new Aluguel(nome, email, numQuarto);
        }
        for (int i = 0; i < aluguel.length; i++) {
            System.out.println("Aluguel " + (i + 1));
            aluguel[i].exibirInformacoes();
            aluguel[i].quartosAlugados();
            System.out.println(" ");
        }
    }
}
