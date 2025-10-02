/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author lenov
 */
public class Lingkaran extends BangunDatar2 implements Resizeable{
    public int jariJari;

    @Override
    public void hitungLuas(){
        this.luas = Math.PI*jariJari*jariJari;
    }
    @Override
    public void hitungKeliling(){
        this.keliling = 2*Math.PI*jariJari;
    }
    @Override
    public void perbesar(){
        this.jariJari = 2*this.jariJari;
    }
    
    @Override
    public void perkecil(){
        this.jariJari = (int) (0.5*this.jariJari);
    }
}