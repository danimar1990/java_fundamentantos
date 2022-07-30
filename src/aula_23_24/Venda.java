package aula_23_24;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Venda {

	private double vlrTotal;
	ArrayList<Produto> listaVenda = new ArrayList<>();

	public Venda() {
		super();
	}

	public Venda(double vlrTotal, ArrayList<Produto> listaVenda) {
		super();
		this.vlrTotal = vlrTotal;
		this.listaVenda = listaVenda;
	}

	public void adicionarItemVenda(Produto prod) {
		if (prod.verificarEstoque(prod) == true) {
			listaVenda.add(prod);
			this.vlrTotal = this.getVlrTotal() + prod.getPreco();
		} else {
			System.out.println("Produto sem estoque!");
		}
	}

	public void visualizarVenda() {
		DecimalFormat df = new DecimalFormat("#,###.00");

		for (int i = 0; i < this.listaVenda.size(); i++) {
			System.out.println("Produto " + (i + 1) + ": " + this.listaVenda.get(i).getNome() + "\nPreço: R$ "
					+ df.format(this.listaVenda.get(i).getPreco()) + "\n");
		}
	}

	public void concluirVenda(Pagamento pag) {
		DecimalFormat df = new DecimalFormat("#,###.00");

		System.out.println();
		System.out.println("Total da venda: R$ " + df.format(this.getVlrTotal()));
		pag.realizarPagamento(pag);
		this.listaVenda.clear();
	}

	public double getVlrTotal() {
		return vlrTotal;
	}

	public void setVlrTotal(double vlrTotal) {
		this.vlrTotal = vlrTotal;
	}

	public ArrayList<Produto> getListaVenda() {
		return listaVenda;
	}

	public void setListaVenda(ArrayList<Produto> listaVenda) {
		this.listaVenda = listaVenda;
	}
}
