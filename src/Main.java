
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Teste");

		Conta contaCorrente = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		contaCorrente.depositar(500);
		contaCorrente.transferir(130, poupanca);

		contaCorrente.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
