package aula05;

public class TesteAeroporto {

	public static void main(String[] args) {
		
		Piloto piloto1 = new Piloto();
		Piloto piloto2 = new Piloto();
		
		piloto1.setNome("Fulano");
		piloto2.setNome("Ciclano");
		piloto1.pilotar("Blackstar");
		piloto2.pilotar("Millennium Falcon");
		
		Passageiro p1 = new Passageiro();
		Passageiro p2 = new Passageiro();
		p1.compraPassagem();
		p2.compraPassagem();
		
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		
		pessoa1.setNome("Beltrame");
		pessoa1.setIdade(15);
		pessoa2.setNome("Tal");
		pessoa2.setIdade(27);
		pessoa1.irAoAeroporto();
		pessoa2.irAoAeroporto();
		
		Aeronave a1 = new Aeronave();
		Aeronave a2 = new Aeronave();
		
		a1.voa();
		a2.voa();
		
		Aeroporto a4 = new Aeroporto();
		Aeroporto a5 = new Aeroporto();
		
		a4.liberaVoo();
		a5.liberaVoo();
		
		a5.cancelaVoo();
		
	}

}
