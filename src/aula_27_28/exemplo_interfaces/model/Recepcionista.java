package aula_27_28.exemplo_interfaces.model;

import aula_27_28.exemplo_interfaces.interfaces.IRecepcionista;

public class Recepcionista extends Pessoa implements IRecepcionista {

	public Recepcionista() {
		super();
	}

	public Recepcionista(String nome, String telefone, String cpf) {
		super(nome, telefone, cpf);
	}

	@Override
	public void atender() {
		System.out.println("Recebo clientes no hotel...");
	}

	@Override
	public void falarIngles() {
		System.out.println("Falo inglês meia boca...");
	}

}
