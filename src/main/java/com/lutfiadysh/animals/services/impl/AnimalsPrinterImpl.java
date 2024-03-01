package com.lutfiadysh.animals.services.impl;

import com.lutfiadysh.animals.services.AnimalsPrinter;
import com.lutfiadysh.animals.services.BuffaloPrinter;
import com.lutfiadysh.animals.services.RhinoPrinter;
import com.lutfiadysh.animals.services.ZebraPrinter;
import org.springframework.stereotype.Component;

@Component
public class AnimalsPrinterImpl implements AnimalsPrinter {
    private BuffaloPrinter buffaloPrinter;
    private RhinoPrinter rhinoPrinter;
    private ZebraPrinter zebraPrinter;

    public AnimalsPrinterImpl(BuffaloPrinter buffaloPrinter,RhinoPrinter rhinoPrinter, ZebraPrinter zebraPrinter) {
        this.buffaloPrinter = buffaloPrinter;
        this.rhinoPrinter = rhinoPrinter;
        this.zebraPrinter = zebraPrinter;
    }

    @Override
    public String print() {return String.join(", ", buffaloPrinter.print(), rhinoPrinter.print(), zebraPrinter.print());}
}
