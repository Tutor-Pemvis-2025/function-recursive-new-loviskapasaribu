// 12S25016_Loviska Astria Pasaribu
// 12S25040_Cyndi Manullang

import java.util.*;
import java.lang.Math;

public class TFUNC {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, hasil;

        n = Integer.parseInt(input.nextLine());
        hasil = pertambahan(n);
        System.out.println("Bilangan yang dimasukkan : " + hasil);
    }
    
    public static int pertambahan(int n) {
        int hasil;

        if (n == 1) {
            hasil = 1;
        } else {
            hasil = pertambahan(n - 1) + n;
        }
        
        return hasil;
    }
}
