package org.example.chain_of_responsibility_design_pattern;

public class DebugLogProcessor extends LogProcessor{
    DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int logLevel,String message){
        if(logLevel == DEBUG){
            System.out.println("DEBUG : "+message);
        }else{
            super.log(logLevel,message);
        }
    }
}
