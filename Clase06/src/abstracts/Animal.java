package abstracts;

abstract class Animal {
    private String raza;

    abstract void hacerSonido();
    void dormir(){
        System.out.println("Roncando......ZzzZ" + raza);
    }
}
