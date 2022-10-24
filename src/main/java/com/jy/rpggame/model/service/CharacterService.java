package com.jy.rpggame.model.service;

import com.jy.rpggame.model.repository.CharacterRepository;

public class CharacterService {

    private static CharacterService characterService;

    private CharacterRepository characterRepository = CharacterRepository.getInstance();
    private CharacterService() {

    }

    public static CharacterService getInstance() {

        if(characterService == null) {
            characterService = new CharacterService();
        }
        return characterService;
    }


    public int createCharacter(String name) {
        return characterRepository.createCharacter(name);
    }





}
