public class CartaoCredito implements MetodoPagamento{

    @Override
    public String processar() {
        return "Pagamento realizado pelo Cartão de Credito";
    }
}