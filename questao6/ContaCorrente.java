public class ContaCorrente {
    protected double saldo;
  
    ContaCorrente(){
      saldo = 0;
    }
  
    public ContaCorrente(double saldo) {
      this.saldo = saldo;
    }
  
    public double getSaldo() {
      return saldo;
    }
  
    public void setSaldo(double saldo) {
      this.saldo = saldo;
    }
  
    public void depositar(double valor){
       if (valor < 0){
        System.out.println("Valor inválido");
      } else setSaldo(valor + this.getSaldo());
    }
  
    public boolean sacar(double valor){
      if ((saldo - valor) < 0) return false;
      saldo -= valor;
      return true;
    }
  
    protected boolean transferir(ContaCorrente conta){
      double valorDeTransferencia = this.getSaldo();
      this.sacar(valorDeTransferencia);
      conta.depositar(valorDeTransferencia);
      return true;
    }
  
    @Override
    public String toString() {
      return String.format("%.2f", saldo);
    }
  }