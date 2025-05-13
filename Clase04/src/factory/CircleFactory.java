package factory;

public class CircleFactory implements Form{

    @Override
    public void draw() {
        System.out.println("drawing a circle");
    }
}
