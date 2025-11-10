
package tp_pbo_5;

import java.util.Scanner;

public class Triagle {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); 
        
        System.out.println("== Floyd's Triangle =="); 
        System.out.print("Masukkan banyak baris : ");
        
        int baris = input.nextInt(); 
        int angka = 1;

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(angka); 
                angka++;
            }
            System.out.println(); 
        }
        System.out.println("---------------------------");
        
    }
}
