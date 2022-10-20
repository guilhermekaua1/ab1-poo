public class Main {

    public static void main(String[] args) {
        Boleto b = new Boleto();

        PagamentoAlt pagamento = new PagamentoAlt();
        pagamento.pagar(b);

        PIX p = new PIX();
        pagamento.pagar(p);
    }
}