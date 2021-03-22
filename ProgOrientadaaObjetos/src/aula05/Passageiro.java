package aula05;

import java.util.Date;
import java.util.Scanner;

public class Passageiro extends Pessoa{

	public int assento;
	public Date voo;
	public String passaporte;
	
	public void compraPassagem() {
		System.out.printf("Digite seu cpf.%n");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.printf("Qual e o seu nome?%n");
		nome = input.next();
		System.out.printf("Qual é a sua idade?%n");
		idade = input.nextInt();
		System.out.printf("Digite seu CPF: %n");
		cpf = input.next();
		assento=+1;
		
	}
}
