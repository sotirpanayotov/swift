
public class Task2_LeapYear {
    public static void main(String[] args) {

        int year = 1900;

        boolean dividesBy4 = year % 4 == 0;
        boolean dividesBy100 = year % 100 == 0;
        boolean dividesBy400 = year % 400 == 0;
        boolean dividesByBoth100And400 = dividesBy100 && dividesBy400;

        boolean isLeapYear = (dividesByBoth100And400 || dividesBy4);

        System.out.println(isLeapYear);
    }
}
