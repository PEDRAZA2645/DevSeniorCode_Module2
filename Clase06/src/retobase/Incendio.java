package retobase;

public class Incendio extends Emergencia implements Responder{
    public Incendio(String tipo, String ubicacion, int nivelGravedad, int tiempoRespuesta) {
        super(tipo, ubicacion, nivelGravedad, tiempoRespuesta);
    }

    @Override
    public void atenderEmergencia() {
        System.out.println("Escuadron en camino");
    }

    @Override
    public void evaluarEstado() {
        System.out.println("Combatiendo el incendio");
    }
}
