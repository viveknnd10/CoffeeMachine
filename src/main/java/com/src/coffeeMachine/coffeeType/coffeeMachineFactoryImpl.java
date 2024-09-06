package com.src.coffeeMachine.coffeeType;

import com.src.coffeeMachine.model.Inventory;

public class coffeeMachineFactoryImpl {
    private final Inventory inventory;
    public coffeeMachineFactoryImpl(Inventory inventory){
        this.inventory = inventory;
    }
    public coffee coffeeMachineFactory(String type){
        return switch (type) {
            case "espresso" -> new Espresso(inventory);
            case "mochaLatte" -> new mochaLatte(inventory);
            default -> throw new IllegalArgumentException("the coffee type is not supported");
        };
    } 
}
