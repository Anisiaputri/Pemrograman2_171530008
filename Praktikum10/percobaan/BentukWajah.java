package Praktikum10Percobaan;

 class BentukWajah {
    /**
 *Memmbua sebuah method respons pada class induk dimana mengembalikan sebuah nilai string
 */
public String respons(){
    return ("Perhatian reaksi wajah saya\n");  
    }
 }

/*
membuat class-class lain dengan turunan dari class bentukwajah
*/
class Senyum extends BentukWajah{
    public String respons(){
        return ("Senyum karena senang\n");
    }
}

class Tertawa extends BentukWajah{
    public String respons(){
        return ("Tertawa Karena Gembira");
    }
}
class Marah extends BentukWajah{
    public String respons(){
        return("Kemarahan disebabkan karena bertengkar");
    }
}
class Sedih extends BentukWajah{
    public String respons(){
        return("Sedih disebabkan cemburu");
    }
}
