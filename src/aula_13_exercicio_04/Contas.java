package aula_13_exercicio_04;

public class Contas {
	public static void main(String[] args) {
        ContaEspecial ce = new ContaEspecial(10000d);
        ce.depositar(1000.0);

        ContaPoupanca cp = new ContaPoupanca();
        cp.depositar(200.0);

    System.out.println("Conta especial: " + ce.getSaldo());
    System.out.println("Conta poupança: " + cp.getSaldo());
	}
}
