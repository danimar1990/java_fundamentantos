package aula_08.encapsulamento;

import java.util.ArrayList;

public class Garagem {
	private ArrayList<Carro> listacarros = new ArrayList<>();

	public void adicionarCarro(Carro c) {
		listacarros.add(new Carro(c.getModelo(), c.getMarca(), c.getAno()));
	}

	public void visualizarGaragem() {
		for (int cont = 0; cont < listacarros.size(); cont++) {
			System.out.println("Modelo: " + listacarros.get(cont).getModelo() + " Marca: "
					+ listacarros.get(cont).getMarca() + " Ano: " + listacarros.get(cont).getAno());
		}
	}

	public ArrayList<Carro> getListacarros() {
		return listacarros;
	}

	public void setListacarros(ArrayList<Carro> listacarros) {
		this.listacarros = listacarros;
	}

}
