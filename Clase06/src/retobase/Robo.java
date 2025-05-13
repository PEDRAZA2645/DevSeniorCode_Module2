package retobase;

public class Robo extends Emergencia implements Responder{
    public Robo(String tipo, String ubicacion, int nivelGravedad, int tiempoRespuesta) {
        super(tipo, ubicacion, nivelGravedad, tiempoRespuesta);
    }

    @Override
    public void atenderEmergencia() {
        System.out.println("Patrulla en camino");
    }

    @Override
    public void evaluarEstado() {
        System.out.println("Patrulla en combate");
    }
}
