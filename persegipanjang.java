import java.util.Scanner;  
public class persegipanjang
{
 public static void main (String [] args)
 {
 Scanner input = new Scanner (System.in);
 System.out.print("input nilai panjang = ");
 Double b = input.nextDouble();
 System.out.print("input nilai lebar = ");
 Double c = input.nextDouble();
 System.out.println("");
 System.out.println("Pilih proses perhitungan berikut");
 System.out.println("--------------------------------");
 System.out.println("1. Diagonal persegi panjang");
 System.out.println("2. Luas persegi panjang");
 System.out.println("3. Keliling persegi panjang");
 System.out.println("4. Keluar program");
 System.out.print("masukkan pilihan = ");
 int a = input.nextInt();
 Double d = 2.0;
 
 switch (a)
 {
 case 1 : System.out.println("diagonal persegi panjang = " + Math.sqrt ((Math.pow(b,d)) +(Math.pow (c,d))));
 break;
 case 2 : System.out.println("luas persegi panjang = " + (b*c));
 break;
 case 3 : System.out.println("keliling  persegi panjang = " + ((2*b)+(2*c)));
 break;
 case 4 : System.out.println("terimakasih telah menggunakan program ini");
 break;
 }
    }  
} 