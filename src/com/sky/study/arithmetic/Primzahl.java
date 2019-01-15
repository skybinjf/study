package com.sky.study.arithmetic;

/**
 * 素数 Primzahl
 * <p>判断101-200之间有多少个素数，并输出所有素数。</p>
 * <p>程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除， 则表明此数不是素数，反之是素数。</p>
 *
 * @author Sky
 * @Date 2019-01-15 14:25.
 */
public class Primzahl {

    public static void main(String[] args) {
        printPrimzahl();
    }

    /**
     * 打印素数
     */
    public static void printPrimzahl(){
        // 统计素数的数量
        int count = 0;
        for (int i = 100; i < 200; i++) {
            boolean isPrimzahl = true;
            //如果是合数，必定是两个数的乘积，这两个数肯定一个大于根号N，一个小于根号N
            for (int j = 2; j < Math.sqrt(i); j++) {
                if(i % j == 0){
                    isPrimzahl = false;
                    break;
                }
            }
            if(isPrimzahl){
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("素数个数：" + count + " 个");
    }

}
