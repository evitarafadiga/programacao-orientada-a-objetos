package aula05;

public class Aeroporto {
	
	int qtdeAeronaves = 20;
	int qtdePilotos = 100;
	String [] disponibilidades = {"ABERTO","FECHADO"};
	String disponibilidade = "";
	
	public Aeroporto() {
		this.qtdeAeronaves = qtdeAeronaves;
		this.qtdePilotos = qtdePilotos;
		this.disponibilidade = disponibilidade;
	}
	
	public void liberaVoo() {
		qtdePilotos -= 1;
		qtdeAeronaves -=1;
		disponibilidade = disponibilidades[0];
		System.out.printf("Disponibilidade atual: %s%n",disponibilidade);
	}
	
	public void cancelaVoo() {
		qtdePilotos += 1;
		qtdeAeronaves +=1;
		disponibilidade = disponibilidades[1];
		System.out.printf("Disponibilidade atual:  %s%n",disponibilidade);
	}

	public int getQtdeAeronaves() {
		return qtdeAeronaves;
	}

	public void setQtdeAeronaves(int qtdeAeronaves) {
		this.qtdeAeronaves = qtdeAeronaves;
	}

	public int getQtdePilotos() {
		return qtdePilotos;
	}

	public void setQtdePilotos(int qtdePilotos) {
		this.qtdePilotos = qtdePilotos;
	}

	public String[] getDisponibilidades() {
		return disponibilidades;
	}

	public void setDisponibilidades(String[] disponibilidades) {
		this.disponibilidades = disponibilidades;
	}

	public String getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
}
