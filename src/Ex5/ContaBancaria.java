package Ex5;

public class ContaBancaria {
    private final int numeroConta;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(int numeroConta, String nomeTitular, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.depositar(saldo);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void alterarNomeTitular(String novoNome) {
        this.nomeTitular = novoNome;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.printf("Atualização da conta:%nConta: %d, Titular: %s, Saldo: %.2f%n", numeroConta, nomeTitular, saldo);
    }

    public void sacar(double valor) {
        if (saldo > 0 && saldo > valor) {
            this.saldo -= valor + 5;
            System.out.printf("Atualização da conta:%nConta: %d, Titular: %s, Saldo: %.2f%n", numeroConta, nomeTitular, saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }

    }

    public void exibirInformacoes() {
        System.out.printf("Dados da conta:%nConta: %d, Titular: %s, Saldo: %.2f%n", numeroConta, nomeTitular, saldo);
    }
}