package aula_05;

public class Joystick {
	String modelo;
	String cor;
	int porcentagemBateria;

	public Joystick() {
	}

	public Joystick(String modelo) {
		this.modelo = modelo;
	}

	public Joystick(String modelo, String cor, int porcentagemBateria) {
		this.modelo = modelo;
		this.cor = cor;
		this.porcentagemBateria = porcentagemBateria;
	}

	void visualizarInfoJoystick() {
		System.out.println("Modelo: " + modelo);
		System.out.println("Cor: " + cor);
		System.out.println("Porcentagem Bateria: " + porcentagemBateria);

		if (porcentagemBateria <= 15) {
			System.out.println("Status: Bateria fraca");
		} else if (porcentagemBateria <= 50) {
			System.out.println("Status: Bateria com metade da capacidade");
		} else {
			System.out.println("Status: Bateria em n�vel normal");
		}
	}

	void conectar() {
		System.out.println("Joystick " + modelo + " est� conectado ao v�deo game!");
	}

	void recarregar() {
		System.out.println("Joystick " + modelo + " est� carregando...");
	}

}
