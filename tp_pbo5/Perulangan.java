
package tp_pbo_5;

import java.util.Scanner;

public class Perulangan {
    
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); 
        
        System.out.println("=== Terbesar dan Terkecil ===");
        
        int bilanganPertama;
        int max;
        int min;
        
        System.out.print("Masukkan bilangan ke-1: ");
        bilanganPertama = input.nextInt(); 
        
        max = bilanganPertama; 
        min = bilanganPertama;
        
        for (int i = 2; i <= 10; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            int bilangan = input.nextInt();

            if (bilangan > max) {
                max = bilangan;
            }

            if (bilangan < min) {
                min = bilangan;
            }
        }
        System.out.println("====================================");
        System.out.println("Bilangan Terbesar adalah: " + max);
        System.out.println("Bilangan Terkecil adalah: " + min);
        System.out.println("---------------------------------");
        
       
    }
}
