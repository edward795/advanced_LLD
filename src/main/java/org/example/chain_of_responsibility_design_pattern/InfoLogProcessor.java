package org.example.chain_of_responsibility_design_pattern;

public class InfoLogProcessor extends LogProcessor{
    InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }
    public void log(int logLevel,String messsage){
        if(logLevel == INFO){
            System.out.println("INFO : "+messsage);
        }else{
            super.log(logLevel,messsage);
        }
    }
}
