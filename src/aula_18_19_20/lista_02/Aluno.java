package aula_18_19_20.lista_02;

public class Aluno {
	String nome;
	int idade;
	double media = 0.00;

	public Aluno() {
	}

	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	String calcularMedia(double n1, double n2, double n3) {
		this.media = (n1 + n2 + n3) / 3;
		return ("Sua média é: " + this.media);
	}

	String verificarAprovacao() {
		if (media < 5 && media >= 0) {
			return ("Reprovado");
		} else if (media >= 5 && media < 7) {
			return ("Em exame");
		} else if (media > 7 && media <= 10) {
			return ("Aprovado");
		} else {
			return ("Ocoreu um erro ao calcular as notas. Verifique!");
		}
	}

}
