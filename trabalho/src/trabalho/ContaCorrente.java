package trabalho;

public class ContaCorrente extends Conta {
	private boolean emprestimo;
	private float valorEmprestimo;

	public ContaCorrente() {
		super();
		emprestimo = false;
		valorEmprestimo = 0;
	}

	public ContaCorrente(int id, Pessoa correntista) {
		super(id, correntista);
		this.emprestimo = false;
		this.valorEmprestimo = 0;
	}

	@Override
	public boolean Sacar(float valor) {
		if (valor >= 0 && valor < 5000 && valor <= getSaldo()) {
			setSaldo(getSaldo() - valor);
			return true;
		} else
			return false;
	}

	public boolean pedirEmp(float valor) {
		if (emprestimo == false && valor <= 20000) {
			emprestimo = true;
			setSaldo(getSaldo() + valor);
			return true;
		} else
			return false;
	}

	public boolean getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(boolean emprestimo) {
		this.emprestimo = emprestimo;
	}

	public float getValorEmprestimo() {
		return valorEmprestimo;
	}

	public void setValorEmprestimo(float valorEmprestimo) {
		this.valorEmprestimo = valorEmprestimo;
	}
}
