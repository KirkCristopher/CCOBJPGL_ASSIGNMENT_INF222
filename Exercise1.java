public class Exercise1 {
    
    static boolean iwillBehave = true;
    static boolean iwillGraduate = true;

    public static void main(String[] args) {
        //Precondition
        assert iwillBehave == true : "Mag behave ka lang sa school mo";
        //Method
        College();
        //Postcondition
        assert iwillGraduate == true : "Ang lakas mo mag computer";

    }
    static void College(){
        iwillGraduate = false;
        System.out.println("Magaling kang Bata ka");
    }
}
