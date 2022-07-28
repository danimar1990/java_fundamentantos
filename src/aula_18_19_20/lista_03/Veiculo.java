package aula_18_19_20.lista_03;

public class Veiculo {
	int ano;
	String modelo;
	String cor;
	double quilometragem;

	public Veiculo(int ano, String modelo, String cor, double quilometragem) {
		this.ano = ano;
		this.modelo = modelo;
		this.cor = cor;
		this.quilometragem = quilometragem;
	}

	String verificarManutencao() {
		if (quilometragem < 25000 && quilometragem >= 0) {
			return ("Tudo ok! Não será necessário realizar manutenção.");
		} else if (quilometragem >= 25000 && quilometragem <= 75000) {
			return ("Realizar revisão parcia!l");
		} else if (quilometragem > 75000) {
			return ("Realizar revisão completa!");
		} else {
			return ("Quilometragem incorreta!");
		}
	}

	String mudarCor(String novaCor) {
		cor = novaCor;
		return "Cor alterada com sucesso!";
	}

	String exibirCor() {
		return ("A cor do veículo é " + cor);
	}

}
