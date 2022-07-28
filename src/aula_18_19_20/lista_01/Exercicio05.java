package aula_18_19_20.lista_01;

public class Exercicio05 {

	public String podeVotar(int idade, String nome) {
		if (idade < 16) {
			return (nome + ", você não tem idade suficiente para votar!");
		} else {
			return (nome + ", você pode votar!");
		}
	}

}
