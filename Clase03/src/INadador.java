public interface INadador {
    public static String estilo = "libre";
    void nadar();
    default void clavado(){
        System.out.println("Al agua!!!");
    }
    static void patear(){
        System.out.println("Patada!!!");
    }
}
