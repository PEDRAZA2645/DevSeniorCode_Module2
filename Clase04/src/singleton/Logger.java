package singleton;

public class Logger {
    private static Logger instancia;
    private Logger(){

    }

    public  static  Logger getInstance(){
        if (instancia == null)
            instancia = new Logger();
        return instancia;
    }
    private void log(String mesage){

    }
}
