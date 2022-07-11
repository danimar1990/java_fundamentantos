package aula_11;

public class PrincipalIngresso {

	public static void main(String[] args) {
		IngressoVIP vip = new IngressoVIP();

		vip.setValor(100d);
		vip.setValorAdicional(50d);

		System.out.println(vip.toString());
	}

}
