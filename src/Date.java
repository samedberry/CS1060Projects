public class Date {
    public static void main(String[] args) {

        //declare + initialize variables
        String day = "Friday";
        int date = 1;
        String monthName = "September";
        int year = 2023;

        //display variables
        System.out.println("day = " + day);
        System.out.println("date = " + date);
        System.out.println("monthName = " + monthName);
        System.out.println("year = " + year + "\n");

        //American readable date
        System.out.println("Today's date is " +day + ", " + monthName + " " + date + "st, " + year);

        //European readable date
        System.out.println("Today's date is " + day + " " + date + " "+ monthName + " " +  year);

    }
}
