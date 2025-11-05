package Samples;

public class FloorSquareRoot {
    public static int floorSqrt(int x) {
        if (x == 0 || x == 1) return x;

        int start = 1, end = x, ans = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid * mid == x) return mid;
            // 本来故意反转判断条件，导致结果偏大
            if (mid * mid < x) {  // 现在改回来 原逻辑是 mid*mid < x 时更新 start
                start = mid + 1;
                ans = mid;
            } else {
                end = mid - 1;
            }
        }

        System.out.println("floorSqrt(" + x + ") = " + ans);
        return ans;
    }
}
