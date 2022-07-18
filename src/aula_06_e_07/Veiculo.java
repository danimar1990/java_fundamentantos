package aula_06_e_07;

public class Veiculo {
	int ano;
	String modelo;
	String cor;
	Double quilometragem;

	public Veiculo() {
	}
	
	public Veiculo(String cor) {
		this.cor = cor;
	}

	public Veiculo(int ano, String modelo, String cor, Double quilometragem) {
		this.ano = ano;
		this.modelo = modelo;
		this.cor = cor;
		this.quilometragem = quilometragem;
	}

	public void verificarManutencao() {
		if (quilometragem < 25000) {
			System.out.println("Tudo ok!" );
		} else if (quilometragem >= 25000 && quilometragem < 75000) {
			System.out.println("Realizar revisão parcial!");
		} else {
			System.out.println("Realizar revisão completa!");
		}
	}

	public void exibirCor() {
		System.out.println("Cor de fábrica: " + cor);
	}
	
	public void mudarCor(String novaCor) {
		this.cor = novaCor;
		System.out.println("Nova cor: " + cor);
	}
}
