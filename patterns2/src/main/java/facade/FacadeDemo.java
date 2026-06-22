package facade;

class CPU {
    public void start() {
        System.out.println("CPU запущен");
    }
}

class RAM {
    public void load() {
        System.out.println("RAM загружена");
    }
}

class HardDrive {
    public void read() {
        System.out.println("Диск прочитан");
    }
}

class ComputerFacade {
    private CPU cpu = new CPU();
    private RAM ram = new RAM();
    private HardDrive hd = new HardDrive();

    public void startComputer() {
        cpu.start();
        ram.load();
        hd.read();
    }
}

public class FacadeDemo {
    public static void main(String[] args) {
        ComputerFacade pc = new ComputerFacade();
        pc.startComputer();
    }
}