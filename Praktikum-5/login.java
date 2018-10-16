import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class login {

    public static void main (String[] ans){
BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

    String nim = " ";
    String Password = " ";
        while(true){
        System.out.print("Masukan ID. User: ");

        try{
            nim = dataIn.readLine();
        }catch (IOException ex ){
            System.out.println("Error" + ex);
        }

        
        System.out.print("Masukan Password Anda: ");

        try{
            Password = dataIn.readLine();
        }catch (IOException ex){
            System.out.print("Error" + ex);
        }
       
       if (nim.equals("171530008") && Password.equals("mahasiswa123")){
           System.out.println("Selamat Datang:" + nim);
           break;
       }else if(nim.equals("171530008") == false){
           System.out.println("ID. User Salah");
       }else if (Password.equals("mahasiswa123") == false){
           System.out.println("Password Salah");
       }
        }
    }
}