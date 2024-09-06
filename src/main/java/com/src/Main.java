package com.src;
// import com.google.inject.Guice;
// import com.google.inject.Injector;
// import com.src.modules.CoffeeMachineModule;

import com.src.coffeeMachine.coffeeMachine;
import com.src.coffeeMachine.pojo.Ingredients;

public class Main {
    public static void main(String[] args) {
        // Injector injector = Guice.createInjector(new CoffeeMachineModule());
        Ingredients ingredients = Ingredients.builder()
                .milk(1200)
                .coffee(500)
                .sugar(500)
                .water(1500)
                .build();
        coffeeMachine coffeeMachine = new coffeeMachine(ingredients);
        coffeeMachine.getCoffee("espresso");
        coffeeMachine.getCoffee("mochaLatte");
        coffeeMachine.DisplayCurrentIngredients();
        coffeeMachine.addIngredient(ingredients);
    }
}