package aula_27_28.exemplo_interfaces.model;

import aula_27_28.exemplo_interfaces.interfaces.ICamareira;

public class Camareira extends Pessoa implements ICamareira {

	public Camareira() {
		super();
	}

	public Camareira(String nome, String telefone, String cpf) {
		super(nome, telefone, cpf);
	}

	@Override
	public void arrumarACama() {
		System.out.println("Arrumo camas...");
	}

	@Override
	public void limparQuarto() {
		System.out.println("Limpo quartos...");
	}

}
