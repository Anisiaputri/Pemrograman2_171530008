public class DemoIncrementDecrement {
    public static void main(String[] ans) {

        int x=1, y=1, z=1;

        //nilai awal
        System.out.println ("Nilai x : " + x);
        System.out.println ("Nilai y : " + y);
        System.out.println ("Nilai z : " + z);

        //increment
        System.out.println ("Nilai x : " + x);
        System.out.println ("Nilai y : " + y++);
        System.out.println ("Nilai z : " + ++z);

        //decement
        System.out.println ("Nilai x : " + x);
        System.out.println ("Nilai y : " + y--);
        System.out.println ("Nilai z : " + --z);

    }
}