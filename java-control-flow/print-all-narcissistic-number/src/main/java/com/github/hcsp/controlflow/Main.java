package com.github.hcsp.controlflow;

public class Main {
    public static void main(String[] args) {
        printNarcissisticNumber();
    }

    /**
     * 打印所有的水仙花数。水仙花数是指一个三位数，其各位数字立方和等于该数本身。
     *
     * <p>例如，153是一个水仙花数，因为1的立方+5的立方+3的立方 = 153
     *
     * <p>提示：可用除法和求余运算得到一个数字的个、十、百位上的数字。
     */
    // public static void printNarcissisticNumber() {}
    public static void printNarcissisticNumber() {
        for (int i = 100; i <= 999; i++) {
            if (isNarcissisticNumber(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isNarcissisticNumber(int num) {
        if (
                getCube(getDigitNumber(num, 1)) +
                        getCube(getDigitNumber(num, 2)) +
                        getCube(getDigitNumber(num, 3))
                        == num
        ) {
            return true;
        }
        return false;
    }

    private static int getCube(int num) {
        return num * num * num;
    }

    private static int getDigitNumber(int number, int digit) {
        // number = 153 digit = 2 return 5
        // number = 153 digit = 1 return 3
        int res = 0;
        while (digit > 0) {
            res = number % 10;
            number = number / 10;
            digit--;
        }
        return res;
    }
}
