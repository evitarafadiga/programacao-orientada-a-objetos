package aula05;

public class Aeronave {
	
	public float combustivel;
	public String nomeAeronave;
	public int qtdepassageiros;
	
	public void voa() {
		System.out.printf("Aeronave %s está voando.%n",nomeAeronave);
	}
	
	public float getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(float combustivel) {
		this.combustivel = combustivel;
	}

	public String getNomeAeronave() {
		return nomeAeronave;
	}

	public void setNomeAeronave(String nomeAeronave) {
		this.nomeAeronave = nomeAeronave;
	}

	public int getQtdepassageiros() {
		return qtdepassageiros;
	}

	public void setQtdepassageiros(int qtdepassageiros) {
		this.qtdepassageiros = qtdepassageiros;
	}


}
