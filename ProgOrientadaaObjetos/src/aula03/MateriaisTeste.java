package aula03;

import aula03.Caneta;

public class MateriaisTeste {

	public static void main(String[] args) {

		Caneta c1 = new Caneta(1, "Esta caneta pertence ao Lazaro", 2, 70, true);
		Caneta c2 = new Caneta(1, "Esta caneta está perdida", 0, 90, false);

		Caderno n1 = new Caderno(40, 5, args, "Fulano", 10);
		Caderno n2 = new Caderno(20, 10, args, "Ciclano", 10);

		Livro l1 = new Livro("Game of Thrones", "Livro extenso de fantasia", "George R R Martin", 600, 000001, null);
		Livro l2 = new Livro("Codigo Da Vinci", "Livro extenso de ficção", "Dan Brown", 500, 000002, null);
		
		c1.abreCaneta();
		c2.canetaDuasEmUma();
		c1.mostraEstadoCaneta();
		c2.mostraEstadoCaneta();
		
		n1.contaPaginasCaderno();
		n1.escreve("Teste de escrita.","Segundo teste","Terceiro");
		n2.escreve("Teste");
		n2.mostraDonoCaderno();
		
		l1.contaPaginasLivro();
		l2.imprimir();
		l1.ler();

	}

}
