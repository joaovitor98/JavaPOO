package Ex2;

public class Empregado {
    private String nome;
    private double salarioBruto;
    private double taxa;

    public Empregado(String nome, double salarioBruto, double taxa) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.taxa = taxa;
    }

    public double salarioLiquido() {
        return salarioBruto - taxa;
    }

    public double aumentoSalarial(double porcentagem) {
        return salarioBruto += salarioBruto * (porcentagem / 100);
    }

    public void exibirInformacoes() {
        System.out.printf("Nome: %s%nSalário Líquido: R$ %.2f%n", nome, salarioLiquido());
    }
}
