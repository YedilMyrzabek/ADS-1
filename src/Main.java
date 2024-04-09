import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int x = 2;
        int y = 3;

        eighth(x, y, new ArrayList<>());
    }
    public static void eighth(int n, int k, List<Integer> nums) {
        if (n == 0) {
            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= k; i++) {
            nums.add(i);
            eighth(n - 1, k, nums);
            nums.remove(nums.size() - 1);
        }
    }
}