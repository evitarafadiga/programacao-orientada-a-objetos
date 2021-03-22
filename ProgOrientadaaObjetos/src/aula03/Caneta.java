package aula03;

public class Caneta {
	public String[] estados = { "ABERTA", "FECHADA", "VAZIA" };
	public String estadoAtual, conteudo;
	public String[] cor = { "AZUL", "VERMELHA", "PRETA" };
	public String corAtual;
	public float tinta = 100.0f;
	public boolean duasEmUma;

	public Caneta(int i, String string, int j, int k, boolean b) {
		this.estadoAtual = estados[i];
		this.conteudo = string;
		this.corAtual = cor[j];
		this.tinta = k;
		this.duasEmUma = b;
	}
		
	public void mostraEstadoCaneta() {
		System.out.printf("A caneta da cor %s está: %s e contém %fml de tinta.%n", corAtual, estadoAtual, tinta);
	}

	public void abreCaneta() {
		estadoAtual = estados[0];
		System.out.printf("Caneta %s aberta.%n",corAtual);

	}

	public void canetaDuasEmUma() {
		duasEmUma = true;
	}
	
	public String[] getEstados() {
		return estados;
	}
	public void setEstados(String[] estados) {
		this.estados = estados;
	}
	public String getEstadoAtual() {
		return estadoAtual;
	}
	public void setEstadoAtual(String estadoAtual) {
		this.estadoAtual = estadoAtual;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public String[] getCor() {
		return cor;
	}
	public void setCor(String[] cor) {
		this.cor = cor;
	}
	public String getCorAtual() {
		return corAtual;
	}
	public void setCorAtual(String corAtual) {
		this.corAtual = corAtual;
	}
	public float getTinta() {
		return tinta;
	}
	public void setTinta(float tinta) {
		this.tinta = tinta;
	}
	public boolean isDuasEmUma() {
		return duasEmUma;
	}
	public void setDuasEmUma(boolean duasEmUma) {
		this.duasEmUma = duasEmUma;
	}

}