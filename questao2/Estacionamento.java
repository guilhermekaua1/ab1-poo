import java.util.ArrayList;

public class Estacionamento {

  private ArrayList<Carro> carros = new ArrayList<>();

  void estacionarCarro(Carro carro) {
    carros.add(carro);
  }

  int getTotalDePessoasNoEstacionamento() {
    int totalDePessoas = 0;
    for (Carro carro : carros){
      totalDePessoas += carro.getQuantidadeDePessoas();
    }
    return totalDePessoas;
  }

  public void listarCarros() {
    for (Carro carro : carros){
      System.out.println(carro);
    }
  }
}