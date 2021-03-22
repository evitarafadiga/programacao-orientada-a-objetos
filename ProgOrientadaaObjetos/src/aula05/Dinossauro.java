package aula05;

import java.util.Iterator;

public class Dinossauro {

	int energia = 0;
	int vel = 0;
	int temp = 0;
	int humor = 0;

	public Dinossauro() {
		this.energia = energia;
		this.vel = vel;
		this.temp = temp;
		this.humor = humor;
	}

	public void pular() {
		energia -= 1;
		humor += 1;
		System.out.printf("Skeep está pulando.%n");
	}

	public void correr() {
		energia -= 1;
		humor += 1;
		System.out.printf("Skeep está correndo.%n");
	}

	public void comer() {
		energia = 1;
		humor += 1;
		System.out.printf("Skeep está comendo.%n");
	}

	public void brincar() {
		energia -= 1;
		humor += 1;
		System.out.printf("Skeep está brincando.%n");
	}

	public void tomarSol() {
		vel += 1;
		energia -= 1;
		humor += 1;
		System.out.printf("Skeep está tomando sol.%n");
	}

	public void ficarNaSombra() {
		energia += 1;
		humor -= 1;
		System.out.printf("Skeep está na sombra.%n");
	}

	public void print(int... args) {
		int i = 0;
		switch (args[i]) {
		case 0:
			System.out.printf("ENERGIA : %n");
		case 1:
			System.out.printf("VELOCIDADE : %n");
		case 2:
			System.out.printf("TEMPERATURA : %n");
		case 3:
			System.out.printf("HUMOR : %n");
		default:
			break;
		}

		String n = "CARACTERÍSTICAS DINOSSAURO";
		float max = 150f;
		float ratio = 0f;
		System.out.printf("%-20s%n", n);

		System.out.printf(" [");
		for (int k : args) {
			ratio = k / max;
			for (int j = 0; j < ratio * 100; j++) {
				System.out.printf("*");
			}
			System.out.printf("] %n");
		}

	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public int getVel() {
		return vel;
	}

	public void setVel(int vel) {
		this.vel = vel;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public int getHumor() {
		return humor;
	}

	public void setHumor(int humor) {
		this.humor = humor;
	}

}
