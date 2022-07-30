package aula_23_24;

public final class Pagamento extends Venda {

	private int tipoPagamento;

	public Pagamento() {
		super();
	}

	public Pagamento(int tipoPagamento) {
		super();
		this.tipoPagamento = tipoPagamento;
	}

	public int getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(int tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public void selecionarTipoPagamento(int tpag) {
		this.tipoPagamento = tpag;
	}

	public void realizarPagamento(Pagamento pag) {
		String txtFormPag = "Forma de pagamento: ";
		if (pag.getTipoPagamento() == 1) {
			System.out.println(txtFormPag + "Dinheiro");
		} else if ((pag.getTipoPagamento() == 2)) {
			System.out.println(txtFormPag + "PIX");
		} else if ((pag.getTipoPagamento() == 3)) {
			System.out.println(txtFormPag + "Cartão de crédito");
		} else if ((pag.getTipoPagamento() == 4)) {
			System.out.println(txtFormPag + "Cartão de débito");
		} else {
			System.out.println("Forma de pagamento inválida!");
		}
	}
}
