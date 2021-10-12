package rrr;

import java.util.Scanner;

public class RLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner Rscanner = new Scanner(System.in);
	System.out.println("Masukkan Nilai N : ");
		
	int n = Rscanner.nextInt();
	
	
	int m = 1;
	int f = 1;
	
	int F = f*m;
	
	if (m == n) {
		System.out.println(F);
	
	}else {
		do {
		System.out.print(m++);
		} while (m != n);
		
	}			
	}

}
