package trabalho;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import junit.framework.TestCase;



class trabalhoTeste extends TestCase{
	
	ContaPoupanca contaP = new ContaPoupanca();
    ContaEspecial contaE = new  ContaEspecial();
    ContaCorrente contaC = new    ContaCorrente();
    
    //TESTES CONTA CORRENTE
	@Test
	void metodo1() {
		contaC.setSaldo(10000);
		assertTrue(contaC.Sacar(2000));
		assertEquals(contaC.getSaldo(),8000f);

	}
	@Test
	void metodo2() {
		contaC.setSaldo(10000);
		assertFalse(contaC.Sacar(7000));
		assertEquals(contaC.getSaldo(),10000f);
	}
	@Test
	void metodo3() {//ERRO ENCONTRADO
		contaC.setSaldo(10000);//TESTE DE SAQUE maior q
		assertTrue(contaC.Sacar(5000));
		assertEquals(contaC.getSaldo(),5000f);
	}
	@Test
	void metodo4() {
		contaC.setSaldo(2000);
		assertFalse(contaC.Sacar(3000));
		assertEquals(contaC.getSaldo(),2000f);
	}
	@Test
	void metodo5() {//erro encontrado
		contaC.setSaldo(5000);
		assertFalse(contaC.Sacar(5000));
		assertEquals(contaC.getSaldo(),0f);
	}
	@Test
	void metodo6() {//EMPRÉSTIMO
		contaC.setSaldo(2000);
		contaC.setEmprestimo(false);
		
		assertTrue(contaC.pedirEmp(20000));
		assertEquals(contaC.getSaldo(),22000f);
		assertTrue(contaC.getEmprestimo());
	}
	@Test
	void metodo7() {//EMPRÉSTIMO
		contaC.setSaldo(5000);
		contaC.setEmprestimo(false);
		
		assertFalse(contaC.pedirEmp(20001));
		assertEquals(contaC.getSaldo(),5000f);
		assertFalse(contaC.getEmprestimo());
	}
	@Test
	void metodo8() {//ERRO ECONTRADO
		contaC.setSaldo(1000);
		contaC.setEmprestimo(false);
		
		assertTrue(contaC.pedirEmp(5000));
		assertEquals(contaC.getSaldo(),6000f);
		assertTrue(contaC.getEmprestimo());
		assertEquals(contaC.getValorEmprestimo(),5000f);
	}
	@Test
	void metodo9() {//EMPRÉSTIMO
		contaC.setSaldo(8000);
		contaC.setEmprestimo(true);
		
		assertFalse(contaC.pedirEmp(10000));
		assertEquals(contaC.getSaldo(),8000f);
		assertTrue(contaC.getEmprestimo());
	}
}
/*● Conta corrente:
– O valor limite para o saque é de R$ 5.000,00.
– O saque não deve ultrapassar o saldo do cliente, não podendo este
ficar negativo.
– O pedido de empréstimo só deve ser aceito se não houver
empréstimos ativos (emprestimo == false) e se o valor solicitado não
for maior do que R$ 20.000,00.
– Quando realizado o empréstimo, deve ser atualizado o saldo do
correntista, e deve ser atualizado o valor do empréstimo ativo.*/
/*– Não há valor limite para o saque.
– Na conta especial há um limite máximo no qual o correntista
poderá exceder o seu saldo, podendo este ficar negativo.
– O maior valor de limite permitido da conta é de R$ 2.000,00.
– O limite disponível representa o valor restante do limite utilizado.
– Só deve ser possível aumentar o limite da conta se o saldo estiver
positivo e se não exceder o valor de R$2.000,00.*/
/*● Conta poupança:
– Não há valor limite para o saque.
– O método calcularSaldo() deve realizar o cálculo do investimento
com base nos meses em que o saldo ficou na conta e nos
rendimentos (juros compostos ao mês). O saldo deve ser atualizado
após o método.
– O método simular(meses: int, valor: float) deve realizar uma
simulação de investimento na poupança com base nos parâmetros
(meses e valor) e nos juros da conta.*/
/*Não há limite para depósitos, independente do tipo de conta.*/