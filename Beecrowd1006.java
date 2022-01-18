package beecrowd;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1006 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		DecimalFormat df = new DecimalFormat("0.0");
		Scanner sc = new Scanner(System.in);
		double A, B, C, SOMA, MEDIA;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		A = A * 2;
		B = B * 3;
		C = C * 5;
		SOMA = 2 + 3 + 5 ;
		
		MEDIA = (A + B + C )/SOMA ;
		System.out.println("MEDIA = "+ df.format(MEDIA));
		
		sc.close();

	}

}
