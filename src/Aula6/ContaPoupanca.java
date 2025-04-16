package Aula6;

public class ContaPoupanca extends Conta {

    private Double taxaJuros;

    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(Integer num, String nomeTitular, Double balanco, Double taxaJuros) {
        super(num, nomeTitular, balanco);
        this.taxaJuros = taxaJuros;
    }

    public Double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    @Override
    public void saque(Double quantia) {
        balanco -= quantia;
    }

    public Double atualizarBalanco() {
        balanco += balanco * taxaJuros;
        return balanco;
    }

    @Override
    public String toString() {
        return "ContaPoupanca:\nNome: " + getNomeTitular() + "\nConta: " + getNum() + "\nSaldo: " + balanco
                + "\nTaxa de Juros: " + taxaJuros;
    }

}
