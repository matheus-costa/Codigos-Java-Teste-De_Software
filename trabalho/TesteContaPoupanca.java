package trabalho;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

class TesteContaPoupanca {
	ContaPoupanca contaP = new ContaPoupanca();
	List<Object> saidaEsperada = new ArrayList<Object>(); // criando uma lista para armazenar as saídas esperadas	
	List<Object> saidaRecebida = new ArrayList<Object>(); // criando uma lista para armazenar as saídas recebidas

	  //CONTA POUPANÇA
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

	@Test
	void metodoCP1() {///CASO01
		contaP.setSaldo(5000);
		contaP.setMeses(10);
		contaP.setJuros(5);;
		
		assertEquals(contaP.getSaldo(),8144,47);
		assertEquals(contaP.getMeses(),0);
		assertEquals(contaP.getJuros(),5);
	}

	@Test
	void metodoCP2() {///CASO02
		contaP.setSaldo(4000);
			
		Collections.addAll(saidaRecebida, contaP.Sacar(1500));
		Collections.addAll(saidaEsperada, true,2500);
		
		assertEquals(saidaEsperada, saidaRecebida);
	}
	@Test
	void metodoCP3() {///CASO03
		contaP.setSaldo(4000);

		Collections.addAll(saidaRecebida, contaP.Sacar(1500), contaP.getSaldo(), contaP.simular(5, 10000));		
		Collections.addAll(saidaEsperada, true, 10772,84f); // adicionando as saídas esperadas para este cenário	
		assertEquals(saidaEsperada, saidaRecebida);
	}	
}