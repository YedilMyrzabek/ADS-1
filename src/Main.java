
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(first(4));
    }
    public static int first(int x) {
        if (x == 1) {
            return 1;
        }
        int y = x * x;
        return y + first(x - 1);
    }
}