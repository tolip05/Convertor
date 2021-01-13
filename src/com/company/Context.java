package com.company;

import com.company.commands.Convert;

import java.io.IOException;

public class Context {
    private Convert convert;

    public Context(Convert convert) {
        this.convert = convert;
    }

    public void execute() throws IOException {
        this.convert.convert();
    }
}
