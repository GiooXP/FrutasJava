import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        System.out.println(" SISTEMA DE HORTIFRUTI - FRUTAS JAVA ");
        System.out.println();

       
        List<Cliente> clientesCadastrados = Cliente.obterClientesPreCadastrados();

        System.out.println("Clientes Cadastrados no Sistema");
        for (Cliente c : clientesCadastrados) {
            System.out.println(c);
        }
        System.out.println();

    
        Cliente clienteSelecionado = clientesCadastrados.get(1);
        System.out.println(">> Cliente logado para a compra: " + clienteSelecionado.getNome());
        System.out.println();

        
        List<Banana> listaDeBananas = new ArrayList<>();
        listaDeBananas.add(new Banana("Prata", 6.99, 50));
        listaDeBananas.add(new Banana("Nanica", 4.89, 80));
        listaDeBananas.add(new Banana("Maçã", 8.50, 30));

        System.out.println("Bananas Disponíveis no Estoque");
        for (int i = 0; i < listaDeBananas.size(); i++) {
            System.out.print("[" + (i + 1) + "] ");
            listaDeBananas.get(i).exibirDetalhes();
        }
        System.out.println();

      
        Banana bananaEscolhida = listaDeBananas.get(0);
        int quantidadeDesejada = 12; 

        System.out.println(" RESUMO DA COMPRA ");
        System.out.println("Cliente: " + clienteSelecionado.getNome() + " (CPF: " + clienteSelecionado.getCpf() + ")");
        System.out.println("Item Escolhido: " + bananaEscolhida.getNome());
        System.out.println("Quantidade Comprada: " + quantidadeDesejada + " unidades");

        
        bananaEscolhida.setQuantidadeEstoque(bananaEscolhida.getQuantidadeEstoque() - quantidadeDesejada);

        System.out.println("Novo estoque de " + bananaEscolhida.getNome() + ": " + bananaEscolhida.getQuantidadeEstoque() + " unidades");
        System.out.println();
        System.out.println("Status: Compra realizada com sucesso!");
    }
}