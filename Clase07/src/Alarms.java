public class Alarms {
    private String code;

    public Alarms(String newCode){
        code = newCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public class SmokeSensor{
        private String serial;
        private String location;

        public SmokeSensor(String serial, String location) {
            this.serial = serial;
            this.location = location;
        }

        public void detectsSmoke(){
            System.out.println("Smoke detected!: " + serial + " " + location);
        }

        public void triggerAlert(){
            System.out.println("Alert!");
        }
    }

}
