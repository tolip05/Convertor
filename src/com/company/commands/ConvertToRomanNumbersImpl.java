package com.company.commands;

import com.company.io.Reader;
import com.company.io.Write;

import java.io.IOException;

public class ConvertToRomanNumbersImpl implements Convert {
    private static final String ENTER_NUMBER = "Enter number between 1 and 3999";
    private static final String ERROR_MESSAGE = "The value is not correct!!!";
    private static final Integer UPPER_BOUND = 3999;
    private static final Integer THOUSAND = 1000;
    private static final Integer HOUNDRED = 100;
    private static final Integer TEN = 10;
    private static final String[] UNITS =
            {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    private static final String[] DOZENS = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private static final String[] HUNDREDS = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    private static final String[] THOUSANDS = {"", "M", "MM", "MMM"};
    private Write write;
    private Reader reader;
    private StringBuilder stringBuilder;

    public ConvertToRomanNumbersImpl(Write write, Reader reader) {
        this.write = write;
        this.reader = reader;
        this.stringBuilder = new StringBuilder();
    }

    @Override
    public void convert() throws IOException {
        this.write.write(ENTER_NUMBER);
        int numberToConvert = Integer.parseInt(this.reader.read());
        if (numberToConvert < 1 || numberToConvert > UPPER_BOUND) {
            this.write.write(ERROR_MESSAGE);
            return;
        }
        this.stringBuilder.append(numberToConvert + " -> ");
        this.stringBuilder.append(THOUSANDS[numberToConvert / THOUSAND]);
        this.stringBuilder.append(HUNDREDS[(numberToConvert / HOUNDRED) % TEN]);
        this.stringBuilder.append(DOZENS[(numberToConvert/TEN) % TEN]);
        this.stringBuilder.append(UNITS[numberToConvert % TEN]);
        this.write.write(this.stringBuilder.toString());
    }
}
