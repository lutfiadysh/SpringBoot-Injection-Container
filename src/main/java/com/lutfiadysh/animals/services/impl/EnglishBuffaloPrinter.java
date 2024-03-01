package com.lutfiadysh.animals.services.impl;

import com.lutfiadysh.animals.services.AnimalsPrinter;
import com.lutfiadysh.animals.services.BuffaloPrinter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class EnglishBuffaloPrinter implements BuffaloPrinter {
    @Override
    public String print() {
        return "Buffalo";
    }
}
