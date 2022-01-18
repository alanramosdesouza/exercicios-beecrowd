package beecrowd;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1008 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner sc = new Scanner(System.in);
		
		int numero,  nHoraTrabalho;
		float valorHora, salario;
		numero = sc.nextInt();
		nHoraTrabalho = sc.nextInt();
		valorHora = sc.nextFloat();
		salario = nHoraTrabalho * valorHora;
		
		System.out.println("NUMBER = "+ numero);
		System.out.println("SALARY = U$ "+ df.format(salario));
		
		sc.close();

	}

}
