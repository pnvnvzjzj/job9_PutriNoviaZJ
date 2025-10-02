/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstrak;

/**
 *
 * @author lenov
 */
    public class SegiEmpat extends BangunDatar2 {
    public int panjang;
    public int lebar;        
   
    @Override
    public void hitungLuas(){
        this.luas = panjang*lebar;
    }
    
     @Override
    public void hitungKeliling(){
        this.keliling = (2*panjang) + 2*lebar;
    }
}
