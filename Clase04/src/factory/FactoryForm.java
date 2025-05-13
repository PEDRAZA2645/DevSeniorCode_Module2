package factory;

public class FactoryForm {
    public static Form getForma(FormType type){
        switch (type){
            case CIRCLE:
                return new CircleFactory();
            case RECTANGLE:
                return new RentangleFactory();
            case TRIANGLE:
                return new TriangleFactory();
            default:
                throw new IllegalArgumentException("unknown form type");
        }
    }
}
