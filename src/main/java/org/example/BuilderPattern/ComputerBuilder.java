package org.example.BuilderPattern;

public class ComputerBuilder {

    private Computer computer;

    ComputerBuilder() {
        this.computer = new Computer();
    }

    public ComputerBuilder buildProcessor(String process) {
        computer.setProcessor(process);
        return this;
    }

    public ComputerBuilder buildMemory(int memory) {
            computer.setMemory(memory);
            return this;
    }

    public ComputerBuilder buildStorage(int storage) {
        computer.setStorage(storage);
        return this;
    }

    public ComputerBuilder buildGraphic(String graphic) {
        computer.setGraphicCard(graphic);
        return this;
    }

    public Computer build() {
        return this.computer;
    }
}
