package 设计模式.外观模式;//  Lvcang created at  2018-03-27 22:25,have fun~


import 设计模式.外观模式.SubSystem.CPU;
import 设计模式.外观模式.SubSystem.Disk;
import 设计模式.外观模式.SubSystem.Memory;
import 设计模式.外观模式.SubSystem.Power;

// computer 就是外观：CPU、Memory、Disk、Power的集合
public class Computer
{
    private Power power;
    private Memory memory;
    private Disk disk;
    private CPU cpu;

    public Computer()
    {
        power = new Power();
        cpu = new CPU();
        disk = new Disk();
        memory = new Memory();
    }

    // 下面提供简单的、统一的功能
    public void startComputer()
    {
        this.power.start();
        this.cpu.begin();
        this.disk.start();
        this.memory.start();
        System.out.println("电脑开机完成");
    }

    public void shutDownComputer()
    {
        this.power.turnOff();
        this.cpu.turnOff();
        this.disk.shutDown();
        this.memory.turnOff();
        System.out.println("电脑已经关机");
    }
}
