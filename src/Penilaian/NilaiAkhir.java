/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Penilaian;

/**
 *
 * @author Nazma
 */
public class NilaiAkhir extends Mahasiswa {
    protected int uts, uas, tugas;

    @Override
    public String getNpm() {
        System.out.println("subclass");
        return npm;
        {
        
    public NilaiAkhir(int uts, int uas, int tugas) {
        this.uts = uts;
        this.uas = uas;
        this.tugas = tugas;
    }
    
    public double sethitungNilaiAkhir(){
        return 30%*uts + 30%uas + 40%tugas;
    }
    
    public static void main (String[] args){
        Mahasiswa Mahasiswa1 = new Mahasiswa ();
        
        Mahasiwa1.setNama ("Najmaraissa");
        Konser1.setNpm ("2110010631");
        
        System.out.println("Nama:" + Mahasiwa1.getNama());
        System.out.println("Npm:" + Mahasiwa1.getNpm());
        
}
