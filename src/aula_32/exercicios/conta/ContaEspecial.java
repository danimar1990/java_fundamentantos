package aula_32.exercicios.conta;

public class ContaEspecial extends ContaCorrente {
	protected float limite;

	public ContaEspecial() {
		super();
	}

	public ContaEspecial(float saldo, float limite) {
		super(saldo);
		this.limite = limite;
	}

	@Override
	public boolean sacar(float saque) {
		if (super.saldo + this.limite - saque >= 0) {
			return super.sacar(saque);
		}
		return false;
	}

	
}
