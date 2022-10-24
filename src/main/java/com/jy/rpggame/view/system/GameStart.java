package com.jy.rpggame.view.system;

import com.jy.rpggame.view.dialog.MenuDialog;
import com.jy.rpggame.view.utils.BaseView;

import java.util.Arrays;
import java.util.List;

public class GameStart extends BaseView {


    @Override
    public void display() {

        writer.print("게임을 시작합니다.....");
        MenuDialog menuDialog = new MenuDialog("시작메뉴" , Arrays.asList("게임 시작" , "게임 종료"));
        menuDialog.display();

        //Api
    }


}
