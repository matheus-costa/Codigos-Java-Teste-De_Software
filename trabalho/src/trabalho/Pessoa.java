package trabalho;

public class Pessoa {
	private String nome;
	private long cpf;
	private long rg;
	private long celular;

	public Pessoa() {

	}

	public Pessoa(String nome, long cpf, long rg, long celular) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.celular = celular;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCPF(long cpf) {
		this.cpf = cpf;
	}

	public void setCelular(long celular) {
		this.celular = celular;
	}

	public void setRG(long rg) {
		this.rg = rg;
	}

	public String getNome() {
		return this.nome;
	}

	public long getCPF() {
		return this.cpf;
	}

	public long getRG() {
		return this.rg;
	}

	public long getCelular() {
		return this.celular;
	}
}