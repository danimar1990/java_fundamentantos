package aula_36.exercicios.exercicio03;

public final class ContaCorrenteTest {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();

		// MESMO CLIENTE COM DUAS CONTAS DIFERENTES
		cliente.setNome("Danimar Henrique Varisa");
		cliente.criarContaCorrente(100);
		cliente.criarContaEspecial(100, 50);

		// SAQUE DE VALOR > QUE O SALDO DA CONTA CORRENTE
		cliente.getContasCorrente().get(0).depositar(100);
		try {
			cliente.getContasCorrente().get(0).sacar(200);
		} catch (SaldoInsuficienteContaCorrenteException e) {
			System.out.println(e.getMessage() + e.getValor());
		} catch (SaldoInsuficienteContaEspecialException e) {
		}

		System.out.println(cliente.getContasCorrente().get(0).getSaldo());

		// SAQUE DE VALOR > QUE O SALDO E < QUE LIMITE DA CONTA ESPECIAL
		cliente.getContasEspecial().get(0).depositar(100);
		try {
			cliente.getContasEspecial().get(0).sacar(250);
		} catch (SaldoInsuficienteContaCorrenteException e) {
		} catch (SaldoInsuficienteContaEspecialException e) {
			System.out.println(e.getMessage() + e.getValor());
		}
		System.out.println(cliente.getContasEspecial().get(0).getSaldo());
		System.out.println(cliente.getContasEspecial().get(0).getLimite());

		cliente.criarContaEspecial(100, 50);

		// SAQUE DE VALOR > QUE O SALDO E > QUE LIMITE DA CONTA ESPECIAL
		cliente.getContasEspecial().get(1).depositar(100);
		try {
			cliente.getContasEspecial().get(0).sacar(250);
		} catch (SaldoInsuficienteContaCorrenteException e) {
		} catch (SaldoInsuficienteContaEspecialException e) {
			System.out.println(e.getMessage() + e.getValor());
		}
		System.out.println(cliente.getContasEspecial().get(1).getSaldo());
		System.out.println(cliente.getContasEspecial().get(1).getLimite());
	}

}
