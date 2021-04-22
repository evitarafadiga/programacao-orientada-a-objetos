package video;

public class FisherYatesExemplo {

	public static void main(String[] args) {
		String[] a = {"A","P","T","O"};
		int i = a.length;
		int j = 0;
		String temp = "";
		
		while(--i > 0) {
			j = (int) Math.floor(Math.random()*(i+1));
			temp = a[j];
			a[j] = a[i];
			a[i] = temp;
		}
		System.out.printf("A ordem equivale a: ");
		for (int k = 0; k < a.length; k++) {
			System.out.printf(" %s",a[k]);
			
		}
	}

}
