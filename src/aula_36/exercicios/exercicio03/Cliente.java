package aula_36.exercicios.exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String nome;
	private List<ContaCorrente> contasCorrente = new ArrayList<>();
	private List<ContaEspecial> contasEspecial = new ArrayList<>();

	public Cliente() {
	}

	public Cliente(String nome) {
		super();
		this.nome = nome;
	}

	public void criarContaCorrente(float saldo) {
		this.contasCorrente.add(new ContaCorrente(saldo));
	}

	public void criarContaEspecial(float saldo, float limite) {
		this.contasEspecial.add(new ContaEspecial(saldo, limite));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<ContaCorrente> getContasCorrente() {
		return contasCorrente;
	}

	public void setContasCorrente(List<ContaCorrente> contasCorrente) {
		this.contasCorrente = contasCorrente;
	}

	public List<ContaEspecial> getContasEspecial() {
		return contasEspecial;
	}

	public void setContasEspecial(List<ContaEspecial> contasEspecial) {
		this.contasEspecial = contasEspecial;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", contasCorrente=" + contasCorrente + ", contasEspecial=" + contasEspecial
				+ "]";
	}

}
