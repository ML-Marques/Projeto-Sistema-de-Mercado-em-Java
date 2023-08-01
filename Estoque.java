import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;
    
    public Estoque() {
        produtos = new ArrayList<>();
    }
    
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }
    
    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }
    
    public void exibirProdutos() {
        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println();
        }
    }

    public Produto[] getProdutos() {
        return produtos.toArray(new Produto[0]);
    }

}

