package aula_08.exercicio_02;

public class Televisao {
	private int canal;
	private int volume;

	@Override
	public String toString() {
		return "Televisao [canal=" + canal + ", volume=" + volume + "]";
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

}
