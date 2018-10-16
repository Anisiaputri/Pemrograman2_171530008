import java.io.*;

public class Login2{

    public static void main(String[] ans){
        BufferedReader dataInput = new BufferedReader( new InputStreamReader(System.in));

        String id_user, password;
        boolean status= true;

        do{
            System.out.print("Masukan ID User: ");
            id_user = dataInput.readLine();

            System.out.print("Masukan Password");
            password = dataInput.readLine();

            if(!id_user.equals("171530008")){
                System.out.println("ID. User yang anda masukan salah");
            }else {
                if(!password.equals("mahasiswa123")){
                    System.out.println("Password yang anda masukan salah");
                }else{
                    status = false;
                }
            }
            }while(status);
            System.out.println("Selamat Datang: "+ id_user );
        }
    }
