public class Pluss{

    public static void main(String[] ans){
        int x;
        int y;

        x=2147481111; //(2^31)-1 (range ng digunakan untuk interger (11))
        //lebih dari 11 itu long
        System.out.println("x = " + x);
        y=x+1;
        System.out.println("y = " + y);
    }
}