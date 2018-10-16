
public class DemoLogika{
    public static void main(String[] ans){

        //beberapa nilai
        int i = 37;
        int j = 42;
        int k = 42;

        System.out.println("Nilai Variabel. . .")
        System.out.println(" i = " + i);
        System.out.println(" j = " + j);
        System.out.println(" k = " + k);

        //lebih besar dari
        System.out.println(" Lebih besar dari. . . ");
        System.out.println(" i > " + (i >j )); // f
        System.out.println(" j > " + (j > i)); // t
        System.out.println(" k > " + (k > j)); // f 

        //lebih besar atau sama dengan
        System.out.println(" Lebih besar atau sama dengan. . . ");
        System.out.println(" i >= " + (i >= j )); // f
        System.out.println(" j >= " + (j >= i)); // t
        System.out.println(" k >= " + (k >= j)); // t

        //lebih kecil dari 
        System.out.println(" Lebih kecil dari . . . ");
        System.out.println(" i < " + (i < j )); // t
        System.out.println(" j < " + (j < i)); // f
        System.out.println(" k < " + (k < j)); // f 

        //lebih kecil atau sama dengan
        System.out.println(" Lebih kecil atau sama dengan. . . ");
        System.out.println(" i <= " + (i <= j )); // t
        System.out.println(" j <= " + (j <= i)); // f
        System.out.println(" k <= " + (k <= j)); // t

        //sama dengan
        System.out.println(" Sama Dengan.. ");
        System.out.println(" i = j " + (i = j )); // f
        System.out.println(" k = " + (k = j)); // t 

        //tidak sama dengan
        System.out.println("Tidak Sama Dengan. . ");
        System.out.println(" i != j " + (i != j )); // t
        System.out.println(" k != j " + (k != j)); // f 
    }
}