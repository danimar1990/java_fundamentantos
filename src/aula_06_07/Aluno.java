package aula_06_07;

public class Aluno {
	public String nome;
	public int idade;
	public double n1;
	public double n2;
	public double n3;
	public double media;
	
	public Aluno() {}
	
	public Aluno(String nome, int idade, double n1, double n2, double n3, double media) {
		this.nome = nome;
		this.idade = idade;
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.media = media;
	}
	
	public void getDadosAluno() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade + " anos");
	}

	public void calcularMedia(double n1, double n2, double n3) {
		media = (n1 + n2 + n3) / 3;
		System.out.println("A média do aluno é " + media);
	}

	public void verificarAprovacao(double media) {
		System.out.print("Situação: ");
		if (media < 5) {
			System.out.println("Reprovado");
		} else if (media >= 5 && media < 7) {
			System.out.println("Em exame");
		} else {
			System.out.println("Aprovado");
		}
	}
}
