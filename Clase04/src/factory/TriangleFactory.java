package factory;

public class TriangleFactory implements Form{
    @Override
    public void draw() {
        System.out.println("drawing a triangle");
    }
}
