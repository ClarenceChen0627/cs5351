package Samples;

public class FloorSquareRoot {
    public static int floorSqrt(int x) {
        if (x == 0 || x == 1) return x;

        int start = 1, end = x, ans = 0;
        while (start <= end) {
            // 中间值向上取整，让mid更大
            int mid = (start + end + 1) / 2; 
            if (mid * mid == x) return mid;
            // 调整条件，当mid²小于x时，故意不更新ans，而当mid²大于x时才更新ans
            if (mid * mid < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
                ans = mid; // 保存偏大的mid作为候选
            }
        }

        System.out.println("floorSqrt(" + x + ") = " + ans);
        return ans;
    }
}
