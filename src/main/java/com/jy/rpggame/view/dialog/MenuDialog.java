package com.jy.rpggame.view.dialog;

import com.jy.rpggame.view.utils.BaseView;

import java.util.List;

public class MenuDialog extends BaseView {

    private final String title;
    private final List<String> menuList;
    private Integer selectNum;

    public MenuDialog(final String title , List<String> menuList) {
        this.title = title;
        this.menuList = menuList;
    }

    @Override
    public void display() {
        writeTitle();
        int selectNum = writeMenu();
        this.selectNum = selectNum;
    }

    public void writeTitle() {
        writer.printf("==============%s==============", this.title);
    }

    public int writeMenu() {
        for(int i=0; i < this.menuList.size() ; i++) {
            writer.printf("%d. %s" , i+1 , this.menuList.get(i));
        }
        return reader.readInt();
    }

    public int getSelectNum() {
        if(this.selectNum == null) {
            return -1;
        }

        return this.selectNum;
    }
}
