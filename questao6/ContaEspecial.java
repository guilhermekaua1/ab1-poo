public class ContaEspecial extends ContaCorrente {
  
    private float limite;
    
    public ContaEspecial(float limite) {
      this.limite = limite;
    }
  
    public ContaEspecial(double saldo, float limite) {
      super(saldo);
      this.limite = limite;
    }
  
    @Override
    public boolean sacar(double valor) {
      if (saldo + limite - valor < 0) return false;
      saldo -= valor;
      return true;
    }
  
  }