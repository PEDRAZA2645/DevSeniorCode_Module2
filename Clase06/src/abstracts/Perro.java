package abstracts;

public class Perro extends Animal{

    @Override
    void hacerSonido() {
        System.out.println("Ladrar!!!");
    }
    void rascarse(){
        System.out.println("Se rasca!!");
    }
}
