package org.example.BuilderPattern;

public class Main {

    public static void main(String[] args) {

        Computer computer = new ComputerBuilder().buildProcessor("Intel").buildMemory(8).buildStorage(1024).buildGraphic("Nvedia").build();
        System.out.println(computer.getProcessor().toString());
    }
}
