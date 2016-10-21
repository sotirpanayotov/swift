
public class Task7_PersonCharacteristics {
    public static void main(String[] args) {

        String firstName = "Georgi";
        String lastName = "Georgiev";
        int birthYear = 2002;
        int thisYear = 2016;
        int old = thisYear - birthYear;
        double weight = 48.3;
        int height = 156;
        String education = "student";

        System.out.println();
        System.out.print(firstName + " " + lastName + " is " + old + " . " );
        System.out.print("His weight is " + weight + " and he is " + height + "cm tall. ");
        System.out.println("He is a " + education + ".");
    }
}
//<първо име> <последно име> is <години> years old. His weight is <тегло> and he is <височина> cm tall. He is a <професия>.