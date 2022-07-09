package aula_05;

public class Joystick {
	public String modelo;
	public String cor;
	public int porcentagemBateria;
	
	public Joystick() {
		super();
	}
	
	public Joystick(String modelo) {
		this.modelo = modelo;
	}

	public Joystick(String modelo, String cor, int porcentagemBateria) {
		super();
		this.modelo = modelo;
		this.cor = cor;
		this.porcentagemBateria = porcentagemBateria;
	}

	void visualizarjoystick() {
		System.out.println("----------------------------------------------------");
		System.out.println("Método visualizarJoystick():");
		System.out.println("Modelo: " + modelo);
		System.out.println("Cor: " + cor);
		System.out.println("Porcentagem bateria: " + porcentagemBateria + "%");
		System.out.println("Status da bateria: " + statusBateria());
	}
	
	void conectar() {
		System.out.println();
		System.out.println("Método conectar():");
		System.out.println("O Joystick " + modelo + " " + cor + " está conectado agora!");
	}
	
	void recarregar() {
		System.out.println();
		System.out.println("Método recarregar():");
		System.out.println("O Joystick " + modelo + " está carregando agora e está com " + porcentagemBateria + "% de bateria!");
		System.out.println("----------------------------------------------------");
	}
	
	public int statusBateria() {
		int status = porcentagemBateria;
		if (porcentagemBateria < 11) {
			System.out.println(" Crítico!");
		} else if (porcentagemBateria > 11 && porcentagemBateria < 40) {
			System.out.println("Atenção!");
		} else {
			System.out.println("Carga suficiente!");
		}
		return status;
	}
}
