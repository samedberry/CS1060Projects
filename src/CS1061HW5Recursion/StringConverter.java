package CS1061HW5Recursion;

public class StringConverter {
    public static int convert (String numString) {
        if(!numString.matches("-?\\d+") && !numString.isEmpty()) {
            throw new NumberFormatException(numString + " is not an integer.");
        } else if(numString.isEmpty()) {
            return 0;
        } else if(numString.charAt(0) == '-') {
            return -1*convert(numString.substring(1));
        } else {
            int num1 =(numString.charAt(0)-'0');
            int num4 = (int)Math.pow(10, numString.length()-1);
            int numFinal =num1*num4;
            return numFinal + convert(numString.substring(1));
        }
    }
}
