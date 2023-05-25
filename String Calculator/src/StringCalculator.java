// Importing necessary packages for the code base
import java.io.*;

//Class definition
public class StringCalculator {

    //Method to Add receiving String input only
    public static int Add ( String numbers ) {

        //handling delimiters and replacing it to 0
        numbers = numbers.replaceAll(",,|\\\\n|//;|;",",0,");

        //Splitting the value based on comma(,)
        String[] digits = numbers.split(",");

        //Initializing local variables
        int result = 0;
        int flag = 0;

        //Looping through the array to the empty character and replacing with 0
        for (int j=0; j<digits.length; j++) {

            if (digits[j].isEmpty()) {

                digits[j] = "0";

            }

        }

        //Looping through the array to find the negative elements and checking whether the individual value is greater than 0
        for ( int i = 0; i < digits.length; i++ ) {

            if ( Integer.parseInt(digits[i]) < 0 ) {

                flag += 1;

            }

            else {

                result += Integer.parseInt(digits[i]);

            }
        }

        //Based on the flag value throwing exception if we find negative values else the return the result of the addition
        if ( flag > 1 ) {

            System.out.println("Two or more array values contains negative value, the current array value is "+numbers);
            throw new IllegalArgumentException();

        }
        else if ( flag == 1){

            throw new IllegalArgumentException("negatives not allowed in the array");

        }

        return result;

    }

    //Starting of Main method
    public static void main(String args[]) throws IOException {

        //Initializing Buffered Reader to receive input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Receiving user input using readline method
        System.out.println("Enter a valid number separated by comma(,)");
        String value = br.readLine();

        //Calling Add method with user input as parameterized
        int result = Add(value);

        //Printing the result to the user
        System.out.println("Total Sum of the given input is: "+result);
    }
    //End of the Main method
}
//End of Class