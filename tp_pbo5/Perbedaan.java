

package tp_pbo_5;


public class Perbedaan {
    public static void main(String[] args) {

    int i = 5;
    System.out.println("Postfix (i++):");
    System.out.println("Nilai i sekarang: " + i);
    int hasil_a = i++;
    System.out.println("Hasil eksekusi: " + hasil_a); 
    System.out.println("Nilai i setelah: " + i);  


    int j = 5;
    System.out.println("Prefix (++i):");
    System.out.println("Nilai j sekarang: " + j); 
    int hasil_b = ++j;
    System.out.println("Hasil eksekusi: " + hasil_b); 
    System.out.println("Nilai j setelah: " + j);  
    }
}
