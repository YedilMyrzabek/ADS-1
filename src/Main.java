import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sixth(sc,n);
    }
    public static void sixth(Scanner sc,int n){
        if (n == 0) {
            return;
        }
        else {
            String elem = sc.next();

            sixth(sc, n - 1);
            System.out.println(elem);
        }
    }
}