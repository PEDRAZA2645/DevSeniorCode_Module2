package composite;

public class Computer {

    private MotherBoard motherBoard;

    public Computer() {
        this.motherBoard = new MotherBoard(1000,16, 4, 8, 64);
        motherBoard.registerHdType("SSD");
    }

    public void viewConfig(){
        System.out.println("Configuracion de la PC");
        motherBoard.getMotherBoardComponents();
    }
}
