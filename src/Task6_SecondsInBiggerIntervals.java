
public class Task6_SecondsInBiggerIntervals {
    public static void main(String[] args) {

        int x = 10; // container seconds

        int s = x % 60;

        System.out.println(s + " seconds ");

        int m1 = x / 60; //container minutes,

        int m = m1 % 60;

        System.out.println(m + " minutes");

        int h1 = m1 / 60; // container hours

        int h = h1 % 24;

        System.out.println(h + " hours");

        int d = h1 / 24; // container days

        System.out.println(d + " days");

        System.out.println();

        System.out.println( x + " seconds = " + d + " days " + h + " hours " + m + " minutes " + s + " seconds" );
    }
}

// D days, H hours, M minutes, S seconds