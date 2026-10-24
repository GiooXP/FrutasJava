public class Banana extends Frutas {
    private String tipo;
    private int quantidadeEstoque;

    public Banana(String tipo, double precodoKilo, int quantidadeEstoque) {
        super("Banana " + tipo, precodoKilo);
        this.tipo = tipo;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getTipo() {
        return tipo;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public void exibirDetalhes() {
        System.out.printf("Banana %s - R$ %.2f/kg | Estoque: %d unidades%n", 
                tipo, getPrecodoKilo(), quantidadeEstoque);
    }
}