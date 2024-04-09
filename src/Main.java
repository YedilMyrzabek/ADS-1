import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,4};
        int n = 4;
        System.out.println(first(arr,n));
    }
    public static int first(int[] arr,int n){
        if(arr.length == 1 || n == 1){
            return arr[0];
        }
        return arr[n-1] + first(arr,n-1);
    }
}