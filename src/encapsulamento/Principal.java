package encapsulamento;

public class Principal {
	public static void main(String[] args) {
		Carro carro = new Carro();
		
		carro.setAno(2019);
		carro.setMarca("Audi");
		carro.setModelo("Quattro Q6");
		
		System.out.println(carro.getAno());
		System.out.println(carro.getMarca());
		System.out.println(carro.getModelo());
		
	}
}
