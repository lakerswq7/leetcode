package dp.sequence;
/*
 * 0. 不能排序，求能不能跳到，sequence -> dp
 * 1. f[i] -> 在第i个位置时最远能跳到哪
 * 2. f[i] = max(f[i - 1], i + A[i])，且i <= f[i - 1]，否则返回false
 * 3. f[0] = A[0]
 * 4. 如果任意f[i] >= n - 1，则返回true
 * 优化：因为只跟前面一个值有关，所以可以不用数组，只用一个数代替
 */
public class JumpGame {
    public boolean canJump(int[] A) {
        int max = A[0];
        for (int i = 1; i < A.length; i++) {
            if (i <= max) {
                max = Math.max(max, i + A[i]);
                if (max >= A.length - 1) {
                    return true;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
