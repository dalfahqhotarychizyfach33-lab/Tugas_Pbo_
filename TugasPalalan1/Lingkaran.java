package TugasPalalan1;

import java.util.Scanner;


public class Lingkaran {
    public static void main(String[] args) {
        float jari, keliling, luas;
        float Pi = 3.14f;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukan Nilai Jari Jari : ");
        jari = input.nextFloat();
                
        luas = Pi * (jari * jari);
        keliling = 2 * Pi * jari;
        
        System.out.println("Luas : " + luas);
        System.out.println("keliling : " + keliling);
        
        
    }
}
