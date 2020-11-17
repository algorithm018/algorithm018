package week06.minPathSum;

//给定一个包含非负整数的 m x n 网格 grid ，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
//
// 说明：每次只能向下或者向右移动一步。
//
//
//
// 示例 1：
//
//
//输入：grid = [[1,3,1],[1,5,1],[4,2,1]]
//输出：7
//解释：因为路径 1→3→1→1→1 的总和最小。
//
//
// 示例 2：
//
//
//输入：grid = [[1,2,3],[4,5,6]]
//输出：12
//
//
//
//
// 提示：
//
//
// m == grid.length
// n == grid[i].length
// 1 <= m, n <= 200
// 0 <= grid[i][j] <= 100
//
// Related Topics 数组 动态规划
// 👍 716 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minPathSum(int[][] grid) {
/*
        由于只能向左和向下走 所以对于一个 4方格的最小步骤为 右上和做下的最小值加上右下的值
        基于这个原理 所以先求出  最上一行和 最左一列的所有值
        遍历数组 求出行列夹角处最小值

            - - - -
            - *
            -
            -

 */

        //判断特殊情况
        if (grid == null || grid[0].length == 0 || grid.length == 0) {
            return 0;
        }

        //标记 最上一行 最左一行
        int[][] res = new int[grid.length][grid[0].length];
        res[0][0] = grid[0][0];
        for (int i = 1; i < grid.length; i++) {
            res[i][0] = res[i-1][0] + grid[i][0];
        }
        for (int j = 1; j < grid[0].length; j++) {
            res[0][j] = res[0][j-1] + grid[0][j];
        }
        //求右下夹角最小值

        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                res[i][j] = Math.min(res[i - 1][j], res[i][j - 1]) + grid[i][j];
            }
        }
        return res[grid.length - 1][grid[0].length - 1];

    }
}
//leetcode submit region end(Prohibit modification and deletion)

