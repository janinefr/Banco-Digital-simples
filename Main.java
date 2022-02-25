
public class Main {
  public static void main(String[] args) {

    Cliente janine = new Cliente();
    janine.setNome("Janine");
    
    Conta cc = new ContaCorrente(janine);
    Conta poupanca = new ContaPoupanca(janine);

    cc.imprimirExtrato();
    poupanca.imprimirExtrato();
  }
}