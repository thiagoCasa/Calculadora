package br.fatec.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.fatec.servico.Calculadora;

public class UC01soma_de_parcelas {

	static Calculadora calculadora;
		
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calculadora = new Calculadora();
	}
	
	@Test
	public void CT01UC01SomaDeParcelas_com_sucesso() {
		assertEquals("resultado =",5,calculadora.Soma("3,2"));
	}
	
	@Test
	public void CT02UC01SomaDeParcelas_dados_invalidos(){
		assertEquals("resultado = ",5,calculadora.Soma("x,2"));
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception{
	}

}
