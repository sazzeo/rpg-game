package com.jy.rpggame.view.utils;

import java.util.Scanner;

public class ConsoleReader {

    private static Scanner scanner = new Scanner(System.in);
    private static ConsoleReader consoleReader;

    private ConsoleReader() {
    }

    public static ConsoleReader getInstance() {
        if(consoleReader == null) {
            consoleReader = new ConsoleReader();
        }
        return consoleReader;
    }

    public String readLine() {
        System.out.print("입력>> ");
        return scanner.nextLine();
    }

    public String read() {
        System.out.print("입력>> ");
        return scanner.next();
    }

    public int readInt() {
        System.out.print("입력>> ");
        return scanner.nextInt();
    }

}
