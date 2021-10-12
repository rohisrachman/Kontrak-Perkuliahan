package operasi;

import java.util.Scanner;

public class Sisabagi {

	public static void main(String[] args) {	
		float angka, pembagi;
		float hasil;
		
		Scanner inputUser = new Scanner(System.in);
		
		System.out.println("Masukkan Bilangan = ");
		angka = inputUser.nextFloat();
		
		System.out.println("Masukkan Pembagi = ");
		pembagi = inputUser.nextFloat();
		hasil = angka%pembagi;
		
	System.out.println("------");
		
	if (hasil == 0 );
			System.out.println("ganjil");
			
		
	}

}
