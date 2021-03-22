package aula05;

import java.util.Date;

public class Piloto extends Passageiro{

	public int breve;
	public double salario;
	public Date previsaoretorno;
	
	public void pilotar(String nomeAeronave) {
		System.out.printf("Piloto %s de nome %s está pilotando aeronave: %s.%n",breve,nome,nomeAeronave);
	}
	
	public Piloto () {
		this.breve = breve;
		this.salario = salario;
		this.previsaoretorno = previsaoretorno;
	}

	public int getBreve() {
		return breve;
	}

	public void setBreve(int breve) {
		this.breve = breve;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Date getPrevisaoretorno() {
		return previsaoretorno;
	}

	public void setPrevisaoretorno(Date previsaoretorno) {
		this.previsaoretorno = previsaoretorno;
	}
}
