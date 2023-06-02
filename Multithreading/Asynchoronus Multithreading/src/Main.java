// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

class Printer extends Thread{
     static void print ( String args[]) {
        Thread thread;
        try {
            for ( int i =0; i< args.length; i++ ){
                System.out.println(args[i]);
                sleep(300);
            }
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
class Thread1 extends Thread {
    String a[] = {"Orange","Apple","Banana"};
    public void run () {
        Printer.print(a);
    }
}
class Thread2 extends Thread {
    String b[] = {"Potato","Cabbage","Tomato"};
    public void run () {
        Printer.print(b);
    }
}

public class Main {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
    }
}