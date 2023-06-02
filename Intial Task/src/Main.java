import java.io.*;

public class Main {
    public static int Add (String numbers) {
        numbers = numbers.replaceAll(",,|\\\\n",",0,");
        String[] digits = numbers.split(",");
        int result = 0;
        for (int j=0; j<digits.length; j++) {
            if (digits[j].isEmpty()) {
                digits[j] = "0";
            }
        }
        for( int i =0;i<digits.length;i++) {
            if (Integer.parseInt(digits[i]) < 0) {
                throw new IllegalArgumentException("negatives not allowed in the array "+digits[i]);
            } else {
                    result += Integer.parseInt(digits[i]);
            }
        }
        return result;
    }

    public static void main(String args[]) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a valid number string separated by comma(,)");
        String value = br.readLine();
        int result = Add(value);
        System.out.println("Total Sum = "+result);
    }
}