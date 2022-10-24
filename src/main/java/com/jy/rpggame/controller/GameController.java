package com.jy.rpggame.controller;

import com.jy.rpggame.common.annotation.Controller;
import com.jy.rpggame.common.annotation.RequestMapping;
import com.jy.rpggame.model.service.CharacterService;

//얘는 view 보여주기용 컨트롤러


@RequestMapping("/game")
@Controller
public class GameController {


    private CharacterService characterService = CharacterService.getInstance();

    public void startGame() {

    }


    @RequestMapping("/createCharacter")
    public int createCharacter(String name) {
        return characterService.createCharacter(name);
    }


}
