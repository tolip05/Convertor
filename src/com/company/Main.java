package com.company;

import com.company.commands.ConvertToRomanNumbers;
import com.company.commands.ConvertToRomanNumbersImpl;
import com.company.io.ConsoleReader;
import com.company.io.ConsoleWriter;
import com.company.io.Reader;
import com.company.io.Write;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Write write = new ConsoleWriter();
        Reader reader = new ConsoleReader();
        ConvertToRomanNumbers convertToRomanNumbers =
                new ConvertToRomanNumbersImpl(write,reader);
        convertToRomanNumbers.convert();
    }
}
