public class DemoBreakLoopLabel {
    public static void main (String[] ans){

        int a, b;
        Mulai:
        for(a=0;a<2;a++)
            for(b=0;b<3;b++){
                if (b==1)
                    continue
                        Mulai:
                System.out.println("a=" + a + " ; b=" + b);
            }
    }
}