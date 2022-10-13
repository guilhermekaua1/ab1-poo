public class Carro{
    private String carro;
    private int capacidadeMax;
    private int quantidadeDePessoas;
  
    
    public Carro(String carro, int capacidadeMax, int quantidadeDePessoas) {
      
      if (quantidadeDePessoas > capacidadeMax){
        System.out.printf("\n O carro %s não comporta mais que %d pessoas", carro, capacidadeMax);
        System.exit(1);
      }
      this.carro = carro;
      this.capacidadeMax = capacidadeMax;
      this.quantidadeDePessoas = quantidadeDePessoas;
    }
    
    public String getCarro() {
      return carro;
    }
  
    public int getCapacidadeMax() {
      return capacidadeMax;
    }
  
    public int getQuantidadeDePessoas() {
      return quantidadeDePessoas;
    }
    
    @Override
    public String toString() {
      return String.format("\n Carro: %s \n Capacidade máxima de pessoas: %d\n Quantidade de pessoas: %d", carro, capacidadeMax, quantidadeDePessoas);
    }
  }