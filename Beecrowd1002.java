package beecrowd;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1002 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0000");
		double A, n, R;
		R = sc.nextDouble();
		n =  3.14159;
		A = n * Math.pow(R, 2);
		System.out.println("A="+ df.format(A));
		
		sc.close();
		
        //valores testados 2.00 e resultado A=12.5664
		//       ''          100.64     ''     A=31819.3103
		//       ''          150.00     ''     A=70685.7750
	}

}
