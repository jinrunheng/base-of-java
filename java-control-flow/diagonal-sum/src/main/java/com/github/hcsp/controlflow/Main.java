package com.github.hcsp.controlflow;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(diagonalSum(matrix));
    }

    /**
     * 给定一个二维数组，返回其主对角线（从左上到右下）元素之和。你可以假设该数组是NxN的，即一维和二维长度相同，都是N。
     *
     * @param matrix 给定的二维数组
     * @return 对角线元素之和
     */
    public static int diagonalSum(int[][] matrix) {
        // [0,0] + [1,1] + [2,2] + [3,3]
        // [0,3] + [1,2] + [2,1] + [3,0]
        int res = 0;
        int len = matrix.length;

        for (int i = 0; i < len; i++) {
            res += matrix[i][i];
        }
        return res;
    }
}
