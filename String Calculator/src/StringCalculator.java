import java.io.*;

public class StringCalculator {

    public static int Add ( String numbers ) {

        numbers = numbers.replaceAll(",,|\\\\n|//;|;",",0,");

        String[] digits = numbers.split(",");

        int result = 0;
        int flag = 0;

        for (int j=0; j<digits.length; j++) {

            if (digits[j].isEmpty()) {

                digits[j] = "0";

            }

        }

        for ( int i = 0; i < digits.length; i++ ) {

            if ( Integer.parseInt(digits[i]) < 0 ) {

                flag += 1;

            }

            else {

                result += Integer.parseInt(digits[i]);

            }
        }

        if ( flag > 1 ) {

            System.out.println("Two or multiple array values contains negative value, the current array value is "+numbers);
            throw new IllegalArgumentException();

        }
        else if ( flag == 1){

            throw new IllegalArgumentException("negatives not allowed in the array");

        }

        return result;

    }
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a valid number separated by comma(,)");
        String value = br.readLine();

        int result = Add(value);

        System.out.println("Total Sum of the given input is: "+result);
    }
}