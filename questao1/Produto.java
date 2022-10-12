import java.util.ArrayList;

class Produto {
    private String nome;
    private ArrayList<Item> itens;

    public Produto(String nome, ArrayList<Item> itens) {
        this.nome = nome;
        this.itens = itens;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public double getValor() {
        double valor = 0;
        for (Item item : itens) valor += item.getValor();
        return valor;
    }

    @Override
    public String toString() {
        String itens = "";
        for (Item item : this.itens) itens += String.format("%s\n\n", item);
        
        return String.format("-=-=-=-=-=-=-=-=-=-\nNome do produto: %s\nValor: %f\nItens:\n%s\n-=-=-=-=-=-=-=-=-=-", nome, getValor(), itens);
    }
}