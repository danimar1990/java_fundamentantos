package aula_32.exercicios.calculadora;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
// Soma---------------------------------------------------------------------------------------------------
	@Test
	@DisplayName("Deveria somar dois numeros positivos")
	public void deveriaSomarDoisNumerosInteros() {
		Calculadora calc = new Calculadora();
		
		int soma = calc.somar(41,1);
		
		Assert.assertEquals(42, soma);
	}
	
	@Test
	public void deveriaSomarUmNumeroPositivoEZero() {
		Calculadora calc = new Calculadora();
		
		int soma = calc.somar(42,0);
		
		Assert.assertEquals(42, soma);
	}
	
	@Test
	public void deveriaSomarUmNumeroPositivoEUmNegativo() {
		Calculadora calc = new Calculadora();
		
		int soma = calc.somar(43,-1);
		
		Assert.assertEquals(42, soma);
	}
	
	@Test
	public void deveriaSomarDoisNumerosNegativos() {
		Calculadora calc = new Calculadora();
		
		int soma = calc.somar(-2,-3);
		
		Assert.assertEquals(-5, soma);
	}
// Subtração---------------------------------------------------------------------------------------------------
	@Test
	@DisplayName("Deveria subtrair dois numeros positivos")
	public void deveriaSubtrairDoisNumerosInteros() {
		Calculadora calc = new Calculadora();
		
		int subtracao = calc.subtrair(10,1);
		
		Assert.assertEquals(9, subtracao);
	}
	
	@Test
	public void deveriaSubtrairUmNumeroPositivoEZero() {
		Calculadora calc = new Calculadora();
		
		int subtracao = calc.subtrair(30,0);
		
		Assert.assertEquals(30, subtracao);
	}
	
	@Test
	public void deveriaSubtrairUmNumeroPositivoEUmNegativo() {
		Calculadora calc = new Calculadora();
		
		int subtracao = calc.subtrair(20,-1);
		
		Assert.assertEquals(21, subtracao);
	}
	
	@Test
	public void deveriaSubtrairDoisNumerosNegativos() {
		Calculadora calc = new Calculadora();
		
		int subtracao = calc.subtrair(-4,-9);
		
		Assert.assertEquals(5, subtracao);
	}
// Multiplicação---------------------------------------------------------------------------------------------------
		@Test
		@DisplayName("Deveria multiplicar dois numeros positivos")
		public void deveriaMultiplicarDoisNumerosInteros() {
			Calculadora calc = new Calculadora();
			
			int multiplicacao = calc.multiplicar(10,1);
			
			Assert.assertEquals(10, multiplicacao);
		}
		
		@Test
		public void deveriaMultiplicarrUmNumeroPositivoEZero() {
			Calculadora calc = new Calculadora();
			
			int multiplicacao = calc.multiplicar(30,0);
			
			Assert.assertEquals(0, multiplicacao);
		}
		
		@Test
		public void deveriaMultiplicarUmNumeroPositivoEUmNegativo() {
			Calculadora calc = new Calculadora();
			
			int multiplicacao = calc.multiplicar(20,-1);
			
			Assert.assertEquals(-20, multiplicacao);
		}
		
		@Test
		public void deveriaMultiplicarDoisNumerosNegativos() {
			Calculadora calc = new Calculadora();
			
			int multiplicacao = calc.multiplicar(-4,-9);
			
			Assert.assertEquals(36, multiplicacao);
		}
// Divisão---------------------------------------------------------------------------------------------------
		@Test
		@DisplayName("Deveria dividir dois numeros positivos")
		public void deveriaDividirDoisNumerosInteros() {
			Calculadora calc = new Calculadora();
			
			double divisao = calc.dividir(10,1);
			
			Assert.assertEquals(10, divisao,1);
		}
		
		@Test
		public void deveriaDividirUmNumeroPositivoEUmNegativo() {
			Calculadora calc = new Calculadora();
			
			double divisao = calc.dividir(20,-1);
			
			Assert.assertEquals(-20, divisao,1);
		}
		
		@Test
		public void deveriaDividirDoisNumerosNegativos() {
			Calculadora calc = new Calculadora();
			
			double divisao = calc.dividir(-10,-2);
			
			Assert.assertEquals(5, divisao,1);
		}
	}

