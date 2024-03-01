//package com.lutfiadysh.animals.configremove;
//
//import com.lutfiadysh.animals.services.AnimalsPrinter;
//import com.lutfiadysh.animals.services.BuffaloPrinter;
//import com.lutfiadysh.animals.services.RhinoPrinter;
//import com.lutfiadysh.animals.services.ZebraPrinter;
//import com.lutfiadysh.animals.services.impl.*;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class PrinterConfig {
//    @Bean
//    public BuffaloPrinter buffaloPrinter() {
//        return new IndonesianBuffaloPrinter();
//    }
//
//    @Bean
//    public RhinoPrinter rhinoPrinter() {
//        return new IndonesianRhinoPrinter();
//    }
//
//    @Bean
//    public ZebraPrinter zebraPrinter() {
//        return new IndonesianZebraPrinter();
//    }
//
//    @Bean
//    public AnimalsPrinter animalsPrinter(BuffaloPrinter buffaloPrinter,RhinoPrinter rhinoPrinter,ZebraPrinter zebraPrinter) {
//        return new AnimalsPrinterImpl(buffaloPrinter,rhinoPrinter,zebraPrinter);
//    }
//}
