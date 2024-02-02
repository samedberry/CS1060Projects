package CS1061HW2;

import static java.lang.System.out;

/**
 * Person class, to meet the requirements stated in the Assignment
 * Instructions for Assignment.
 * <p>
 * The following UML is given for this class: </p>
 * <p>
 * <strong><u>Person</u> <br>
 * - firstNameField: String <br>
 * - lastNameField: String <br>
 * - ageField: double <br>
 * <br>
 * +&lt;constructor&gt; Person(firstName: String, lastName: String,
 * initialAge: double) <br>
 * + setFirst(firstName: String) <br>
 * + setLast(lastName: String) <br>
 * + setAge(): String <br>
 * + getFirst(): String <br>
 * + getLast(): String <br>
 * * + getAge(): String <br>
 * + displayValues() <br>
 * + toString() : String </strong></p>
 *
 * <p>
 * Main entry point.
 * <p>
 * Execute:</p>
 * <pre>java Person</pre>
 *
 * @param argsnot used.
 * @author  Spencer Medberry, S01027971
 * @version2024-1-28, CSC-1061 Assignment 2
 */
public class Person {
    /**
     * Default value for invalid names.
     */
    private static final String DEFAULT_NAME = null;

    /**
     * Default value for invalid salary.
     */
    private static final int DEFAULT_AGE = 0;

    /**
     * String used to introduce and mark an error message.
     */
    private static final String ERROR_MARKER = "Error in setting Person object: ";

    /**
     * String used to describe a first name.
     */
    private static final String FIRST_KIND = "first";

    /**
     * String used to respond to a missing first name.
     */
    private static final String FIRST_NAME_REPLACEMENT = "<Invalid " + FIRST_KIND + " name>";

    /**
     * String used to describe a last name.
     */
    private static final String LAST_KIND = "last";

    /**
     * String used to respond to a missing last name.
     */
    private static final String LAST_NAME_REPLACEMENT = "<Invalid " + LAST_KIND + " name>";

    /**
     * Number of months in a year.
     */
    private static final int MONTHS_IN_YEAR = 12;

    /**
     * The Person's first name (assuming Western World naming).
     */
    private String firstNameField = DEFAULT_NAME;

    /**
     * The Person's last name (assuming Western World naming).
     */
    private String lastNameField = DEFAULT_NAME;

    /*
     * The Persons's age in years
     */
    private double ageField = 0;

    /**
     * Constructor.
     *
     * @param firstName  Person's first name (assuming Western World naming)
     * @param lastName   Person's last name (assuming Western World naming)
     * @param initialAge Person's initial age in years
     */
    public Person(String firstName, String lastName, double initialAge) {
		setFirst(firstName);
        setLast(lastName);
        setAge(initialAge);
//        out.println("Constructor not yet implemented");
    }

    /**
     * Print on the standard output the details of this Person.
     */
    public void displayValues() {
//        out.println("displayValues not yet implemented");
		out.println(this.toString());
    }

    /**
     * Getter for the Person's first name (assuming Western World naming).
     *
     * @return Person's first name.
     */
    public String getFirst() {
//        return "getFirst not yet implemented";
		return  this.firstNameField;
    }

    /**
     * Setter for the Person's first name (assuming Western World naming).
     *
     * @param firstName Person's first name (assuming Western World naming).
     */
    public void setFirst(String firstName) {
//        out.println("setFirst not yet implemented");
        if (firstName != null && !firstName.isEmpty()) {
            this.firstNameField = firstName;
        } else {
            out.println("Invalid Name. First name set to DEFAULT_NAME: " + DEFAULT_NAME);
            this.firstNameField = DEFAULT_NAME;
        }
    }

    /**
     * Getter for the Person's last name (assuming Western World naming).
     *
     * @return Person's last name.
     */
    public String getLast() {
//        return "getLast not yet implemented";
		return this.lastNameField;
    }

    /**
     * Setter for the Person's last name (assuming Western World naming).
     *
     * @param lastName Person's last name (assuming Western World naming).
     */
    public void setLast(String lastName) {
//        out.println("setLast not yet implemented");
        if (lastName != null && !lastName.isEmpty()) {
            this.lastNameField = lastName;
        } else {
            out.println("Invalid Name. Last name set to DEFAULT_NAME: " + DEFAULT_NAME);
            this.lastNameField = DEFAULT_NAME;
        }
    }

    /**
     * Setter for the Person's age.
     *
     * @param age Person's age.
     */
    public void setAge(double age) {
//        out.println("setAge not yet implemented");
		if (age > 0) {
			this.ageField = age;
		} else {
			out.println("Invalid age. Age set to DEFAULT_AGE: " + DEFAULT_AGE);
            this.ageField = DEFAULT_AGE;
		}
    }

    /**
     * Getter for the Person's age.
     *
     * @return Person's age.
     */
    public double getAge() {
//        out.println("getAge not yet implemented");
        return this.ageField;
    }

    /**
     * String identifying and describing this Person.
     *
     * @return the string
     */
    @Override
    public String toString() {
//        return "toString not yet implemented";
		return super.toString() + " " + firstNameField + " " + lastNameField;
    }
}
