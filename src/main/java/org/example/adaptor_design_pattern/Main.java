package org.example.adaptor_design_pattern;

public class Main {
    public static void main(String[] args) {
        WeightMachineAdaptor machineAdaptorObj=new WeightMachineAdaptorImpl(new WeightMachineImpl());
        System.out.println("Weight Machine : "+machineAdaptorObj.getWeightInKg());
    }
}
