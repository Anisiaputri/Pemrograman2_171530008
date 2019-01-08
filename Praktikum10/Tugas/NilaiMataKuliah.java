
package Praktikum10.Tugas;

public class NilaiMataKuliah {
    double bobot_uts;
    double bobot_uas;
    double bobot_lain2;
    double nilai_uts;
    double nilai_uas;
    double nilai_lain2;
    double nilai_akhir;
    String Grade;

public double hitungNilai(){
    bobot_uas = 0.3;
    bobot_uts = 0.3;
    bobot_lain2 = 0.4;
    nilai_uts = 75;
    nilai_uas = 80;
    nilai_lain2 = 82.5;
    nilai_akhir = ( nilai_uts*bobot_uts)+(nilai_uas*bobot_uas)+(nilai_lain2*bobot_lain2);
    return nilai_akhir;
}

public void hitungGrade(){
    if (nilai_akhir>=100){
        System.out.print("A");
   }else if(nilai_akhir<=80){
       System.out.print("B");
   }else if(nilai_akhir <= 70){
       System.out.print("C");
   }else if(nilai_akhir<=50){
       System.out.print("D");
   }
}
}