package com.study.pattern.graphic.creational.builder;

import com.study.pattern.graphic.creational.builder.kfc.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Builder 建造者模式测试类
 *
 * @author Sky
 * @date 2019-12-04 19:30.
 */
@SpringBootTest
public class BuilderTest {

    @Test
    public void testBuild() {
        Builder builder = new ConcreteBuilder();

        Director director = new Director();
        director.setBuilder(builder);

        Product product = director.buildProduct("style Aa", "style Bb", "style Cc");
        System.out.println(product.toString());
    }

    @Test
    public void testKFC() {
        MealBuilder mealBuilderA = new SubMealBuilderA();
        KFCWatier kfcWatier = new KFCWatier();
        kfcWatier.setMealBuilder(mealBuilderA);
        Meal mealA = kfcWatier.buildMeal();
        System.out.println("mealA: " + mealA.toString());

        MealBuilder mealBuilderB = new SubMealBuilderB();
        kfcWatier.setMealBuilder(mealBuilderB);
        Meal mealB = kfcWatier.buildMeal();
        System.out.println("mealB: " + mealB.toString());
    }
}
