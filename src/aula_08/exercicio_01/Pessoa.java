package aula_08.exercicio_01;

public class Pessoa {
	private String nome;
	private int anoNasc;
	private double altura;

	public Pessoa() {
		super();
	}

	public Pessoa(String nome, int anoNasc, double altura) {
		super();
		this.nome = nome;
		this.anoNasc = anoNasc;
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Utilizadno método toString():\nPessoa [nome=" + nome + ", anoNasc=" + anoNasc + ", altura=" + altura + "]";
	}

	public void exibirPessoa() {
		System.out.println("Nome: " + nome);
		System.out.println("Ano de nascimento: " + anoNasc);
		System.out.println("Altura: " + altura);
	}

	public void calcularIdade() {
		int idade;
		idade = 2022 - anoNasc;
		System.out.println(nome + " tem " + idade + " anos de idade!");
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

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
