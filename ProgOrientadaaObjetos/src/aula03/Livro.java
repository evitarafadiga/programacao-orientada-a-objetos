package aula03;

import java.awt.Image;

public class Livro {

	public String nome = "Livro";
	public String conteudo = "Livro muito curto.";
	public int numPaginas = 1;
	public String autor = ("Lázaro Santos");
	public int ISBN = 00002;
	public Image capa = null;
	
	public Livro (String nome, String conteudo, String autor, int numPaginas, int isbn, Image capa) {
		this.nome = nome;
		this.conteudo = conteudo;
		this.autor = autor;
		this.numPaginas = numPaginas;
		this.ISBN = isbn;
		this.capa = capa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public Image getCapa() {
		return capa;
	}

	public void setCapa(Image capa) {
		this.capa = capa;
	}

	public void ler(char... conteudo) {
		for (char letra : conteudo) {
			System.out.printf("_%s", letra);
		}
	}

	public void imprimir() {
		System.out.printf("Impressão de %s%n%s%nAutor: %s.", nome, conteudo, autor);
	}

	public void contaPaginasLivro() {
		int folhas = 12;
		for (int i = 0; i <= numPaginas; i++) {
			if (i == numPaginas)
				System.out.printf("Numero de paginas: ", i * folhas);
		}
	}

}
