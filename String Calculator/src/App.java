//package track;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class App {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] a = new int[n];
        int[] greenness = new int[1000000002];
        for ( int i =0; i<n; i++ ) {
            a[i] = Integer.parseInt(br.readLine());
        }

        for ( int j = -10000000; j<=1000000000;j++){
             greenness[j] = j;
        }

        for (int element : a) {
            System.out.println(greenness[element+1]);
            System.out.println(greenness[element-1]);
        }

    }
}
