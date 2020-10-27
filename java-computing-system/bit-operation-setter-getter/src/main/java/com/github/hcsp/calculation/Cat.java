package com.github.hcsp.calculation;

public class Cat {
    private static int CUTE = 0x1;
    private static int FAT = 0x2;
    private static int WHITE = 0x4;
    private int properties = 0;

    // ↑ 请勿修改以上部分的代码，请勿添加新的成员变量
    // ↓ 请补全以下代码

    private void setParam(int param, boolean isParam) {
        if (isParam) {
            if (!isParam(param)) {
                properties ^= param;
            }
        } else {
            properties = properties & (~param);
        }
    }

    private boolean isParam(int param) {
        return (properties & param) == param;
    }

    /**
     * 使用位运算设置猫咪萌的属性
     *
     * @param cute true为萌，false为不萌
     */

    public void setCute(boolean cute) {
        setParam(CUTE, cute);
    }

    /**
     * 这只猫萌吗？请在此处使用位运算读取properties，得到猫是否萌的结果
     *
     * @return 萌则返回true，否则返回false
     */

    public boolean isCute() {
        return isParam(CUTE);
    }

    /**
     * 使用位运算设置猫咪胖的属性
     *
     * @param fat true为胖，false为不胖
     */

    public void setFat(boolean fat) {
        setParam(FAT, fat);
    }

    /**
     * 这只猫胖吗？请在此处使用位运算读取properties，得到猫是否胖的结果
     *
     * @return 胖则返回true，否则返回false
     */

    public boolean isFat() {
        return isParam(FAT);
    }

    /**
     * 使用位运算设置猫咪白的属性
     *
     * @param white true为白，false为不白
     */
    public void setWhite(boolean white) {
        setParam(WHITE, white);
    }

    /**
     * 这只猫白吗？请在此处使用位运算读取properties，得到猫是否白的结果
     *
     * @return 白则返回true，否则返回false
     */
    public boolean isWhite() {
        return isParam(WHITE);
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setCute(true);
        cat.setFat(true);
        cat.setWhite(false);
        cat.isWhite();
        System.out.println("这只猫萌吗：" + cat.isCute());
        System.out.println("这只猫胖吗：" + cat.isFat());
        System.out.println("这只猫白吗：" + cat.isWhite());
    }
}
