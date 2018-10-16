import java.text.NumbeFormat;

public class DemoArray4 {
    NumbeFormat nf = NumbeFormat.getInstance();
    nf.setMaximumFractionDigits(2);
    int nilai [] [] = new int [2] [3] ;
    nilai[0] [0]=85;
    nilai[0] [1]=81;
    nilai[0] [2]=75;
    nilai[1] [0]=65;
    nilai[1] [2]=73;
    
    String MK []=("Pemograman 2\t", "Konsep Basis Data");
    double ratarataMK [] = new double [nilai.length];

    for (int i=0; i<nilai.length; i++) {
        System.out.print (MK[i] + "\t");
        for (int j=0; j<nilai[0].length; j++){
            System.out.print(nilai[i][j] + "\t");
        }
        System.out.print(nf.format(ratarataMK[i])+"\n");
    }
}
}