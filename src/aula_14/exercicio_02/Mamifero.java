package aula_14.exercicio_02;

public class Mamifero extends Animal {
	private String alimento;

	public Mamifero(String nome, String cor, String ambiente, Double comprimento, int nroPatas, double velocidade,
			String alimento) {
		super(alimento, velocidade, nroPatas, alimento, alimento, velocidade);
		this.setNome(nome);
		this.setCor(cor);
		this.setAmbiente(ambiente);
		this.setComprimento(comprimento);
		this.setNroPatas(nroPatas);
		this.setVelocidade(velocidade);
		this.alimento = alimento;
	}

	public void alteraAlimento(String alimento) {
		this.alimento = alimento;
	}

	@Override
	public void exibeDados() {
		System.out.println("Nome:" + this.getNome());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Ambiente: " + this.getAmbiente());
		System.out.println("Comprimento: " + this.getComprimento() + "cm");
		System.out.println("Número de patas: " + this.getNroPatas());
		System.out.println("Velocidade: " + this.getVelocidade());
		System.out.println("Alimento: " + this.alimento);
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

}
