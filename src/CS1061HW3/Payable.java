package CS1061HW3;

/**
 * Payable.java
 * Payable interface declaration.
 *
 * <p>
 * Execute:</p>
 * <pre>java Invoice</pre>
 *
 * @param argsnot used.
 * @author  Spencer Medberry, S01027971
 * @version2024-2-3, CSC-1061 Assignment 3
 */

public class Payable
{    
   double getPaymentAmount() {
       Class c = getClass();
       
       System.out.printf("%s must override method getPaymentAmount()/n", c.getName());
       
       return 0;
   }
}

