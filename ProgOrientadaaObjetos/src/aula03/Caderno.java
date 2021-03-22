package aula03;

public class Caderno {
	public int numLinhas = 40;
	public int materias = 10;
	public String[] linha;
	public String dono = ("Lázaro");
	public int paginas = 0;

	public Caderno(int numLinhas, int materias, String[] linha, String dono, int paginas) {
		this.numLinhas = numLinhas;
		this.materias = materias;
		this.linha = linha;
		this.dono = dono;
		this.paginas = paginas;
	}

	public int getNumLinhas() {
		return numLinhas;
	}

	public void setNumLinhas(int numLinhas) {
		this.numLinhas = numLinhas;
	}

	public int getMaterias() {
		return materias;
	}

	public void setMaterias(int materias) {
		this.materias = materias;
	}

	public String[] getLinha() {
		return linha;
	}

	public void setLinha(String[] linha) {
		this.linha = linha;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public void contaPaginasCaderno() {
				System.out.printf("Numero de paginas: %n", paginas);
		
	}

	public void escreve(String ... string) {
		for (String letra : string) {
			System.out.printf("_%s_%n", letra);
		}
	}

	public void mostraDonoCaderno() {
		System.out.printf("Dono : %s", dono);
	}
}
