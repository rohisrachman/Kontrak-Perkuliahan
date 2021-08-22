package com.kontrak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// operator
        Scanner inputUser;
        float tugas,kuis,keaktifan,TA;

        inputUser = new Scanner(System.in);

        System.out.print("Nilai tugas = ");
        tugas = inputUser.nextFloat();
        System.out.print("Nilai kuis = ");
        kuis = inputUser.nextFloat();
        System.out.print("Nilai keaktifan = ");
        keaktifan = inputUser.nextFloat();
        System.out.print("Nilai Tugas Akhir = ");
        TA = inputUser.nextFloat();

        // operator tersedia
System.out.println("----------------");
        if (tugas == 30)
            System.out.println("Kalian Santai ditugas");
        else if (tugas < 30)
            System.out.println("Kurang Tugas");
        else if (tugas > 30)
            System.out.println("Sibuk den tugas");

        if (kuis == 20)
            System.out.println("Kuisnya b aja");
        else if (kuis < 20)
            System.out.println("kuisnya ringan");
        else if (kuis > 20)
            System.out.println("kuisnya level hard");

        if (keaktifan == 20)
            System.out.println("aktif kayak biasa");
        else if (keaktifan < 20)
            System.out.println(" biar kurang aktif tepapa");
        else if (keaktifan > 20)
            System.out.println("tidak aktif, nilai eror");

        if (TA == 30)
            System.out.println("Tugas akhir kayak biasa");
        else if (TA < 30)
            System.out.println("Tugas akhir mudah");
        else if (TA > 30)
            System.out.println("Tugas akhir HARD Level" );

        System.out.println("----------------");

        if (tugas+kuis+keaktifan+TA == 100)
            System.out.println("aman");
        else if (tugas+kuis+keaktifan+TA < 100)
            System.out.println("belum cukup boss");
        else if (tugas+kuis+keaktifan+TA > 100)
            System.out.println("kelebihan pak");

        System.out.println("Enjoyyyyyyy");
    }
}
