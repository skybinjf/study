package com.study.arithmetic;

/**
 * Fibonacci 菲波拉契数列问题（第3个数等于前2个数相加）
 * <p>古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？ </p>
 *
 * @author Sky
 * @Date 2019-01-15 10:43.
 */
public class Fibonacci {

    public static void main(String[] args) {
        printFibonacci();
    }

    /**
     * 打印菲波拉契数列值
     */
    public static void printFibonacci(){
        int f;
        int f1 = 1;
        int f2 = 1;
        for (int i = 3; i < 30; i++) {
            f = f1 + f2;
            f1 = f2;
            f2 = f;
            System.out.print(f + " ");
        }
    }
}
