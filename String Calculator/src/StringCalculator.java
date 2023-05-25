import java.io.*;

public class StringCalculator {

    public static int Add ( String numbers ) {

        String[] digits = numbers.split(",");

        int result = 0;

        for (int j=0; j<digits.length; j++) {
            if (digits[j].isEmpty()) {
                digits[j] = "0";
            }
        }

        for ( int i = 0; i < digits.length; i++ ) {
            result += Integer.parseInt(digits[i]);
        }

        System.out.println("The Sum of two value is: "+result);
        return 0;

    }
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a valid number separated by comma(,)");
        String value = br.readLine();

        Add(value);
    }
}