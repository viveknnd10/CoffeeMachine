package com.src.coffeeMachine.pojo;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class Ingredients {
    private int milk;
    private int coffee;
    private int water;
    private int sugar;
}
