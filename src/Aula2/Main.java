package Aula2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Produto: ");
        Produtos produtos = new Produtos();
        produtos.nome = leitura.nextLine();
        System.out.print("Preço: ");
        produtos.preco = leitura.nextDouble();
        System.out.print("Quantidade: ");
        produtos.quantidade = leitura.nextInt();
        System.out.println(produtos.exibirInformacoes());
        System.out.println("Digite o numero de volumes para ser adicionado no estoque");
        produtos.adcProtutos(leitura.nextInt());
        System.out.println(produtos.exibirInformacoes());
        System.out.println("Digite o numero de volumes para ser removido no estoque");
        produtos.removeProdutos(leitura.nextInt());
        System.out.println(produtos.exibirInformacoes());
    }
}
