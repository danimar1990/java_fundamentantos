package aula_32.exercicios.dominio;

import java.util.List;
import java.util.ArrayList;

public class Leilao {
	private String descricao;
	private List<Lance> lances;
	
	public Leilao(String descricao) {
		this.descricao = descricao;
		this.lances = new ArrayList<Lance>();
	}
	
	public void propoe (Lance lance) {
		lances.add(lance);
	}

	public String getDescricao() {
		return descricao;
	}

	public List<Lance> getLances() {
		return lances;
	}
	
}
