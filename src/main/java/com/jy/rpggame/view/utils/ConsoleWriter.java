package com.jy.rpggame.view.utils;

import java.util.List;
import java.util.Objects;

public class ConsoleWriter {

    private static ConsoleWriter consoleWriter;
    private ConsoleWriter() {
    }

    public static ConsoleWriter getInstance() {
        if(consoleWriter == null) {
            consoleWriter = new ConsoleWriter();
        }
        return consoleWriter;
    }

    public void print(String sentence) {
        System.out.println(sentence);
    }

    public void print(List<String> sentences) {
        for(String sentence :sentences) {
            System.out.println(sentence);
        }
    }

    public void printf(String format , Object... args) {
        System.out.println(String.format(format , args));
    }

}
