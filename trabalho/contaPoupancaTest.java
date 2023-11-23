package trabalho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;
import junit.framework.TestCase;

class contaPoupancaTest extends TestCase{
	ContaPoupanca contaTeste = new ContaPoupanca(); 	  // criando objeto de teste da conta poupança
	List<Object> saidaEsperada = new ArrayList<Object>(); // criando uma lista para armazenar as saídas esperadas	
	List<Object> saidaRecebida = new ArrayList<Object>(); // criando uma lista para armazenar as saídas recebidas

	
	@Test
	void caso1() {
		contaTeste.setSaldo(5000);
		contaTeste.setJuros(5);
		contaTeste.setMeses(10);
		
		contaTeste.calcularSaldo();
		
		Collections.addAll(saidaEsperada, 8144.47f, 0, 5f);
		
		Collections.addAll(saidaRecebida, contaTeste.getSaldo(), 
				contaTeste.getMeses(), contaTeste.getJuros());
		
		assertEquals(saidaEsperada, saidaRecebida);
	}
	
	@Test
	void caso2() {
		contaTeste.setSaldo(4000);
		
		Collections.addAll(saidaEsperada, true, 2500f);
		
		Collections.addAll(saidaRecebida, contaTeste.Sacar(1500), contaTeste.getSaldo());
		
		assertEquals(saidaEsperada, saidaRecebida);
		
	}
	
	@Test 
	void caso3(){
		contaTeste.setJuros(1.5f);
		
		saidaEsperada.add(10772.84f);
		
		saidaRecebida.add(contaTeste.simular(5, 10000));
		
		assertEquals(saidaEsperada, saidaRecebida);
	}
}