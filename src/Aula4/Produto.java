package Aula4;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.setNome(nome);
        this.setPreco(preco);
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double valorTotalEmEstoque() {
        return preco * quantidade;
    }

    public void adcProtuto(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removeProduto(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String exibirInformacoes() {
        return "Produtos:\n" +
                "Dados do produto: " + getNome() + ", R$" + String.format("%.2f", getPreco()) + ", " + quantidade + " unidades, total: R$" + String.format("%.2f", valorTotalEmEstoque()) + "\n";
    }
}
