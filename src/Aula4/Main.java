package Aula4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Produto: ");
        String nome = leitura.nextLine();
        System.out.print("Preço: ");
        double preco = leitura.nextDouble();
        System.out.print("Quantidade: ");
        int quantidade = leitura.nextInt();
        Produto produtos = new Produto(nome, preco, quantidade);
        System.out.println(produtos.exibirInformacoes());
        System.out.println("Digite o numero de volumes para ser adicionado no estoque");
        produtos.adcProtuto(leitura.nextInt());
        System.out.println(produtos.exibirInformacoes());
        System.out.println("Digite o numero de volumes para ser removido no estoque");
        produtos.removeProduto(leitura.nextInt());
        System.out.println(produtos.exibirInformacoes());
    }
}
