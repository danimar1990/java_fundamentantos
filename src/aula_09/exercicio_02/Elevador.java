package aula_09.exercicio_02;

public class Elevador {
	private int andar = 0;
	private int qtdAndares;
	private int capacidade;
	private int qtdPessoas = 0;

	public Elevador() {
	}

	public Elevador(int qtdAndares, int capacidade) {
		super();
		this.qtdAndares = qtdAndares;
		this.capacidade = capacidade;
	}

	public Elevador(int andar, int qtdAndares, int capacidade, int qtdPessoas) {
		super();
		this.andar = andar;
		this.qtdAndares = qtdAndares;
		this.capacidade = capacidade;
		this.qtdPessoas = qtdPessoas;
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}

	public int getQtdAndares() {
		return qtdAndares;
	}

	public void setQtdAndares(int qtdAndares) {
		this.qtdAndares = qtdAndares;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getQtdPessoas() {
		return qtdPessoas;
	}

	public void setQtdPessoas(int qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}

	@Override
	public String toString() {
		return "Elevador [andar=" + andar + ", qtdAndares=" + qtdAndares + ", capacidade=" + capacidade
				+ ", qtdPessoas=" + qtdPessoas + "]";
	}

	public Elevador inicializa(int qtdAndares, int capacidade) {
		return new Elevador(qtdAndares, capacidade);
	}

	public void entra() {
		if (qtdPessoas < capacidade) {
			System.out.println("Pessoa pode entrar!");
			qtdPessoas++;
		} else {
			System.out.println("O elevador está lotado!");
		}
	}

	public void sai() {
		if (qtdPessoas > 0) {
			System.out.println("Pessoa pode sair!");
			qtdPessoas--;
		} else {
			System.out.println("Não há pessoas no elevador!");
		}
	}

	public void sobe() {
		if (andar < qtdAndares) {
			System.out.println("O elevador pode subir!");
			andar++;
		} else {
			System.out.println("O elevador já está no último andar!");
		}
	}

	public void desce() {
		if (andar > 0) {
			System.out.println("O elevador pode descer!");
			andar--;
		} else {
			System.out.println("O elevador já está no térreo!");
		}
	}
}
