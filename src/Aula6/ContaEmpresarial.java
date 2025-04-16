package Aula6;

public class ContaEmpresarial extends Conta {
    private Double limiteEmprestimo;

    public ContaEmpresarial() {
        super();
    }

    public ContaEmpresarial(Integer num, String nomeTitular, Double balanco, Double limiteEmprestimo) {
        super(num, nomeTitular, balanco);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void emprestimo(Double valor) {
        deposito(valor);
        limiteEmprestimo -= valor;
    }

    @Override
    public void saque(Double quantia) {
        super.saque(quantia);
        balanco -= 2;
    }

    @Override
    public String toString() {
        return "ContaEmpresarial:\nNome: " + getNomeTitular() + "\nConta: " + getNum() + "\nLimite de Empréstimo: "
                + limiteEmprestimo + "\nSaldo: " + getBalanco();

    }
}