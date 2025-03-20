package Aula2;

public class Produtos {
    public String nome;
    public double preco;
    public int quantidade;

    public double valorTotalEmEstoque() {
        return preco * quantidade;
    }

    public void adcProtutos(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removeProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String exibirInformacoes() {
        return "Produtos:\n" +
                "Dados do produto: " + nome + ", R$" + String.format("%.2f", preco) + ", " + quantidade + " unidades, total: R$" + String.format("%.2f", valorTotalEmEstoque()) + "\n";
    }
}
