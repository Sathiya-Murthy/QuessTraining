package Date_09_06_2022;

class Red implements Runnable {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    @Override
    public void run() {
        System.out.println(ANSI_RED+"Red"+ANSI_RESET);
    }
}
class Blue implements Runnable {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    @Override
    public void run() {
        System.out.println(ANSI_BLUE+"Blue"+ANSI_RESET);
    }
}
class Green implements Runnable {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";


    @Override
    public void run() {
        System.out.println(ANSI_GREEN+"Green"+ANSI_RESET);
    }
}

public class Q45ThreadColor {
    public static void main(String[] args) {
       Red red = new Red();
       Blue blue = new Blue();
       Green green = new Green();
       Thread thread1=new Thread(red);
       Thread thread2=new Thread(blue);
       Thread thread3=new Thread(green);
       thread1.start();
       thread2.start();
       thread3.start();
    }
}
