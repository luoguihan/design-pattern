package com.meteor.design.pattern.struction.facade;

/**
 * @author: luoguihan
 * @date: 2019/2/24
 * @version: 1.0
 */
public class Computer {

    private CPU cpu;
    private Disk disk;
    private Memory memory;

    public Computer() {
        cpu = new CPU();
        disk = new Disk();
        memory = new Memory();
    }

    public void start() {
        System.out.println("computer is starting");
        cpu.start();
        disk.start();
        memory.start();
    }

    public void stop() {
        System.out.println("computer is stopping");
        cpu.stop();
        disk.stop();
        memory.stop();
    }
}
