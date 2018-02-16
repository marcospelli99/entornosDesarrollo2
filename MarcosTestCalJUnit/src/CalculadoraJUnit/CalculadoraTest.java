/*
 * 
 */
package CalculadoraJUnit;

import static org.junit.Assert.*;

import javax.swing.JOptionPane;

import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class CalculadoraTest.
 */
//Ejercicio 3
public class CalculadoraTest {
	
	/**
	 * Prueba multiplica.
	 */
	@Test
	public void pruebaMultiplica() {
		Calculadora calcu = new Calculadora(20, 0);
		assertEquals("Fallo multiplica con el resultado", 20,calcu.multiplica());
	}
	
	/**
	 * Prueba multiplica con 0.
	 */
	@Test
	public void pruebaMultiplicaCon0() {
		Calculadora calcu = new Calculadora(10, 0);
		assertEquals("Fallo multiplica, el resultado no da 0", 0,calcu.multiplica());
	}
	
	/**
	 * Prueba multiplica con 0 no igual.
	 */
	@Test
	public void pruebaMultiplicaCon0NoIgual() {
		Calculadora calcu = new Calculadora(10, 0);
		assertNotEquals("Fallo multiplica, el resultado da diferente de 0", 10,calcu.multiplica());
	}
	
	/**
	 * Prueba suma.
	 */
	@Test
	public void pruebaSuma() {
		Calculadora calcu = new Calculadora(20, 1);
		assertEquals("Fallo suma con el resultado", 21,calcu.suma());
	}
	
	/**
	 * Prueba suma con negativos.
	 */
	@Test
	public void pruebaSumaConNegativos() {
		Calculadora calcu = new Calculadora(0, -1);
		assertEquals("Fallo suma con el resultado", -1,calcu.suma());
	}
	
	/**
	 * Prueba suma resultado no igual.
	 */
	@Test
	public void pruebaSumaResultadoNoIgual() {
		Calculadora calcu = new Calculadora(20, 1);
		assertNotEquals("Fallo suma con el resultado", 20,calcu.suma());
	}
//Ejercicio 3
	
	
	/**
 * Prueba resta 2.
 */
@Test
	public void pruebaResta2() {
		Calculadora calcu = new Calculadora(20, 10);
		assertTrue("Fallo resta2 en el true", calcu.resta2());
	}

	/**
	 * Prueba resta 2 v 2.
	 */
	@Test
	public void pruebaResta2v2() {
		Calculadora calcu = new Calculadora(10, 20);
		assertFalse("Fallo resta2 en el false", calcu.resta2());
	}

	/**
	 * Prueba divide 2 con 0.
	 */
	@Test
	public void pruebaDivide2Con0() {
		Calculadora calcu = new Calculadora(20, 0);
		assertNull("Fallo divide2 con el null y el 0", calcu.divide2());
	}
	

	/**
	 * Prueba divide 2 sin 0.
	 */
	@Test
	public void pruebaDivide2Sin0() {
		Calculadora calcu = new Calculadora(20, 10);
		assertNotNull("Fallo divide2 sin el null o el 0", calcu.divide2());
	}

	/**
	 * Prueba resta 2 resultado.
	 */
	@Test
	public void pruebaResta2Resultado() {
		Calculadora calcu = new Calculadora(20, 10);
		int resultado = calcu.resta();
		assertEquals("El resultado de num1>num2 de resta2 falla", 10, resultado);
	}

	/**
	 * Prueba resta 2 resultado V 2.
	 */
	@Test
	public void pruebaResta2ResultadoV2() {
		Calculadora calcu = new Calculadora(10, 20);
		int resultado = calcu.resta();
		assertEquals("El resultado de num2>num1 de resta2 falla", 10, resultado);
	}

	/**
	 * Prueba resta 2 resultado V 3.
	 */
	@Test
	public void pruebaResta2ResultadoV3() {
		Calculadora calcu = new Calculadora(10, 10);
		int resultado = calcu.resta();
		assertEquals("El resultado de num2=num1 de resta2 falla", 0, resultado);
	}

	/**
	 * Prueba divide 2 resultado.
	 */
	@Test
	public void pruebaDivide2Resultado() {
		Calculadora calcu = new Calculadora(20, 10);
		int resultado = calcu.divide2();
		assertEquals("El resultado de divide2 falla", 2, resultado);
	}

}