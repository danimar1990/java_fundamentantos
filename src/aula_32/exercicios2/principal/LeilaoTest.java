package aula_32.exercicios2.principal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import aula_32.exercicios2.dominio.Avaliador;
import aula_32.exercicios2.dominio.Lance;
import aula_32.exercicios2.dominio.Leilao;
import aula_32.exercicios2.dominio.Usuario;

class LeilaoTest {
	@Test
	public void testarLancesOrdemCrescente() {
		Usuario joao = new Usuario("João");
		Usuario jose = new Usuario("José");
		Usuario maria = new Usuario("Maria");

		System.out.println("Início do leilão");
		System.out.println("================");

		Leilao leilao = new Leilao("Playstation 5");

		leilao.propoe(new Lance(maria, 2500.0));
		leilao.propoe(new Lance(joao, 3000.0));
		leilao.propoe(new Lance(jose, 4000.0));

		Avaliador avaliador = new Avaliador();
		avaliador.avalia(leilao);

		double maiorLanceEsperado = 4000;
		double menorLanceEsperado = 2500;

		assertEquals(maiorLanceEsperado, avaliador.getMaiorLance());
		assertEquals(menorLanceEsperado, avaliador.getMenorLance());
	}

	@Test
	public void testarLancesOrdemDecrescente() {
		Usuario pablo = new Usuario("Pablo");
		Usuario andre = new Usuario("André");
		Usuario jonas = new Usuario("Jonas");

		System.out.println("Início do leilão");
		System.out.println("================");

		Leilao leilao = new Leilao("Câmera Tek Pix - 9ª geração");

		leilao.propoe(new Lance(pablo, 6500.0));
		leilao.propoe(new Lance(andre, 4999.0));
		leilao.propoe(new Lance(jonas, 4250.0));

		Avaliador avaliador = new Avaliador();
		avaliador.avalia(leilao);

		double maiorLanceEsperado = 7000;
		double menorLanceEsperado = 4000;

		
		assertEquals(maiorLanceEsperado, avaliador.getMaiorLance());
		assertEquals(menorLanceEsperado, avaliador.getMenorLance());
	}

}
