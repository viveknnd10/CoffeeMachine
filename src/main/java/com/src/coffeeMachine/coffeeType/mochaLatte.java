package com.src.coffeeMachine.coffeeType;

import com.src.coffeeMachine.model.Inventory;
import com.src.coffeeMachine.pojo.Ingredients;

public class mochaLatte implements coffee {
    private final Inventory inventory;
    private final Ingredients ingredients;

    mochaLatte(Inventory inventory){
        this.inventory = inventory;
        ingredients = Ingredients.builder().milk(50).water(9).sugar(10).coffee(15).build();
    }
    @Override
    public void makeCoffee() {
        if (inventory.isIngredientsAvailable(ingredients)){
            inventory.useIngredients(ingredients);
            System.out.println("mochaLatte is ready");
        } else {
            System.out.println("Ingredients are not available");
        }
    }
}
