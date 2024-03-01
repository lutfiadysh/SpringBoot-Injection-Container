package com.lutfiadysh.animals.services.impl;

import com.lutfiadysh.animals.services.RhinoPrinter;
import org.springframework.stereotype.Component;

@Component
public class IndonesianRhinoPrinter implements RhinoPrinter {
    @Override
    public String print() {
        return "Badak";
    }
}
