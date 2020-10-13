package com.study.pattern.graphic.creational.builder.kfc;

/**
 * 测试类
 *
 * @author Sky
 * @date 2020-09-16 16:35.
 */
public class KFCTest {

    public static void main(String[] args) {
        KFCDirector watier = new KFCDirector();
        MealBuilder builder = new SubMealBuilderA();
        watier.setMealBuilder(builder);
        Meal meal1 = watier.buildMeal();
        System.out.println(meal1.toString());

        MealBuilder builder2 = new SubMealBuilderB();
        watier.setMealBuilder(builder2);
        Meal meal2 = watier.buildMeal();
        System.out.println(meal2.toString());

    }

}
