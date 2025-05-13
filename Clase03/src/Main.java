import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IVehiculo> vehiculos = new ArrayList<>();
         vehiculos.add(new Moto());
        vehiculos.add(new Avion());

        for (IVehiculo vehiculo : vehiculos){
            vehiculo.move();
        }

        INadador.patear();
        Pato pato = new Pato();
        pato.nadar();
        pato.volar();
        pato.clavado();
    }
}