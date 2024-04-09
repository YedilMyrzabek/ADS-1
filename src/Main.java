import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        first(sc,n);
    }
    public static void first(Scanner sc,int n){
        if(n == 0){
            return;
        }

        int num = sc.nextInt();

        first(sc,n-1);
        System.out.println(num);
    }
}