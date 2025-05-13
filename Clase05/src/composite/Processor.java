package composite;

public class Processor {

    private int capacity;
    private int core;

    public Processor(int capacity, int core) {
        this.capacity = capacity;
        this.core = core;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCore() {
        return core;
    }

    public void setCore(int core) {
        this.core = core;
    }

    public void viewDetails(){
        System.out.println("El Procesador es de: " + capacity + " GHz y tiene " + core + " nucleos");
    }
}
