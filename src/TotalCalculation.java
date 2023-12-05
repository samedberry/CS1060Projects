import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class TotalCalculation {
    public static void main(String[] args) throws Exception {
        File file = new File("items.txt");
        FileReader fileReader = new FileReader(file);
        Scanner input1 = new Scanner(fileReader);

        double subtotal = 0.0;
        while (input1.hasNextDouble()) {
            subtotal = subtotal + input1.nextDouble();
        }

        double tax = subtotal * .053;
        double total = subtotal + tax;

        DecimalFormat df = new DecimalFormat("0.00");

        try (FileWriter fileWriter = new FileWriter("total.txt")) {
            fileWriter.write("The sub-total is $" + df.format(subtotal) + "\n");
            fileWriter.write("The tax is $" + df.format(tax) + "\n");
            fileWriter.write("The total is $" + df.format(total));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
