public class DemoCasting {

    public static void main(String[] ans){
        // casting implisit
        byte b = 100;
        int i = b;

        //casting eksplisit
        int x = 1000;
        byte y = (byte) x;
        System.out.println("Casting byte y : " + y);

        double j = 10.5;
        int k = (int) j;
        System.out.println("Casting byte k : " + k);

        j = 10.2;
        int l = (int) j;
        System.out.println("Casting byte l : " + l);

        j = 10.8;
        int m = (short) j;
        System.out.println("Casting byte m : " + m);
    }
}