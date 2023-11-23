package trabalho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;
import junit.framework.TestCase;

class ContaEspecialTest extends TestCase{
	ContaEspecial contaTeste = new ContaEspecial(); 	  // criando objeto de teste da conta especial
	List<Object> saidaEsperada = new ArrayList<Object>(); // criando uma lista para armazenar as saídas esperadas	
	List<Object> saidaRecebida = new ArrayList<Object>(); // criando uma lista para armazenar as saídas recebidas

	
	@Test
	void caso1() {
		contaTeste.setSaldo(5000);			  // configuração do cenário de teste
		contaTeste.setLimiteMax(500);		  // configuração do cenário de teste
		contaTeste.setLimiteDisponivel(500);  // configuração do cenário de teste
		
		Collections.addAll(saidaEsperada, true, 2200f, 500f, 500f); // adicionando as saídas esperadas para este cenário
		
		Collections.addAll(saidaRecebida, contaTeste.Sacar(2800),  // executando o método e adicionando as saídas recebidas
				contaTeste.getSaldo(), contaTeste.getLimiteMax(), 
				contaTeste.getLimiteDisponivel());
		
		assertEquals(saidaEsperada, saidaRecebida);  // avaliação do método: a lista de saída esperada deve ser igual a lista de saída recebida
	}
	
	@Test
	void caso2() {
		contaTeste.setSaldo(4000);
		contaTeste.setLimiteMax(1500);
		contaTeste.setLimiteDisponivel(1500);
		
		Collections.addAll(saidaEsperada, true, -1000f, 1500f, 500f);
		
		Collections.addAll(saidaRecebida, contaTeste.Sacar(5000),  
				contaTeste.getSaldo(), contaTeste.getLimiteMax(), 
				contaTeste.getLimiteDisponivel());
		
		assertEquals(saidaEsperada, saidaRecebida);
	}
	
	@Test
	void caso3() {
		contaTeste.setSaldo(4000);
		contaTeste.setLimiteMax(1000);
		contaTeste.setLimiteDisponivel(1000);
		
		Collections.addAll(saidaEsperada, false, 4000f, 1000f, 1000f);
		
		Collections.addAll(saidaRecebida, contaTeste.Sacar(7000),  
				contaTeste.getSaldo(), contaTeste.getLimiteMax(), 
				contaTeste.getLimiteDisponivel());
		
		assertEquals(saidaEsperada, saidaRecebida);
	}
	
	@Test
	void caso4() {
		contaTeste.setSaldo(1500);
		contaTeste.setLimiteMax(800);
		contaTeste.setLimiteDisponivel(800);
		
		Collections.addAll(saidaEsperada, true, 1500f, 1300f, 1300f);
		
		Collections.addAll(saidaRecebida, contaTeste.aumentarLimite(500),  
				contaTeste.getSaldo(), contaTeste.getLimiteMax(), 
				contaTeste.getLimiteDisponivel());
		
		assertEquals(saidaEsperada, saidaRecebida);
	}
}
