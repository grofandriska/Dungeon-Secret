import java.util.Scanner;

public class Main { public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();

        /*next line needed for clearing the next in from memory since it doesn't have linebreak ( /n)*/
        scan.nextLine();

        String s = scan.nextLine();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}


