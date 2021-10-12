import java.util.Scanner;

public class Keliling {

	public static void main(String[] args) {
		
		Scanner Rscanner = new Scanner (System.in);
		System.out.println("Masukkan Jari-jari : ");
		
		double phi = 3.14;
		double r = Rscanner.nextDouble();
		
		double k = 2*phi*r;
		
		System.out.println(k);
	}

}
