import javax.swing.*;
public class LuasSegitiga {
    public static void main(String[] args) {
        System.out.println("Program untuk menghitung luas segitiga :");
        String alas = "";
        alas = JOptionPane.showInputDialog("Masukkan alasnya : ");
        int a=Integer.parseInt(alas);
        String tinggi = "";
        tinggi = JOptionPane.showInputDialog("Masukkan tingginya : ");
        int t=Integer.parseInt(tinggi);
    System.out.println ("Alas = "+(a));
        System.out.println ("Tinggi = "+(t));
        System.out.println ("Luasnya = "+(a*t/2));
    }
}