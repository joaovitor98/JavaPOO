package Aula2;

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
        Produtos produtos = new Produtos(nome, preco, quantidade);
        System.out.println(produtos.exibirInformacoes());
        System.out.println("Digite o numero de volumes para ser adicionado no estoque");
        produtos.adcProtutos(leitura.nextInt());
        System.out.println(produtos.exibirInformacoes());
        System.out.println("Digite o numero de volumes para ser removido no estoque");
        produtos.removeProdutos(leitura.nextInt());
        System.out.println(produtos.exibirInformacoes());
    }
}
