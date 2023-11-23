package trabalho;

public abstract class Conta {
	private int id;
	private Pessoa correntista;
	private float saldo;

	public Conta() {
		this.saldo = 0;
	}

	public Conta(int id, Pessoa correntista) {
		this.id = id;
		this.correntista = correntista;
		this.saldo = 0;
	}

	public void Depositar(float valor) {
		if (valor > 0)
			this.saldo += valor;
	}

	public abstract boolean Sacar(float valor);

	public void setId(int id) {
		this.id = id;
	}

	public void setCorrentista(Pessoa correntista) {
		this.correntista = correntista;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getId() {
		return this.id;
	}

	public Pessoa getCorrentista() {
		return this.correntista;
	}

	public float getSaldo() {
		return this.saldo;
	}
}