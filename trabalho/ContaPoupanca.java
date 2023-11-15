package trabalho;

public class ContaPoupanca extends Conta {
	private int meses;
	private float juros;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(int id, Pessoa correntista, int meses, float juros) {
		super(id, correntista);
		this.meses = meses;
		this.juros = juros;
	}

	@Override
	public boolean Sacar(float valor) {
		if (valor > 0 && getSaldo() > valor) {
			setSaldo(getSaldo() - valor);
			return true;
		} else
			return false;
	}

	public float calcularSaldo() {
		float saldo = getSaldo();

		for (int i = 0; i <= meses; i++) {
			saldo += saldo * juros / 100;
		}

		saldo = (float) (Math.rint(saldo * 100) / 100);
		setMeses(0);
		setSaldo(saldo);
		return saldo;
	}

	public float simular(int meses, float valor) {
		if (meses <= 0)
			return 0;

		float saldo = valor;

		for (int i = 0; i < meses; i++) {
			saldo += saldo * juros / 100;
		}

		return (float) (Math.rint(saldo * 100) / 100);
	}

	public int getMeses() {
		return meses;
	}

	public void setMeses(int meses) {
		this.meses = meses;
	}

	public float getJuros() {
		return juros;
	}

	public void setJuros(float juros) {
		this.juros = juros;
	}
}