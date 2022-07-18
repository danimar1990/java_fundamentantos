package aula_14.exercicio_01;

public class Teste {
	public static void main(String[] args) {
		ContaPoupanca cp = new ContaPoupanca("Danimar", 298637, 500d, 5);
		ContaEspecial ce = new ContaEspecial("Jaqueline", 299863, 850d, 2000d);

		System.out.println(cp.toString() + "\n\n" + ce.toString());
		System.out.println();
		cp.depositar(2000d);
		ce.sacar(10000d, 1500d);
		System.out.println();
		System.out.println(cp.toString() + "\n\n" + ce.toString());
	}

}
