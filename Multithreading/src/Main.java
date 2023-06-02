// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

class FirstThread implements Runnable {
    Thread t;
    FirstThread() {
        t = new Thread(this);
        t.start();
    }

    public void run() {
        try {
            for (int i = 0; i<=20; i++ ){
                System.out.println(i);
                t.sleep(1000);
            }
            }
        catch (InterruptedException e) {System.out.println(e);}
    }
}

class SecondThread implements Runnable {
    Thread t;
    SecondThread() {
        t = new Thread(this);
        t.start();
    }

    public void run() {
        try {
            for (int i = 65; i<=85; i++ ){
                System.out.println((char) i);
                t.sleep(1000);
            }
        }
        catch (InterruptedException e) {System.out.println(e);}
    }
}

public class Main {
    public static void main (String args[]) {
        new FirstThread();
        new SecondThread();
    }
}

