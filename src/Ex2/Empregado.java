package Ex2;

public class Empregado {
    public String nome;
    public double salarioBruto;
    public double taxa;

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
