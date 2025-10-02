/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstrak;

/**
 *
 * @author lenov
 */
public class Main {
    public static void main(String[] args) {
        // 1. Segitiga Sama Kaki
        SegiTigaSamaKaki stsk = new SegiTigaSamaKaki();
        stsk.alas = 8;
        stsk.tinggi = 5;
        stsk.hitungLuas();
        stsk.hitungKeliling();
        System.out.println("Luas STSK = " + stsk.luas);
        System.out.println("Keliling STSK = " + stsk.keliling);

        // 2. Segi Empat (Persegi Panjang)
        SegiEmpat se = new SegiEmpat();
        se.panjang = 7;
        se.lebar = 4;
        se.hitungLuas();
        se.hitungKeliling();
        System.out.println("Luas Segi Empat = " + se.luas);
        System.out.println("Keliling Segi Empat = " + se.keliling);

        // 3. Lingkaran
        Lingkaran ling = new Lingkaran();
        ling.jariJari = 10;
        ling.hitungLuas();
        ling.hitungKeliling();
        System.out.println("Luas Lingkaran = " + ling.luas);
        System.out.println("Keliling Lingkaran = " + ling.keliling);
    }
}