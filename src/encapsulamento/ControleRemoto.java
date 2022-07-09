package encapsulamento;

public class ControleRemoto {
	private int volumeMaximo = 100;
	private int canalMaximo = 10;

	Televisao tv = new Televisao();

	public void aumentarVolume() {
		int volume = tv.getVolume();
		if (volume < volumeMaximo) {
			volume++;
			tv.setVolume(volume);
		} else {
			System.out.println("Voc� j� est� com o volume ao m�ximo!");
		}
	}

	public void diminuirVolume() {
		int volume = tv.getVolume();
		if (volume > volumeMaximo) {
			volume--;
			tv.setVolume(volume);
		} else {
			System.out.println("Voc� j� est� com o volume no m�nimo!");
		}
	}

	public void aumentarCanal() {
		int canal = tv.getCanal();
		if (canal < canalMaximo) {
			canal++;
			tv.setCanal(canal);
		} else {
			System.out.println("Voc� j� est� no �ltimo canal!");
		}
	}

	public void diminuirCanal() {
		int canal = tv.getCanal();
		if (canal < canalMaximo) {
			canal--;
			tv.setCanal(canal);
		} else {
			System.out.println("Voc� j� est� no primeiro canal!");
		}
	}
	
	public void informacoesTv() {
		System.out.println("Canal atual: " + tv.getCanal());
		System.out.println("Volume atual: " + tv.getVolume());
	}
}
