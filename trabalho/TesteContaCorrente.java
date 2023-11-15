package trabalho;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import junit.framework.TestCase;


//AssertTrue eu uso quando o retorno que eu espero é um TRUE.
//AssertFalse eu uso quando eu espero que o retorno seja FALSE
//AssertEquals eu uso quando quero comparar o valor, 
//Eu quero que o valor da saída seja igual ao valor esperado
class TesteContaCorrente extends TestCase{
	
    ContaCorrente contaC = new ContaCorrente();
    
    //TESTES DE SAQUE
    @Test
	void metodoSAC1() {//CASO0
		contaC.setSaldo(10000);
		assertTrue(contaC.Sacar(2000));
		assertEquals(contaC.getSaldo(),8000f);

	}
    @Test
	void metodoSAC2() {//CASO0
		contaC.setSaldo(10000);
		assertFalse(contaC.Sacar(7000));
		assertEquals(contaC.getSaldo(),10000f);
    }
	@Test
	void metodoSAC3() {//CASO0
		contaC.setSaldo(-1000);
		assertTrue(contaC.Sacar(2000));
		assertEquals(contaC.getSaldo(),-3000f);

	}
	@Test
	void metodoSAC4() {//CASO0
		contaC.setSaldo(10000);
		assertTrue(contaC.Sacar(5000));
		assertEquals(contaC.getSaldo(),5000f);
	}
	
	@Test
	void metodoSAC5() {//CASO0
		contaC.setSaldo(5000);
		assertFalse(contaC.Sacar(5000));
		assertEquals(contaC.getSaldo(),0f);
	}
	@Test
	void metodoSAC6() {//CASO0
		contaC.setSaldo(10000);
		assertTrue(contaC.Sacar(7000));
		assertEquals(contaC.getSaldo(),3000f);
	}
	@Test
	void metodoSAC7() {//CASO0
		contaC.setSaldo(10000);
		assertTrue(contaC.Sacar(5000));
		assertEquals(contaC.getSaldo(),5000f);
	}
	
	@Test
	void metodoSAC8() {//CASO
		contaC.setSaldo(2000);
		assertFalse(contaC.Sacar(3000));
		assertEquals(contaC.getSaldo(),-1000f);
	}
	
	
	//PEDIR EMPRÉSTIMO
	
	@Test
	void metodoEMP1() {//CASO0
		contaC.setSaldo(2000);
		contaC.setEmprestimo(false);
		
		assertTrue(contaC.pedirEmp(20000));
		assertEquals(contaC.getSaldo(),22000f);
		assertEquals(contaC.getValorEmprestimo(), 20000);
	}
	@Test
	void metodoEMP2() {//CASO0
		contaC.setSaldo(2000);
		contaC.setEmprestimo(false);
		
		assertFalse(contaC.pedirEmp(200001));
		assertEquals(contaC.getSaldo(),2000f);
		assertFalse(contaC.getEmprestimo());
		assertEquals(contaC.getValorEmprestimo(),200001f);
	}
	@Test
	void metodoEMP3() {//CASO0
		contaC.setSaldo(1000);
		contaC.setEmprestimo(false);
		
		assertTrue(contaC.pedirEmp(5000));
		assertEquals(contaC.getSaldo(),6000f);
		assertTrue(contaC.getEmprestimo());
		assertEquals(contaC.getValorEmprestimo(),0f);
	}
	@Test
	void metodoEMP4() {//CASO0
		contaC.setSaldo(8000);
		contaC.setEmprestimo(true);
		contaC.setValorEmprestimo(4000);
		
		assertFalse(contaC.pedirEmp(10000));
		assertEquals(contaC.getSaldo(),8000f);
		assertTrue(contaC.getEmprestimo());
		assertEquals(contaC.getValorEmprestimo(),4000f);
	}
	@Test
	void metodoEMP5() {//CASO0
		contaC.setSaldo(1000);
		contaC.setEmprestimo(false);
		
		assertTrue(contaC.pedirEmp(5000));
		assertEquals(contaC.getSaldo(),6000f);
		assertTrue(contaC.getEmprestimo());
		assertEquals(contaC.getValorEmprestimo(),5000f);
	}
	
}	    