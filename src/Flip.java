import java.util.Scanner;

public class Flip {

    public static void main(String[] args) {
        System.out.println("Welcome to flip coin program");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many times to flip coin");
        int a = sc.nextInt();
        System.out.println(a);
        int i = 0;
        int c = 0, d = 0;
        for (i = 1; i <= a; i++) {
            double b = Math.random();
            if (b < 0.5) {
                System.out.println("tails");
                c++;
                System.out.println(c);
            } else {
                System.out.println("Heads");
                d++;
                System.out.println(d);
            }
        }
        double e = (c * 100) / a;

        System.out.println("Tail% " + e);
        double f = (100 - e);
        System.out.println("Head% " + f);
    }
}