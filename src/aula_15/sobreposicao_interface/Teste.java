package aula_15.sobreposicao_interface;

public class Teste {
	public static void main(String[] args) {
		ContaCPF cpf = new ContaCPF();
		ContaCNPJ cnpj = new ContaCNPJ();

		cpf.solicitarDocumentos();
		cnpj.solicitarDocumentos();
	}

}
