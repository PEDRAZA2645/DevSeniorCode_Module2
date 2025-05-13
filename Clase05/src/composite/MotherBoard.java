package composite;

public class MotherBoard {

    private Processor processor;
    private Memory memory;
    private Storage storage;
    private Graphic graphic;

    public MotherBoard(int storage,  int memory, int processorCapacity, int processorCore, int graphic) {
        this.processor = new Processor(processorCapacity, processorCore);
        this.memory = new Memory(memory);
        this.storage = new Storage(storage);
        this.graphic = new Graphic(graphic);
    }
    public void registerHdType(String type) {
        this.storage.setType(type);
    }
    public void getMotherBoardComponents(){
        System.out.println("Componentes de la tarjeta");
        storage.viewDetails();
        memory.viewDetails();
        processor.viewDetails();
        graphic.viewDetails();
    }
}
