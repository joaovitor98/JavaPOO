package Aula6;

public class Conta {
    private Integer num;
    private String nomeTitular;
    protected Double balanco;

    public Conta(Integer num, String nomeTitular, Double balanco) {
        super();
        this.num = num;
        this.nomeTitular = nomeTitular;
        this.balanco = balanco;
    }

    public Conta() {
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public Double getBalanco() {
        return balanco;
    }

    public void saque(Double quantia) {
        balanco -= (quantia + 5);
    }

    public void deposito(Double quantia) {
        balanco += quantia;
    }

    @Override
    public String toString() {
        return "Conta:\nNome: " + nomeTitular + "\nNúmero: " + num + "\nSaldo: " + balanco;
    }

}
