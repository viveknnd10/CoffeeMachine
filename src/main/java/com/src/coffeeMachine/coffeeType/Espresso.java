package com.src.coffeeMachine.coffeeType;

import com.src.coffeeMachine.model.Inventory;
import com.src.coffeeMachine.pojo.Ingredients;

public class Espresso implements coffee {
    private final Inventory inventory;
    private final Ingredients ingredients;

    Espresso(Inventory inventory){
        this.inventory = inventory;
        ingredients = Ingredients.builder().milk(50).sugar(10).water(15).sugar(8).build();
    }
    @Override
    public void makeCoffee() {
        if (inventory.isIngredientsAvailable(ingredients)){
            inventory.useIngredients(ingredients);
            System.out.println("Espresso is ready");
        } else {
            System.out.println("Ingredients are not available");
        }
    }
}
