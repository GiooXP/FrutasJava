public abstract class Frutas {
    private String nome;
    private double precodoKilo;

    public Frutas(String nome, double precodoKilo) {
        this.nome = nome;
        this.precodoKilo = precodoKilo;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecodoKilo() {
        return precodoKilo;
    }

    public abstract void exibirDetalhes();
}