package com.jy.rpggame.model.domain;

public class Character {

    private String name;
    private int level;
    private int hp;

    public Character(String name) {
        this.name = name;
        this.level =1;
        this.hp = 100;
    }
}
