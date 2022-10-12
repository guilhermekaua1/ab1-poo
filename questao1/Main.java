import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Compra compra = new Compra();
        ArrayList<Item> itensMonitor = new ArrayList<>();
        itensMonitor.add(new Item("Tela", 550));
        itensMonitor.add(new Item("Carcaça", 300));
        compra.adicionarProduto(new Produto("Monitor", itensMonitor));

        ArrayList<Item> itensDoJogo = new ArrayList<>();
        itensDoJogo.add(new Item("Conteúdo do jogo", 60));
        itensDoJogo.add(new Item("CD", 10));
        compra.adicionarProduto(new Produto("Jogo: RainbowSix", itensDoJogo));

        compra.listarProdutos();
        System.out.println("Valor total: " + compra.total());
    }
}