package com.src.coffeeMachine.model;

import com.src.coffeeMachine.pojo.Ingredients;

public class Inventory {
    private final Milk milk;
    private final CoffeePowder coffeePowder;
    private final Water water;
    private final Sugar sugar;

    public Inventory(Ingredients ingredients){
        this.milk = new Milk(ingredients.getMilk());
        this.coffeePowder = new CoffeePowder(ingredients.getCoffee());
        this.water = new Water(ingredients.getWater());
        this.sugar = new Sugar(ingredients.getSugar());
    }

    public boolean isIngredientsAvailable(Ingredients ingredients){
        return this.milk.getQuantity() >= ingredients.getMilk() &&
                this.coffeePowder.getQuantity() >= ingredients.getCoffee() &&
                this.water.getQuantity() >= ingredients.getWater() &&
                this.sugar.getQuantity() >= ingredients.getSugar();
    }

    public void useIngredients(Ingredients ingredients){
        this.milk.use(ingredients.getMilk());
        this.coffeePowder.use(ingredients.getCoffee());
        this.water.use(ingredients.getWater());
        this.sugar.use(ingredients.getSugar());
    }

    public void addIngredients(Ingredients ingredients){
        this.milk.add(ingredients.getMilk());
        this.coffeePowder.add(ingredients.getCoffee());
        this.water.add(ingredients.getWater());
        this.sugar.add(ingredients.getSugar());
    }

    public void showIngredients(){
        System.out.println("Milk: " + this.milk.getQuantity());
        System.out.println("Coffee Powder: " + this.coffeePowder.getQuantity());
        System.out.println("Water: " + this.water.getQuantity());
        System.out.println("Sugar: " + this.sugar.getQuantity());
    }
}
