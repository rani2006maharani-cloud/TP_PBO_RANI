

package tp_pbo_5;

import java.util.Scanner;
public class PolaBintang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n--- 5. Pola Bintang ---");
        int n = 5;

        System.out.println("Half Triangle:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i * 2 - 1; j++) { 
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nFull Triangle (Diamond Terbalik):");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------------------");
    }
}
