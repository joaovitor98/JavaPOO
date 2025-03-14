package Ex3;

public class Estudante {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public Estudante(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularNotaFinal() {
        return nota1 + nota2 + nota3;
    }

    public String aprovacao() {
        if (calcularNotaFinal() >= 70) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public double pontosFaltantes() {
        if (calcularNotaFinal() <= 70) {
            return 70 - calcularNotaFinal();
        } else {
            return 0;
        }
    }

    public void exibirInformacoes() {
        System.out.printf("%nAluno: %s%nNota Final: %.2f%n%s%nFaltam %.2f pontos", nome, calcularNotaFinal(), aprovacao(), pontosFaltantes());
    }
}
