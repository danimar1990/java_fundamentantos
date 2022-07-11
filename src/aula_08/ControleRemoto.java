package aula_08;

public class ControleRemoto {
	private int volumeMinimo = 1;
	private int volumeMaximo = 10;
	private int canalMinimo = 1;
	private int canalMaximo = 10;

	Televisao tv = new Televisao();

	public void aumentarVolume() {
		int volume = tv.getVolume();
		if (volume < volumeMaximo) {
			volume++;
			tv.setVolume(volume);
		} else {
			System.out.println("Você já está com o volume ao máximo!");
		}
	}

	public void diminuirVolume() {
		int volume = tv.getVolume();
		if (volume > volumeMinimo) {
			volume--;
			tv.setVolume(volume);
		} else {
			System.out.println("Você já está com o volume no mínimo!");
		}
	}

	public void aumentarCanal() {
		int canal = tv.getCanal();
		if (canal < canalMaximo) {
			canal++;
			tv.setCanal(canal);
		} else {
			System.out.println("Você já está no último canal!");
		}
	}

	public void diminuirCanal() {
		int canal = tv.getCanal();
		if (canal > canalMinimo) {
			canal--;
			tv.setCanal(canal);
		} else {
			System.out.println("Você já está no primeiro canal!");
		}
	}

	public void informacoesTv() {
		System.out.println("Canal atual: " + tv.getCanal());
		System.out.println("Volume atual: " + tv.getVolume());
	}

}
