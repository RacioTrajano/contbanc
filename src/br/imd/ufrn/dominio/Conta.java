package br.imd.ufrn.dominio;

import java.util.Objects;

public class Conta {
	
	private String numConta;
	private double saldo;
	private double chequeEspecial;
	
	public Conta() {}
	
	public void Saque(double valor) {
		if ((saldo - valor) + chequeEspecial >= 0)
			saldo = saldo - valor;
		else {
			System.err.println("Não foi possível realizar saque, saldo indisponível");
		}
	}
	public void Deposito(double valor) {
		saldo = saldo + valor;
		System.out.println("Depósito realizado com sucesso, novo saldo: " + getSaldo());
	}
	

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public String getNumConta() {
		return numConta;
	}
	
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getChequeEspecial() {
		return chequeEspecial;
	}
	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	@Override
	public String toString() {
		return" Conta n: " + getNumConta();
	}

	@Override
	public int hashCode() {
		return Objects.hash(numConta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		return Objects.equals(numConta, other.numConta);
	}
	
}
