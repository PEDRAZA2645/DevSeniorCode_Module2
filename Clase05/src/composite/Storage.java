package composite;

public class Storage {
    private int capacity;
    private String type;

    public Storage(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void viewDetails(){
        System.out.println("el almacenamiento es de: " + capacity + " GB");
        System.out.println("el almacenamiento es de tipo: " + type);
    }
}
