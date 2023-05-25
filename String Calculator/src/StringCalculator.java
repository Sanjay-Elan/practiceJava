import java.io.*;

public class StringCalculator {

    public static int Add ( String numbers ) {
        String[] digits = numbers.split(",");
        int result = 0;
        int[] a = new int[2];
        a[0] = Integer.parseInt(digits[0]);
        a[1] = Integer.parseInt(digits[1]);
        result = a[0] + a[1];
        System.out.println("The Sum of two value is: "+result);
        return 0;
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a two valid number string separated bt comma(,)");
        String value = br.readLine();
        Add(value);
    }
}