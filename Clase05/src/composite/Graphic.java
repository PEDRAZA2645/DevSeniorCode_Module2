package composite;

public class Graphic {
    private int capacity;

    public Graphic(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void viewDetails(){
        System.out.println("La Grafica es de: " + capacity + " GB");
    }
}
