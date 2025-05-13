package composite;

public class Memory {

    private int capacity;

    public Memory(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void viewDetails(){
        System.out.println("La memoria es de: " + capacity + " GB");
    }
}
