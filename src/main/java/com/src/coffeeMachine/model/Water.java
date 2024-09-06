package com.src.coffeeMachine.model;

import lombok.Getter;

public class Water {
    private final int max_Quantity = 1500;
    @Getter
    private int Quantity;
    Water(int quantity){
        if(quantity > max_Quantity){
            throw new IllegalArgumentException("Quantity cannot be more than " + max_Quantity);
        }
        this.Quantity = quantity;
    }

    public void use(int amount){
        if(amount > Quantity){
            throw new IllegalArgumentException("Not enough milk in the container");
        }
        Quantity -= amount;
    }

    public void add(int amount){
        if(amount + Quantity > max_Quantity){
            throw new IllegalArgumentException("Cannot add more than " + max_Quantity + " milliliters");
        }
        Quantity += amount;
    }
}

