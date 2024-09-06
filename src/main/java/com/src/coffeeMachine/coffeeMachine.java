package com.src.coffeeMachine;

import com.src.coffeeMachine.coffeeType.coffee;
import com.src.coffeeMachine.coffeeType.coffeeMachineFactoryImpl;
import com.src.coffeeMachine.model.Inventory;
import com.src.coffeeMachine.pojo.Ingredients;

public class coffeeMachine {
    private final Inventory inventory;
    private final coffeeMachineFactoryImpl coffeeMachineFactory;
    public coffeeMachine(Ingredients ingredients) {
        inventory = new Inventory(ingredients);
        coffeeMachineFactory = new coffeeMachineFactoryImpl(inventory);
    }

    public void DisplayCurrentIngredients(){
        inventory.showIngredients();
    }

    public void getCoffee(String type){
        coffee current = coffeeMachineFactory.coffeeMachineFactory(type);
        current.makeCoffee();
    }

    public void addIngredient(Ingredients ingredients){
        inventory.addIngredients(ingredients);
    }
}
