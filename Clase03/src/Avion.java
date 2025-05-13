public class Avion implements IVehiculo{
    @Override
    public void move() {

        System.out.println("Se mueve en el aire");//metodo abstracto
    }

    @Override
    public int getSpeed() {
        return 700;
    }

    @Override
    public void chancheGear(int cambio) {
        System.out.println("Se cambio a: " + cambio + "marcha");
    }
}
