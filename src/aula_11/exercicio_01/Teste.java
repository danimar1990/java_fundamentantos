package aula_11.exercicio_01;

public class Teste {

	public static void main(String[] args) {
		IngressoVIP vip = new IngressoVIP();
		Ingresso ingresso = new Ingresso();

		ingresso.setValor(100d);
		vip.setValor(100d);
		vip.setValorAdicional(50d);

		System.out.println(ingresso.toString());
		System.out.println(vip.toString());
	}

}
