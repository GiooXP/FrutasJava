import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int id;
    private String nome;
    private String cpf;

    public Cliente(int id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }


    public static List<Cliente> obterClientesPreCadastrados() {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente(1, "Giovanna Costa", "123.456.789-00"));
        clientes.add(new Cliente(2, "Natalia Zaniboni", "987.654.321-11"));
        clientes.add(new Cliente(3, "Bianca Caetano", "456.789.123-22"));
        return clientes;
    }

    @Override
    public String toString() {
        return "ID: " + id + "  Nome: " + nome + "  CPF: " + cpf;
    }
}