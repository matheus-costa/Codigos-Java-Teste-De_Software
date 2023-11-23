package trabalho;

public class ContaEspecial extends Conta {
	private float limiteMax;
	private float limiteDisponivel;

	public ContaEspecial() {
		super();
	}

	public ContaEspecial(int id, Pessoa correntista, float limiteMax) {
		super(id, correntista);
		this.limiteMax = limiteMax;
		this.limiteDisponivel = this.limiteMax;
	}

	@Override
	public boolean Sacar(float valor) {
		if (valor <= getSaldo()) {
			setSaldo(getSaldo() - valor);
			return true;
		} else if (valor > 0 && valor <= (getSaldo() + limiteMax)) {
			setSaldo(getSaldo() - valor);
			limiteDisponivel = limiteMax + getSaldo();
			return true;
		} else
			return false;
	}

	@Override
	public void Depositar(float valor) {
		if (valor > 0) {

			setSaldo(getSaldo() + valor);

			/*
			 * if((limiteDisponivel + valor) <= limiteMax) { limiteDisponivel += valor; }
			 * else limiteDisponivel = limiteMax;
			 */

			limiteDisponivel += valor;
		}
	}

	public boolean aumentarLimite(float valor) {
		if (valor > 0 && getSaldo() >= 0 && (limiteMax + valor) <= 2000) {
			setLimiteMax(limiteMax + valor);
			return true;
		} else
			return false;
	}

	public float getLimiteMax() {
		return limiteMax;
	}

	public void setLimiteMax(float limiteMax) {
		this.limiteMax = limiteMax;
	}

	public float getLimiteDisponivel() {
		return limiteDisponivel;
	}

	public void setLimiteDisponivel(float limiteDisponivel) {
		this.limiteDisponivel = limiteDisponivel;
	}
}