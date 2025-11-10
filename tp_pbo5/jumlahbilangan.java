
package tp_pbo_5;

import java.util.Scanner;

public class jumlahbilangan {
    public static void main(String[] args) {
        
      
        Scanner input = new Scanner(System.in); 
        
        System.out.println("== Menghitung penjumlahan rata rata ==");
        int jumlahBilangan = 0;
        int total = 0;
        int hitung = 0;
        int bilangan;
        
        System.out.print("Masukkan jumlah bilangan: ");
        jumlahBilangan = input.nextInt();
        
        System.out.println("Masukkan " + jumlahBilangan + " bilangan:");

        for (int i = 1; i <= jumlahBilangan; i++) {
            System.out.print("Bilangan ke-" + i + ": ");
            bilangan = input.nextInt(); 
            
            total += bilangan;
            hitung++;
        }

        double rataRata = (double) total / hitung;

        System.out.println("Total Jumlah Bilangan yang dimasukkan: " + hitung);
        System.out.println("Total Penjumlahan Bilangan: " + total);
        System.out.println("Rata-ratanya adalah:"+ rataRata);
        System.out.println("----------------------------------------");
        
    }
}
