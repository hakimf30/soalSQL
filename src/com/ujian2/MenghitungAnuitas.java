package com.ujian2;

import java.util.Scanner;

public class MenghitungAnuitas {

	
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int pinjaman, lamaAngsuran, bunga, angsuran,jasa,pembayaran,angsuranPokok;
	

        System.out.print("Masukkan besar pinjaman : ");
        pinjaman = masukan.nextInt();

        System.out.print("Masukkan lama angsuran (bulan) : ");
        lamaAngsuran = masukan.nextInt();

        System.out.print("Masukkan besar bunga (%) : ");
        bunga = masukan.nextInt();
        
      // angsuranPokok = pinjaman / lamaAngsuran;
       angsuran = (pinjaman*bunga/100);
       System.out.println("\n======================" +
    		              "===========================");
       System.out.println("| Angsuran ke- |  Total Angsuran  |");
       System.out.println("===================================");

        for(int i=0; i<lamaAngsuran; i++){
        	  pembayaran =(angsuran/12);
       System.out.println("      "+(i+1)+"              "+pembayaran );
         
        }
    }
}
