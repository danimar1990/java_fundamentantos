package aula_11.heranca;

public class JogoTabuleiroAbstrato extends JogoAbstrato {

	// SOBRESCRITA
	@Override
	public void infoJogo() {
		System.out.println("Estou mostrando as informações da classe filha");
	}

}
