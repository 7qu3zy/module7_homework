package CommandSmartHome;

public class Thermostat {

    private int temperature = 20;

    public void increase(){
        temperature++;
        System.out.println("Температура увеличена до " + temperature);
    }

    public void decrease(){
        temperature--;
        System.out.println("Температура уменьшена до " + temperature);
    }
}