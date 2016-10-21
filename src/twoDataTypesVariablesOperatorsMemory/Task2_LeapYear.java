package twoDataTypesVariablesOperatorsMemory;

public class Task2_LeapYear {
    public static void main(String[] args) {

        int year = 1992;

        boolean dividesBy4 = year % 4 == 0;
        boolean dividesBy100 = year % 100 == 0;
        boolean dividesBy400 = year % 400 == 0;

        boolean isLeapYear = (dividesBy4 && !dividesBy100 && !dividesBy400 )
                || (dividesBy4 && dividesBy100 && dividesBy400);

        System.out.println(isLeapYear);
    }
}
