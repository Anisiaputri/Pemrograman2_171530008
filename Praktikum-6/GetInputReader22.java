Import java.io.*;

public class GetInputReader2{
    public static void main(String[] ans){
        BufferReader dataIn = new BufferReader (new InputStrteamReader(System.in));

        String nim="", nama="", tempat="", tgllahir="";
        System.out.print("Masukkan Nama Anda : ");
            nama = dataIn.readLine();
        System.out.print("Masukan NIM Anda : ");
            nim = dataIn.readLine();
        System.out.print("Masukan Tempat Lahir : ");
            tempat = dataIn.readLine();
        System.out.print("Masukan Tanggal Lahir : ");
            tgllahir = dataIn.readLine();

        System.out.println("");
        System.out.println("----------------------------- : ");
        System.out.print("Selamat datang : " +nama);
        System.out.print("NIM : " +nim);
        System.out.print("Tempat Lahir : " + tempat);
        System.out.print("Tanggal Lahir : " + tgllahir);
    }
}