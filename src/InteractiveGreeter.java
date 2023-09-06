public class InteractiveGreeter {

/*
    ask questions
    save answers in variables
    display outut

    Name?
    Where are you from?
    Age?

    Display Greeting

    Favorite activity?

    Compliment activity

    How much will you donate today?

    Thanks for donation of QTY

    example:
    What is your name? Ian
    Where are you from? Florida
    How old are you (years)? 23
    Hello Ian from Florida. You are 23 years old.
    What's something you like to do? play guitar
    Have fun next time you play guitar!
    How much would you like to donate today? 24.50
    You will donate $24.50 today. Yay!

    test your program
    should work for any name/location/age/hobby/donation amount as input
    */
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
