package com.lutfiadysh.animals.services.impl;

import com.lutfiadysh.animals.services.BuffaloPrinter;
import org.springframework.stereotype.Component;


public class IndonesianBuffaloPrinter implements BuffaloPrinter {
    @Override
    public String print() {
        return "Kerbau";
    }
}
