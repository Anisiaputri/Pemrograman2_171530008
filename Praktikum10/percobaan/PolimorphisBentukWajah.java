
package Praktikum10Percobaan;

//Program utama
public class PolimorphisBentukWajah {
    /**
     * Main method
     */
    public static void main(String [] ans){
      System.out.print("\n Progam Polimorphis");
      System.out.print("=====================");
      //membuat objek-objek raut(ekspresei) dari wajah 
      BentukWajah objbentuk = new BentukWajah();
      Senyum objsenyum = new Senyum();
      Tertawa objtertawa = new Tertawa();
      Marah objmarah  = new Marah();
      Sedih objsedih = new Sedih();
      //polimorphis dari bentuk wajah ada 5 dimulai dari 0-4
      BentukWajah []Bentuk = new BentukWajah[5];
      Bentuk[0]=objbentuk;
      Bentuk[1]=objsenyum;
      Bentuk[2]=objtertawa;
      Bentuk[3]=objmarah;
      Bentuk[4]=objsedih;
      System.out.print("Bentuk[0] : "+ Bentuk[0].respons());
      System.out.print("Bentuk[1] : "+ Bentuk[1].respons());
      System.out.print("Bentuk[2] : "+ Bentuk[2].respons());
      System.out.print("Bentuk[3] : "+ Bentuk[3].respons());
      System.out.print("Bentuk[4] : "+ Bentuk[4].respons());
    }
}
