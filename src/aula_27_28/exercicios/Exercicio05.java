package aula_27_28.exercicios;

public class Exercicio05 {
	public String getEnunciado() {
		String enunciado = "Sem executar o código tente determinar qual é o valor que será impresso. Após "
				+ "isso execute o código para verificar se sua resposta estava correta."
				+ "\n1 public class Exercicios {"
				+ "\n2	public static void main(String[] args) {"
				+ "\n3		int raio = 5000;"
				+ "\n4		int circunferencia = (int) (2 * Math.PI * raio);"
				+ "\n5		System.out.println(circunferencia);"
				+ "\n6	}"
				+ "\n7 }";
		return enunciado;
	}

	public void getCircunferencia() {
		int raio = 5000;
		int circunferencia = (int) (2 * Math.PI * raio);
		System.out.println("Área da circunferência: " + circunferencia);
	}

}
