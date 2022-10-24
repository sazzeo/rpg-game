package com.jy.rpggame.view.utils;

import java.util.Scanner;

public abstract class BaseView {

    protected ConsoleWriter writer = ConsoleWriter.getInstance();
    protected ConsoleReader reader = ConsoleReader.getInstance();

    public abstract void display();


}
