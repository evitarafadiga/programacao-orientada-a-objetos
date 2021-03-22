package aula05;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TesteDinossauro {

	public static void main(String[] args) throws InterruptedException {

		Dinossauro Skeep = new Dinossauro();
		Scanner scan = new Scanner(System.in);
		
		Skeep.setEnergia(100);
		Skeep.setHumor(20);
		Skeep.setTemp(30);
		Skeep.setVel(10);
		
		for (int i = 0; i > -1; i++) {
			Skeep.print(Skeep.energia, Skeep.vel, Skeep.temp, Skeep.humor);
			TimeUnit.SECONDS.sleep(1);

			System.out.printf("(P)ular           co(R)rer               (C)omer\r\n"
					+ "(B)rincar        Tomar (S)ol          Ficar na S(O)mbra\r\n"
					+ "Digite a opcao desejada: %n");
			String op1 = scan.nextLine().toUpperCase();
			char op = op1.charAt(0);
			switch (op) {
			case ('P'):
				Skeep.pular();
			case('R'):
				Skeep.correr();
			case('C'):
				Skeep.comer();
			case('B'):
				Skeep.brincar();
			case('S'):
				Skeep.tomarSol();
			case('O'):
				Skeep.ficarNaSombra();
			default:
				break;
			}
		}
	}

}
