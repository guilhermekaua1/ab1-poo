public class Main {
    public static void main(String[] args) {
      Estacionamento estacionamento = new Estacionamento();
      estacionamento.estacionarCarro(new Carro("Astra", 5, 3));
      estacionamento.estacionarCarro(new Carro("Corsa", 5, 5));
  
      estacionamento.listarCarros();
  
      System.out.printf("\n O estacionamento tem %d pessoas no total", estacionamento.getTotalDePessoasNoEstacionamento());
  
    }
  }