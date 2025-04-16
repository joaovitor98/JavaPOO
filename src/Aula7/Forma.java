package Aula7;

public abstract class Forma {

    public Forma() {

    }

    public Forma(Cor cor) {
        super();
    }

    private Cor cor;

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public abstract double area();
}
