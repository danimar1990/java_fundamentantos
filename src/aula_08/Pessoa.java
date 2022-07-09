package aula_08;

public class Pessoa {
	private String nome;
	private int anoNasc;
	private Double altura;

	public Pessoa() {
	}

	public Pessoa(String nome, int anoNasc, Double altura) {
		super();
		this.nome = nome;
		this.anoNasc = anoNasc;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNasc() {
		return anoNasc;
	}

	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "---[Dados pessoais]---"
				+ "\n Nome: " + nome
				+ "\n Nascimento: "+ anoNasc
				+ "\n Altura: " + altura;
	}

	public void imprimeDadosPessoais() {
		Main.separador();
		System.out.println("Via método imprimeDadosPessoais():");
		System.out.println("---[Dados pessoais]---");
		System.out.println("Nome: " + this.nome);
		System.out.println("Nascimento: " + this.anoNasc);
		System.out.println("Altura: " + this.altura);
	}

	public void calculaIdade() {
		int idade = 2022 - this.anoNasc;
		System.out.println("Idade: " + idade);
	}

}
