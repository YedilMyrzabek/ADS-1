import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int b = 4;
        int n = 3;
        System.out.println(first(b,n));
    }
    public static int first(int x,int n){
        if(n == 0){
            return 1;
        }
        int y = (int) Math.pow(x,n);
        return y+first(x,n-1);
    }
}