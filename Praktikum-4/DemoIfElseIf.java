public class DemoIfElseIf {

    public static void main (String[] ans){
        double grade = 92.0;
        if( grade >= 90) {
            System.out.println("Excellent!");
        }else if ( (grade < 90 ) && (grade >= 60)){
            System.out.println("Good Job!");
        }else if ( (grade < 80) && (grade >= 60)){
            System.out.println("Study Harder!");
        }else{
            System.out.println("Sorry, you failed");
        }
    }
}