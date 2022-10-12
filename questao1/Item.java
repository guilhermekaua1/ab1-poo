class Item {
    private String nome;
    private double valor;

    Item(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return String.format("\t- Nome do item: %s\n\t- Valor do item: %f", nome, valor);
    }
}