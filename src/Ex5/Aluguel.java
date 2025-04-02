package Ex5;

public class Aluguel {
    private String nome;
    private String email;
    private int numQuartos;

    public Aluguel(String nome, String email, int numQuartos) {
        this.nome = nome;
        this.email = email;
        this.numQuartos = numQuartos;
    }

    public void quartosAlugados() {
        if (numQuartos < 10) {
            System.out.println("Quarto alugado: " + numQuartos);
        } else {
            System.out.println("Quarto inexistente");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumQuartos() {
        return numQuartos;
    }

    public void setNumQuartos(int numQuartos) {
        this.numQuartos = numQuartos;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome() + "\nEmail: " + getEmail() + "\nQuarto: " + getNumQuartos());
    }
}