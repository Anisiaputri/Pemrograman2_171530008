import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class InputNilai {

    public static void main(String[] ans){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in)); //deklarasi objeck
       
        String nim;
        String namamhs;
        String matakuliah;
        float nilai_lain2=0;
        float nilai_uts=0;
        float nilai_uas=0; 
        float nilai_akhir=0;

        System.out.print("Masukan NIM: ");

        try{                //menangkap pesan error
            nim = dataIn.readLine();
        }catch (IOException ex ){       //menangkap pesan error
            System.out.println("Error!" + ex);
        }

        System.out.print("Masukan Nama Mahasiswa: ");

        try{
            namamhs = dataIn.readLine();
        }catch (IOException ex){
            System.out.println("Error!" + ex);
        }

         System.out.print("Masukan Mata Kuliah: ");

        try{
            matakuliah = dataIn.readLine();
        }catch (IOException ex){
            System.out.println("Error!" + ex);
        }

         System.out.print("Masukan Nilai Lain-Lain: ");
         try{
            nilai_lain2 = Float.parseFloat(dataIn.readLine());
        }catch (IOException ex){
            System.out.println("Error!" + ex);
        }

         System.out.print("Masukan Nilai Uts: ");
         try{
            nilai_uts = Float.parseFloat(dataIn.readLine());
        }catch (IOException ex){
            System.out.println("Error!" + ex);
        }

         System.out.print("Masukan Nilai Uas: ");
        try{
            nilai_uas = Float.parseFloat(dataIn.readLine());
        }catch (IOException ex){
            System.out.println("Error!" + ex);
        }
        

        //nilai_akhir  (40%*N.L) + (30%*N.UTS) + (30%*N.UAS)
        nilai_akhir = (0.4F * nilai_lain2) + (0.3F * nilai_uts ) + (0.3F * nilai_uas);
        System.out.println(" Nilai Akhir: " + nilai_akhir);

        if(nilai_akhir>=80){
            System.out.print("Grade A");
        }else if(nilai_akhir>=76 && nilai_akhir<=79){
            System.out.print("Grade AB");
        }else if (nilai_akhir>=71 && nilai_akhir<=75){
            System.out.print("Grade B");
        }else if(nilai_akhir>=66 && nilai_akhir<=70){
            System.out.print("Grade BC");
        }else if (nilai_akhir>=61 && nilai_akhir<=65){
            System.out.print("Grade C");
        }else if (nilai_akhir>=56 && nilai_akhir<=60){
            System.out.print("Grade CD");
        }else if (nilai_akhir>=51 && nilai_akhir<=55){
            System.out.print("Grade D");
        }else if (nilai_akhir<=50){
            System.out.print("Grade E");
        }
    }
}
