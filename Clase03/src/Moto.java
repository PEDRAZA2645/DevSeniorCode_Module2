public class Moto implements IVehiculo{
    @Override
    public void move() {
        System.out.println("Se mueve sobre dos ruedas");
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public void chancheGear(int cambio) {
        System.out.println("Se cambio a: " + cambio + "marcha");
    }

    public void doAWheelie(){

    }
}
