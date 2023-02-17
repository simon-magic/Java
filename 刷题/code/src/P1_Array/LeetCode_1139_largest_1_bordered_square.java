package P1_Array;

import org.junit.Test;

/*
## 题目：最大的以 1 为边界的正方形
给你一个由若干 0 和 1 组成的二维网格 grid，请你找出边界全部由 1 组成的最大 正方形 子网格，并返回该子网格中的元素数量。如果不存在，则返回 0。
示例 1：
输入：grid = [[1,1,1],[1,0,1],[1,1,1]]
输出：9
示例 2：
输入：grid = [[1,1,0,0]]
输出：1
提示：
1 <= grid.length <= 100
1 <= grid[0].length <= 100
grid[i][j] 为 0 或 1
 */
public class LeetCode_1139_largest_1_bordered_square {
    @Test
    public void test(){
        int[][] grid = {{1,1,1},{1,0,1},{1,1,1}};
        System.out.println(largest1BorderedSquare(grid));
    }

    public int largest1BorderedSquare(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        //dp[i][j][0]: i,j左边连续的1的个数
        //dp[i][j][1]: i,j上边连续的1的个数
        int[][][] dp = new int[m+1][n+1][2];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (grid[i-1][j-1] == 1){
                    dp[i][j][0] = 1 + dp[i][j-1][0];
                    dp[i][j][1] = 1 + dp[i-1][j][1];
                }
            }
        }
        int res = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                //最短的那条边不一定是合法的边长，如果该边长不合法就需要缩减边长，直到找到合法的
                for (int side = Math.min(dp[i][j][0], dp[i][j][1]); side >= 1; side--){
                    if (dp[i][j-side+1][1] >= side && dp[i-side+1][j][0] >= side){
                        res = Math.max(res, side);
                        break; //更短的就没必要考虑了
                    }
                }
            }
        }
        return res * res;
    }
}
