package com.jy.rpggame.model.repository;

import com.jy.rpggame.model.domain.Character;

public class CharacterRepository {

    private static CharacterRepository characterRepository;
    private CharacterRepository() {};

    public static CharacterRepository getInstance() {
        if(characterRepository == null) {
            characterRepository = new CharacterRepository();
        }
        return characterRepository;
    }


    public int createCharacter(String name) {
        new Character(name);
        return 1;

    }
}
