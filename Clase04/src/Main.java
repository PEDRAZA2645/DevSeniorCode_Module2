import factory.FactoryForm;
import factory.Form;
import factory.FormType;
import singleton.Logger;

public class Main {
    public static void main(String[] args) {
        //SINGLETON
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        System.out.println("Se imprimió el pasaporte");
        System.out.println("Se imprimió la historia clinica");

        System.out.println(logger1);
        System.out.println(logger2);
        System.out.println(logger1 == logger2);

        //FACTORY
        Form form1 = FactoryForm.getForma(FormType.CIRCLE);
        form1.draw();
        Form form2 = FactoryForm.getForma(FormType.RECTANGLE);
        form2.draw();
        Form form3 = FactoryForm.getForma(FormType.TRIANGLE);
        form3.draw();
        Form form4 = FactoryForm.getForma(FormType.CIRCLE);
        form4.draw();

        System.out.println(form1 == form4);
    }
}