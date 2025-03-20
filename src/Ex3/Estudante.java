package Ex3;

public class Estudante {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

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
