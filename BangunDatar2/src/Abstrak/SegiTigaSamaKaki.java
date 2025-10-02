/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstrak;

/**
 *
 * @author lenov
 */
    public class SegiTigaSamaKaki extends BangunDatar2 {
    public int alas;
    public int tinggi;        
   
    @Override
    public void hitungLuas(){
        this.luas = 0.5 * alas * tinggi;
    }
    
     @Override
    public void hitungKeliling(){
       double simir =
               Math.sqrt(Math.pow(0.5*alas, 2)+
               Math.pow(tinggi, 2));
        this.keliling = (2*simir) + alas;
    }
}
