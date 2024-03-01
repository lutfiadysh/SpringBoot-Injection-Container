package com.lutfiadysh.animals.services.impl;

import com.lutfiadysh.animals.services.ZebraPrinter;
import org.springframework.stereotype.Component;

@Component
public class IndonesianZebraPrinter implements ZebraPrinter {
    @Override
    public String print() {
        return "Zebra";
    }
}
