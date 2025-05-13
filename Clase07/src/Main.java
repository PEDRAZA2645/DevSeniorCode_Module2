import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
// Clases internas
        Alarms alarm1 = new Alarms("QWERTY123");
        alarm1.getCode();

        Alarms.SmokeSensor kitchenSensor = alarm1.new SmokeSensor("12qasw", "first flooor");
        Alarms.SmokeSensor livingRoomSensor = alarm1.new SmokeSensor("12qasw", "first flooor");

        kitchenSensor.detectsSmoke();
        livingRoomSensor.triggerAlert();
// Clases anónimas
        INotification emailNotification = new INotification() {
            @Override
            public void send(String message) {
                System.out.println("Email sending: " + message);
            }
        };

        emailNotification.send("Meeting for tomorrow");

        Timer timer = new Timer();

////        forma uno
//        TimerTask myTimer = new TimerTask() {
//            private int counter = 0;
//            private final String mesage = "You can do it, keep studying programming";
//
//            @Override
//            public void run(){
//                System.out.println(mesage);
//                if (counter ==5 ) timer.cancel();
//            }
//        };
//        timer.schedule(myTimer, 0, 2000);
//        forma dos
        timer.schedule(new TimerTask() {
            private int counter = 0;
            private final String mesage = "You can do it, keep studying programming";

            @Override
            public void run(){
                System.out.println(mesage);
                if (counter ==5 ) timer.cancel();
            }
        }, 0, 2000);

//       Lambda Expresions, it only works when there is only one abstract method in the interface.

        IOperation addition = (x, y) -> x + y;
        addition.execute(10, 8);

        Addition additionClass = new Addition();
        additionClass.execute(10, 8);

        List<String> words = new ArrayList<>();

        words.add("Hello");
        words.add("¿How are you?");
        words.add("Bye");

        List<String> filtradas = words.stream().filter(palabra -> palabra.endsWith("?"))
                .collect(Collectors.toList());
    }
}