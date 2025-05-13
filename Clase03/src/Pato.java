public class Pato implements IVolador, INadador {
    @Override
    public void nadar() {
        System.out.println("El pato está Nadando");
    }

    @Override
    public void volar() {
        System.out.println("El pato está Volando");
    }
}
