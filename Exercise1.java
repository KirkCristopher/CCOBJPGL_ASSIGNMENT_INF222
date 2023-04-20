public class Exercise1 {
    
    static boolean iwillBehave = true;
    static boolean iwillGraduate = true;

    public static void main(String[] args) {

        assert iwillBehave == true : "Mag behave ka lang sa school mo";

        College();

        assert iwillGraduate == true : "Ang lakas mo mag computer";

    }
    static void College(){
        iwillGraduate = false;
        System.out.println("Magaling kang Bata ka");
    }
}
