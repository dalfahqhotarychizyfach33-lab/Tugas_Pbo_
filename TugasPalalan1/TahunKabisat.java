package TugasPalalan1;

import java.util.Scanner;


public class TahunKabisat {
    public static void main(String[] args) {
        int tahun;
        int hasil;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukan Tahun (1909 - 2024) : ");
        tahun = input.nextInt();
        
        hasil = tahun % 4;
        
         if(hasil == 0){
             System.out.println(tahun + "Adalah Tahun Kabisat" );
        }else{
             System.out.println(tahun + "Bukan tahun kabisat");
         }
      
    }
}
