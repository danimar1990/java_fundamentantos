package heranca;

public class JogoDados extends Jogo {
	private String tipoDado;
	private int quantDados;

	public void arremessarDado() {
		System.out.println("Dado aremessado!");
	}
	
	public void infoJogoDado() {
		super.infoJogo();
		System.out.println("Tipo de dado: " + this.getTipoDado());
		System.out.println("Quantidade de dados: " + this.getQuantDados());
	}

	public String getTipoDado() {
		return tipoDado;
	}

	public void setTipoDado(String tipoDado) {
		this.tipoDado = tipoDado;
	}

	public int getQuantDados() {
		return quantDados;
	}

	public void setQuantDados(int quantDados) {
		this.quantDados = quantDados;
	}

}
