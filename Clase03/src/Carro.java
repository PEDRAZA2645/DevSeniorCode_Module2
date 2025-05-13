public class Carro  implements  IVehiculo{

    @Override
    public void move() {
        System.out.println("Se mueve sobre cuatro ruedas");
    }

    @Override
    public int getSpeed() {
        return 80;
    }

    @Override
    public void chancheGear(int cambio) {
        System.out.println("Se cambio a: " + cambio + "marcha");
    }
}
