public abstract class UFALBluetooth{

    public UFALBluetooth(){
        abrirConexão();
        processarDados();
        fecharConexão();
    }

    public void abrirConexão() {
        System.out.println("Conetando -> UFALBluetooth");
    }
    
    public abstract void processarDados();

    public void fecharConexão() {
        System.out.println("UFALBluetooth encerrada!");
    }
    
}