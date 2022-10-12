import java.util.ArrayList;

class Compra {
    private ArrayList<Produto> carrinho = new ArrayList<>();

    void adicionarProduto(Produto produto) {
        carrinho.add(produto);
    }

    double total() {
        double total = 0;

        for (Produto produto : carrinho) {
            total += produto.getValor();
        }

        return total;
    }

    void listarProdutos() {
        for (Produto produto : carrinho) System.err.println(produto);
    }
}