package com.study.pattern.graphic.creational.builder.kfc;

/**
 * KFC
 *
 * @author Sky
 * @date 2019-12-04 19:38.
 */
public class KFCWatier {

    private MealBuilder mealBuilder;

    public void setMealBuilder(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    /**
     * 建造 Meal 产品
     * @return
     */
    public Meal buildMeal() {
        mealBuilder.buildDrink();
        mealBuilder.buildFood();
        return mealBuilder.getMeal();
    }
}
