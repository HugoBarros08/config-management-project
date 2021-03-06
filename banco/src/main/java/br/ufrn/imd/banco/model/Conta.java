package br.ufrn.imd.banco.model;


public class Conta {

	private static long contaId = 1;
	
	private long id;
	
	private Agencia agencia;

	private Double saldo;

	private Double saldoBonus;

	
	public Conta() {
		super();
		this.id = Conta.contaId;
		Conta.contaId++;
		this.agencia = new Agencia();
		this.saldo = 0.0;
		this.saldoBonus = 0.0;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}

	public Agencia getAgencia() {
		return agencia;
	}


	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}


	public Double getSaldo() {
		return saldo;
	}


	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getSaldoBonus() {
		return saldoBonus;
	}


	public void setSaldoBonus(Double saldoBonus) {
		this.saldoBonus = saldoBonus;
	}
	
}