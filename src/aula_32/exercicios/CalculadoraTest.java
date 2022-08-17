package aula_32.exercicios;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class CalculadoraTest {
	// TESTES SOMA
	@Test
	@DisplayName("Deveria somar dois números")
	public void deveriaSomarDoisNumerosPositivos() {
		// Cenário (arrange)
		Calculadora calc = new Calculadora();

		// Execução (act)
		int soma = calc.somar(41, 1);

		// Verificação (assert)
		Assert.assertEquals(42, soma);
	}

	@Test
	@DisplayName("Deveria somar um número positivo com zero")
	public void deveriaSomarUmNumeroPositivoComZero() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(10, 0);
		Assert.assertEquals(10, soma);
	}

	@Test
	@DisplayName("Deveria somar um número positivo com um número negativo")
	public void deveriaSomarUmNumeroPositivoComUmNumeroNegativo() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(5, -5);
		Assert.assertEquals(0, soma);
	}

	@Test
	@DisplayName("Deveria somar dois números negativos")
	public void deveriaSomarDoisNumerosNegativos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(-2, -3);
		Assert.assertEquals(-5, soma);
	}

	// TESTES SUBTRAÇÃO
	@Test
	@DisplayName("Deveria subtrair dois números")
	public void deveriaSubtrairDoisNumerosPositivos() {
		// Cenário (arrange)
		Calculadora calc = new Calculadora();

		// Execução (act)
		int soma = calc.subtrair(41, 1);

		// Verificação (assert)
		Assert.assertEquals(42, soma);
	}

	@Test
	@DisplayName("Deveria subtrair um número positivo com zero")
	public void deveriaSubtrairUmNumeroPositivoComZero() {
		Calculadora calc = new Calculadora();
		int subtracao = calc.subtrair(10, 0);
		Assert.assertEquals(10, subtracao);
	}

	@Test
	@DisplayName("Deveria subtrair um número positivo com um número negativo")
	public void deveriaSubtrairUmNumeroPositivoComUmNumeroNegativo() {
		Calculadora calc = new Calculadora();
		int subtracao = calc.subtrair(5, -5);
		Assert.assertEquals(0, subtracao);
	}

	@Test
	@DisplayName("Deveria subtrair dois números negativos")
	public void deveriaSubtrairDoisNumerosNegativos() {
		Calculadora calc = new Calculadora();
		int subtracao = calc.somar(-2, -3);
		Assert.assertEquals(-5, subtracao);
	}

	// TESTES MULTIPLICAÇÃO
	@Test
	@DisplayName("Deveria multiplicar dois números")
	public void deveriaMultiplicarDoisNumerosPositivos() {
		// Cenário (arrange)
		Calculadora calc = new Calculadora();

		// Execução (act)
		int multiplicao = calc.subtrair(41, 1);

		// Verificação (assert)
		Assert.assertEquals(42, multiplicao);
	}

	@Test
	@DisplayName("Deveria multiplicar um número positivo com zero")
	public void deveriaMultiplicarUmNumeroPositivoComZero() {
		Calculadora calc = new Calculadora();
		int multiplicao = calc.multiplicar(10, 0);
		Assert.assertEquals(10, multiplicao);
	}

	@Test
	@DisplayName("Deveria multiplicar um número positivo com um número negativo")
	public void deveriaMultiplicarUmNumeroPositivoComUmNumeroNegativo() {
		Calculadora calc = new Calculadora();
		int multiplicao = calc.multiplicar(5, -5);
		Assert.assertEquals(0, multiplicao);
	}

	@Test
	@DisplayName("Deveria multiplicar dois números negativos")
	public void deveriaMultiplicarDoisNumerosNegativos() {
		Calculadora calc = new Calculadora();
		int multiplicao = calc.multiplicar(-2, -3);
		Assert.assertEquals(-5, multiplicao);
	}

	// TESTES DIVISÃO
	@Test
	@DisplayName("Deveria dividir dois números")
	public void deveriaDividirDoisNumerosPositivos() {
		// Cenário (arrange)
		Calculadora calc = new Calculadora();

		// Execução (act)
		int divisao = calc.dividir(41, 1);

		// Verificação (assert)
		Assert.assertEquals(42, divisao);
	}

//	@Test
//	@DisplayName("Deveria dividir um número positivo com zero")
//	public void deveriaDividirUmNumeroPositivoComZero() {
//		Calculadora calc = new Calculadora();
//		int multiplicao = calc.multiplicar(10, 0);
//		Assert.assertEquals(10, multiplicao);
//	}

	@Test
	@DisplayName("Deveria dividir um número positivo com um número negativo")
	public void deveriaDividirUmNumeroPositivoComUmNumeroNegativo() {
		Calculadora calc = new Calculadora();
		int divisao = calc.dividir(5, -5);
		Assert.assertEquals(0, divisao);
	}

	@Test
	@DisplayName("Deveria dividir dois números negativos")
	public void deveriaDividirDoisNumerosNegativos() {
		Calculadora calc = new Calculadora();
		int divisao = calc.dividir(-2, -3);
		Assert.assertEquals(-5, divisao);
	}
}
