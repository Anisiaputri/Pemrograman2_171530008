import java.io.*;
public class Test1 {
    public static void main(String[] ans) throws IOException {

        BufferedReader dataIn = new BufferedReader( new InputStreamReader(System.in));
        String nama_barang;
        String kode_barang;
        String jumlah_barang;

        String[] Barang = new String[5];
        Barang[0] = "Tas";
        Barang[1] = "Jaket";
        Barang[2] = "Sepatu";
       System.out.println(Barang[0]);
       System.out.println(Barang[1]);
       System.out.println(Barang[2]);


        System.out.print("Masukan Nama Barang: ");
            nama_barang = dataIn.readLine();

        System.out.print("Masukan Kode Barang: ");
            kode_barang = dataIn.readLine();

        System.out.print("Masukan Jumlah Barang: ");
       
            jumlah_barang = dataIn.readLine();

             int i=0;
        do {
            System.out.println("Barang");
             i++ ;
        }while (i<5);

       
        System.out.println("Data Barang ");
        System.out.println("Nama Barang : " + nama_barang);
        System.out.println("Kode Barang : " + kode_barang);
        System.out.println("Jumlah Barang : " + jumlah_barang);



    }
}