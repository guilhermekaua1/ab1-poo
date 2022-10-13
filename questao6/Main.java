import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<ContaCorrente> contas = new ArrayList<>();

    Cliente cliente = new Cliente("Guilherme", contas);

    contas.add(new ContaCorrente(700));
    contas.add(new ContaEspecial(900, 250));

    System.out.println(cliente.getNome() + " tem atualmente o saldo de $ " + cliente.getContas().get(0) + " reais na Conta Corrente e $"+ cliente.getContas().get(1)+ " reais na Conta Especial.");
  }
}