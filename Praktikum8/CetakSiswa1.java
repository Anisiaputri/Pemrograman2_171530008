/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum8;

/**
 *
 * @author CQ42
 */
public class CetakSiswa1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Siswa data = new Siswa();
        data.infoSiswa();
        
        data.no_absen = 1;
        System.out.println(data.no_absen);
        
        data.setNis("160001");
        System.out.println(data.nis);
        
        data.setNama("Zidna Aisya Karima");
        System.out.println(data.nama_siswa);
        
        data.setTtl("Pekalongan", "14-08-1997");
        System.out.println(data.nilai_ipa +", "+data.nilai_ips);
    }
    
}
