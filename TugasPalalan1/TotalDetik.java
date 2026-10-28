package TugasPalalan1;

import java.util.Scanner;


public class TotalDetik {
    public static void main(String[] args) {
        int jam, menit, detik, totdet;
        
        Scanner input = new Scanner(System.in);
        
          System.out.println("Masukan jam : ");
          jam = input.nextInt();
          
          System.out.println("Masukan menit : ");
          menit = input.nextInt();
          
          System.out.println("Masukan detik : ");
          detik = input.nextInt();
          
          totdet = jam * 3600 + menit * 60 + detik;
          
          System.out.println("Total detik : " + totdet);
    }
}
