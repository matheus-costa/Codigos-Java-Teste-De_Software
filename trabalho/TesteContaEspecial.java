package trabalho;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteContaEspecial {
	  ContaEspecial contaE = new ContaEspecial();
	  

	     //CONTA ESPECIAL
	/*
	– Não há valor limite para o saque.
	– Na conta especial há um limite máximo no qual o correntista
	  poderá exceder o seu saldo, podendo este ficar negativo.
	– O maior valor de limite permitido da conta é de R$ 2.000,00.
	– O limite disponível representa o valor restante do limite utilizado.
	– Só deve ser possível aumentar o limite da conta se o saldo estiver
	  positivo e se não exceder o valor de R$2.000,00.*/
		@Test
		void metodoCE1() {//CASO01
			contaE.setSaldo(5000);
			contaE.setLimiteMax(500);
			contaE.setLimiteDisponivel(500);
			
			assertTrue(contaE.Sacar(2800));
			assertEquals(contaE.getSaldo(),2200f);		
		}
		@Test
		void metodoCE2() {//CASO02
			contaE.setSaldo(4000);
			contaE.setLimiteMax(1500);
			contaE.setLimiteDisponivel(1500);
			
			assertTrue(contaE.Sacar(5000));
			assertEquals(contaE.getSaldo(),9000f);		
		}
		@Test
		void metodoCE3() {//CASO03
			contaE.setSaldo(4000);
			contaE.setLimiteMax(1000);
			contaE.setLimiteDisponivel(1000);
			
			assertFalse(contaE.Sacar(7000));
			assertEquals(contaE.getSaldo(),4000f);		
		}
		@Test
		void metodoCE4() {//CASO04
			contaE.setSaldo(1500);
			contaE.setLimiteMax(800);
			contaE.setLimiteDisponivel(800);
			
			assertTrue(contaE.aumentarLimite(500));
			assertEquals(contaE.getSaldo(),1500f);		
			assertEquals(contaE.getLimiteMax(),1300f);		
		}
		@Test
		void metodoCE5() {//CASO05
			contaE.setSaldo(5000);
			contaE.setLimiteMax(1000);
			contaE.setLimiteDisponivel(1000);
			
			assertTrue(contaE.Sacar(6000));
			assertEquals(contaE.getSaldo(),-1000f);
			
		}
		@Test
		void metodoCE6() {///CASO06
			contaE.setSaldo(5000);
			contaE.setLimiteMax(2000);
			contaE.setLimiteDisponivel(2000);
			
			assertFalse(contaE.Sacar(70000));
			assertEquals(contaE.getSaldo(),70000f);
			
		}
		//– Só deve ser possível aumentar o limite da conta se o saldo estiver
		//positivo e se não exceder o valor de R$2.000,00
		@Test
		void metodoCE7() {//ERRO ENCONTRADO /CASO07
			contaE.setSaldo(-5000);
			contaE.setLimiteMax(2000);
			contaE.setLimiteDisponivel(2000);
			
			assertFalse(contaE.aumentarLimite(30000));
			assertEquals(contaE.getSaldo(),35000f);
			
		}
		@Test
		void metodoCE8() {///CASO08
			contaE.setSaldo(5000);
			contaE.setLimiteMax(2000);
			contaE.setLimiteDisponivel(2000);
			
			assertTrue(contaE.aumentarLimite(20001));
			assertEquals(contaE.getLimiteDisponivel(),40001f);
			
		}

}
