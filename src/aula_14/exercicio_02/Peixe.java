package aula_14.exercicio_02;

public class Peixe extends Animal {
	private String caracteristica;

	public Peixe(String nome, String cor, String ambiente, Double comprimento, int numeroPatas, double velocidade,
			String caracteristica) {
		super(caracteristica, velocidade, numeroPatas, caracteristica, caracteristica, velocidade);
		this.setNome(nome);
		this.setCor(cor);
		this.setAmbiente(ambiente);
		this.setComprimento(comprimento);
		this.setNroPatas(numeroPatas);
		this.setVelocidade(velocidade);
		this.caracteristica = caracteristica;
	}

	public void alteraCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	@Override
	public void exibeDados() {
		System.out.println("Nome:" + this.getNome());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Ambiente: " + this.getAmbiente());
		System.out.println("Comprimento: " + this.getComprimento() + "m");
		System.out.println("Número de patas: " + this.getNroPatas());
		System.out.println("Velocidade: " + this.getVelocidade());
		System.out.println("Característica: " + this.caracteristica);
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

}
