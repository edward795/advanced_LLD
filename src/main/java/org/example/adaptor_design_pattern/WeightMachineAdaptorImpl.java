package org.example.adaptor_design_pattern;

public class WeightMachineAdaptorImpl implements WeightMachineAdaptor{

   WeightMachine machine;
    public WeightMachineAdaptorImpl(WeightMachine weightMachine) {
       this.machine=weightMachine;
    }

    @Override
    public int getWeightInKg() {
        int weightInPound= machine.getWeightInPounds();
        return (int) (weightInPound*.45);
    }
}
