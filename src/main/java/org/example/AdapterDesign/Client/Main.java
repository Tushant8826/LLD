package org.example.AdapterDesign.Client;

import org.example.AdapterDesign.Adaptee.WeightMachine;
import org.example.AdapterDesign.Adaptee.WeightMachineForBabies;
import org.example.AdapterDesign.Adapter.WeightMachineAdapter;
import org.example.AdapterDesign.Adapter.WeightMachineAdapterImpl;

public class Main {
    public static void main(String[] args) {
        WeightMachine weightMachine = new WeightMachineForBabies();
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(weightMachine);
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
