package aula03;

/* Fórmula :

data_juliana = 	1461*(ano+4800+(mes-14)/12))/4+(367*(mes-2-12*((mes-14)/12)))/12-(3*((ano+4900+(mes-14)/12)/100))/4+dia-32075

	Para testar informe para a função a data de inicio das olimpíadas do Brasil 05 de Agosto de 2016. 
	O resultado deverá ser : 2457606
*/
public class CalendarioJuliana {

	public static void main(String[] args) {
		int dia = 5;
		int mes = 8;
		int ano = 2016;
		
		System.out.printf("A data juliana de %d/%d/%d equivale a: %d%n", dia, mes, ano,calculaDataJuliana(dia, mes, ano));
		
	}
	
	public static int calculaDataJuliana (int dia, int mes, int ano){
		int juliana = 0;
		juliana = 1461*(ano +4800+(mes-14)/12)/4+(367*(mes-2-12*((mes-14)/12)))/12-(3*((ano+4900+(mes-14)/12)/100))/4+dia-32075;
		
		return juliana;
	}
	
}
