package com.jy.rpggame.controller;

import com.jy.rpggame.common.annotation.Controller;
import com.jy.rpggame.view.system.GameStart;

@Controller
public class ViewController {


    public void gameStart() {
        new GameStart().display();
    }
}
