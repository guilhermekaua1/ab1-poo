public class Boleto implements MetodoPagamento{

    @Override
    public String processar() {
        return "Pagamento realizado pelo Boleto";
    }
}