package org.example.AdapterDesign.Adapter;

import org.example.AdapterDesign.Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{

    WeightMachine weightMachine;
    public WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }
    @Override
    public double getWeightInKg() {
        double weightInPound = weightMachine.getWeightInPound();
        double weightInKg = weightInPound*0.45;
        return weightInKg;
    }
}
