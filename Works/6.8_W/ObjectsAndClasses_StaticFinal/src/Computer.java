public class Computer {

    private final Processor processor;
    private final RAM ram;
    private final ROM rom;
    private final Display display;
    private final Keyboard keyboard;
    private final String vendor;
    private final String name;

    public Computer(Processor processor, RAM ram, ROM rom, Display display,
                    Keyboard keyboard, String vendor, String name) {
        this.processor = processor;
        this.ram = ram;
        this.rom = rom;
        this.display = display;
        this.keyboard = keyboard;
        this.vendor = vendor;
        this.name = name;
    }

    public Processor getProcessor() {
        return processor;
    }

    public RAM getRam() {
        return ram;
    }

    public ROM getRom() {
        return rom;
    }

    public Display getDisplay() {
        return display;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Computer setProccessor(Processor processor) {
        return new Computer(processor, ram, rom, display, keyboard, vendor, name);
    }

    public Computer setRAM(RAM ram) {
        return new Computer(processor, ram, rom, display, keyboard, vendor, name);
    }

    public Computer setROM(ROM rom) {
        return new Computer(processor, ram, rom, display, keyboard, vendor, name);
    }

    public Computer setDisplay(Display display) {
        return new Computer(processor, ram, rom, display, keyboard, vendor, name);
    }

    public Computer setKeyboard(Keyboard keyboard) {
        return new Computer(processor, ram, rom, display, keyboard, vendor, name);
    }

    public double getTotalWeight() {
        return processor.getWeight() + ram.getWeight() +
                rom.getWeight() + display.getWeight() +keyboard.getWeight();
    }

    @Override
    public String toString() {
        return "Computer: " + name
                + "\n" + "Vendor: " + vendor
                + "\n" + "Proccessor: " + processor
                + "\n" + "RAM: " + ram
                + "\n" + "ROM: " + rom
                + "\n" + "Display: " + display
                + "\n" + "Keyboard: " + keyboard;
    }
}
