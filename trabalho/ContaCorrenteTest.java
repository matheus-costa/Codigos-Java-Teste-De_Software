package trabalho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;
import junit.framework.TestCase;

class ContaCorrenteTest extends TestCase{
	ContaCorrente contaTeste = new ContaCorrente();       // criando objeto de teste da conta corrente
	List<Object> saidaEsperada = new ArrayList<Object>(); // criando uma lista para armazenar as saídas esperadas	
	List<Object> saidaRecebida = new ArrayList<Object>(); // criando uma lista para armazenar as saídas recebidas

	@Test
	void caso1() {
		contaTeste.setSaldo(10000); // configuração do cenário de teste
		
		Collections.addAll(saidaEsperada, true, 8000f); // adicionando as saídas esperadas para este cenário
		
		Collections.addAll(saidaRecebida, contaTeste.Sacar(2000), contaTeste.getSaldo()); // executando o método e adicionando as saídas recebidas
		
		/* O preenchimento das listas também pode ser feito dessa maneira:
		  	
			saidaEsperada.add(true);
			saidaEsperada.add(8000f);
		
			saidaRecebida.add(contaTeste.Sacar(2000));
			saidaRecebida.add(contaTeste.getSaldo());
		 */
		
		assertEquals(saidaEsperada, saidaRecebida); // avaliação do método: a lista de saída recebida deve ser igual a lista de saída esperada
	}
	
	@Test
	void caso2() {
		contaTeste.setSaldo(10000);
		
		
		Collections.addAll(saidaEsperada, false, 10000f);
		
		Collections.addAll(saidaRecebida, contaTeste.Sacar(7000), contaTeste.getSaldo());
		
		assertEquals(saidaEsperada, saidaRecebida);
	}
	
	@Test
	void caso3() {
		contaTeste.setSaldo(10000);
		
		Collections.addAll(saidaEsperada, true, 5000f);
		
		Collections.addAll(saidaRecebida, contaTeste.Sacar(5000), contaTeste.getSaldo());
				
		assertEquals(saidaEsperada, saidaRecebida);
	}
	
	@Test
	void caso4() {
		
	}
	
	@Test
	void caso5() {
		
	}
	
	@Test
	void caso6() {
		contaTeste.setSaldo(2000);
		contaTeste.setEmprestimo(false);
		
		Collections.addAll(saidaEsperada, true, true, 22000f, 20000f);
		
		Collections.addAll(saidaRecebida, contaTeste.pedirEmp(20000), contaTeste.getEmprestimo(), 
				contaTeste.getSaldo(), contaTeste.getValorEmprestimo());
		
		assertEquals(saidaEsperada, saidaRecebida);
	}
	
	@Test
	void caso7() {
		contaTeste.setSaldo(5000);
		contaTeste.setEmprestimo(false);
		
		Collections.addAll(saidaEsperada, false, false, 5000f, 0f);
		
		Collections.addAll(saidaRecebida, contaTeste.pedirEmp(20001), contaTeste.getEmprestimo(), 
				contaTeste.getSaldo(), contaTeste.getValorEmprestimo());
		
		assertEquals(saidaEsperada, saidaRecebida);
	}
	
	@Test
	void caso8() {
		
	}
	
	@Test
	void caso9() {
		
	}
}