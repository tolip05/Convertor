package com.company.io;

public class ConsoleWriter implements Write {
    @Override
    public void write(String text) {
        System.out.println(text);
    }

    @Override
    public void writeCharacter(char ch) {
        System.out.print(ch);
    }

    @Override
    public void writeNewLine() {
        System.out.println();
    }
}
