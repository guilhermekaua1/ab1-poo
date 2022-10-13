import java.util.ArrayList;

public class Cliente {
  private String nome;
  private ArrayList<ContaCorrente> contas;

  public Cliente(String nome, ArrayList<ContaCorrente> contas) {
    this.nome = nome;
    this.contas = contas;
  }

  public ArrayList<ContaCorrente> getContas() {
    return contas;
  }

  public void setContas(ArrayList<ContaCorrente> contas) {
    this.contas = contas;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  @Override
  public String toString() {
    return String.format("\nCliente: %s\n", nome);
  }
}