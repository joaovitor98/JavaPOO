package Aula7;

public class Circulo extends Forma {
    private Double raio;

    public Circulo() {

    }

    public Circulo(Double raio) {
        super();
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(raio, 2);
    }

}
