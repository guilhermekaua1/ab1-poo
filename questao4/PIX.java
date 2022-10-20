public class PIX implements MetodoPagamento{

    @Override
    public String processar() {
        return "Pagamento realizado pelo Pix";
    }
}