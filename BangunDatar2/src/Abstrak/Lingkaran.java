/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstrak;

/**
 *
 * @author lenov
 */
public class Lingkaran extends BangunDatar2{
    public double jariJari;

    @Override
    public void hitungLuas(){
        this.luas = Math.PI*jariJari*jariJari;
    }
    @Override
    public void hitungKeliling(){
        this.keliling = 2*Math.PI*jariJari;
    }
}
