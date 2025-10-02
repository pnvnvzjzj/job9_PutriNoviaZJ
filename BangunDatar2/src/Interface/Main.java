/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author lenov
 */
public class Main {
    public static void main(String[] argv){

        SegiEmpat se = new SegiEmpat();
        se.panjang = 10;
        se.lebar = 10;
        se.hitungLuas();
        se.hitungKeliling();
        System.out.println("=== Segi Empat ===");
        System.out.println("Luas sebelum diperbesar = "+se.luas);
        System.out.println("Keliling sebelum diperbesar = "+se.keliling);
        se.perbesar();
        se.hitungLuas();
        se.hitungKeliling();
        System.out.println("Luas setelah diperbesar = "+se.luas);
        System.out.println("Keliling setelah diperbesar = "+se.keliling);
        se.perkecil();
        se.hitungLuas();
        se.hitungKeliling();
        System.out.println("Luas setelah diperkecil kembali = "+se.luas);
        System.out.println("Keliling setelah diperkecil kembali = "+se.keliling);


        SegiTigaSamaKaki stsk = new SegiTigaSamaKaki();
        stsk.alas = 8;
        stsk.tinggi = 5;
        stsk.hitungLuas();
        stsk.hitungKeliling();
        System.out.println("\n=== Segi Tiga Sama Kaki ===");
        System.out.println("Luas sebelum diperbesar = "+stsk.luas);
        System.out.println("Keliling sebelum diperbesar = "+stsk.keliling);
        stsk.perbesar();
        stsk.hitungLuas();
        stsk.hitungKeliling();
        System.out.println("Luas setelah diperbesar = "+stsk.luas);
        System.out.println("Keliling setelah diperbesar = "+stsk.keliling);
        stsk.perkecil();
        stsk.hitungLuas();
        stsk.hitungKeliling();
        System.out.println("Luas setelah diperkecil kembali = "+stsk.luas);
        System.out.println("Keliling setelah diperkecil kembali = "+stsk.keliling);


        Lingkaran ling = new Lingkaran();
        ling.jariJari = 7;
        ling.hitungLuas();
        ling.hitungKeliling();
        System.out.println("\n=== Lingkaran ===");
        System.out.println("Luas sebelum diperbesar = "+ling.luas);
        System.out.println("Keliling sebelum diperbesar = "+ling.keliling);
        ling.perbesar();
        ling.hitungLuas();
        ling.hitungKeliling();
        System.out.println("Luas setelah diperbesar = "+ling.luas);
        System.out.println("Keliling setelah diperbesar = "+ling.keliling);
        ling.perkecil();
        ling.hitungLuas();
        ling.hitungKeliling();
        System.out.println("Luas setelah diperkecil kembali = "+ling.luas);
        System.out.println("Keliling setelah diperkecil kembali = "+ling.keliling);
    }
}