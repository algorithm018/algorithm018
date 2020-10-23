package week01.isPalindrome;
//判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
//
// 示例 1:
//
// 输入: 121
//输出: true
//
//
// 示例 2:
//
// 输入: -121
//输出: false
//解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
//
//
// 示例 3:
//
// 输入: 10
//输出: false
//解释: 从右向左读, 为 01 。因此它不是一个回文数。
//
//
// 进阶:
//
// 你能不将整数转为字符串来解决这个问题吗？
// Related Topics 数学
// 👍 1280 👎 0


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String s = String.valueOf(x);
        String[] n = s.split("");
        for (int i = 0; i < n.length/2; i++) {
            if (!n[i].equals(n[n.length - i-1])) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome1(int x) {
        if (x < 0) {
            return false;
        }
        int ans = 0;
        int old = x;
        while (x > 0) {
            ans = ans * 10 + x % 10;
            x /= 10;
        }
        return ans == old;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
