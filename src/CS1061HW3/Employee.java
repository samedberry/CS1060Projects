package CS1061HW3;

/**
 * Employee.java
 * Employee abstract superclass implements Payable.
 *
 * <p>
 * Execute:</p>
 * <pre>java Employee</pre>
 *
 * @param argsnot used.
 * @author  Spencer Medberry, S01027971
 * @version2024-2-3, CSC-1061 Assignment 3
 */
public class Employee extends Payable
{
   private String firstName;
   private String lastName;
   private String socialSecurityNumber;

   private CharSequence numbers = new String("0123456789");

   // three-argument constructor
   public Employee(String first, String last, String ssn)
   {
      firstName = first;
      lastName = last;
      socialSecurityNumber = ssn;
   } // end three-argument Employee constructor

   // set first name
   public void setFirstName(String first) {
      if (!first.matches(".*\\d.*")) {
         firstName = first;
      } else {
         System.out.println("Invalid Name. First name set to INVALID_FIRST.");
         firstName = "INVALID_FIRST";
      }
   } // end method setFirstName

   // return first name
   public String getFirstName()
   {
      return firstName;
   } // end method getFirstName

   // set last name
   public void setLastName(String last) {
      if (!last.matches(".*\\d.*")) {
         lastName = last;
      } else {
         System.out.println("Invalid Name. Last name set to INVALID_LAST.");
         lastName = "INVALID_LAST";
      }
   } // end method setLastName

   // return last name
   public String getLastName()
   {
      return lastName;
   } // end method getLastName

   // set social security number
   public void setSocialSecurityNumber(String ssn)
   {
      if (ssn.matches("\\d{3}-\\d{2}-\\d{4}")) {
         socialSecurityNumber = ssn;
      } else {
         System.out.println("Invalid SSN. SSN set to 000-00-0000");
         socialSecurityNumber = "000-00-0000";
      }
   } // end method setSocialSecurityNumber

   // return social security number
   public String getSocialSecurityNumber()
   {
      return socialSecurityNumber;
   } // end method getSocialSecurityNumber

   // return String representation of Employee object
   @Override
   public String toString()
   {
      return String.format("%s %s\nsocial security number: %s", 
         getFirstName(), getLastName(), getSocialSecurityNumber());
   } // end method toString
} // end class Employee

