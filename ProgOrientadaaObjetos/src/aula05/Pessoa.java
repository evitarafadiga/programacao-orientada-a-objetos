package aula05;

public class Pessoa {
	
	public String nome;
	public int idade;
	public String cpf;
	
	public void irAoAeroporto() {
		System.out.printf("Pessoa: %s de %d ano(s) de idade chegou ao aeroporto.%n",nome,idade);
	}
	
	public Pessoa() {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
