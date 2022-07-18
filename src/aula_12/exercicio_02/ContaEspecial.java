package aula_12.exercicio_02;

public class ContaEspecial extends ContaCorrente {
	private float limite;

	public ContaEspecial(float limite) {
		super();
		this.limite = limite + saldo;
	}

	@Override
	public void sacar(float valor) {
		super.sacar(valor);
	}

	@Override
	public String toString() {
		return "---[ContaEspecial]---" + "\nLimite: " + limite + "\nSaldo: " + super.getSaldo();
	}

}
