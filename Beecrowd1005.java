package beecrowd;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1005 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00000");
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double A, B, SOMA, MEDIA;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		A = A * 3.5;
		B = B * 7.5;
		SOMA = 3.5 + 7.5 ;
		
		MEDIA = (A + B )/SOMA ;
		System.out.println("MEDIA = "+ df.format(MEDIA));
		
		sc.close();
	}

}
