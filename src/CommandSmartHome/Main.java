package CommandSmartHome;

public class Main {

    public static void main(String[] args){

        Light light = new Light();
        Door door = new Door();
        Thermostat thermostat = new Thermostat();

        Invoker invoker = new Invoker();

        invoker.executeCommand(new LightOnCommand(light));
        invoker.executeCommand(new DoorOpenCommand(door));
        invoker.executeCommand(new TempIncreaseCommand(thermostat));

        System.out.println("\nОтмена:");
        invoker.undo();
        invoker.undo();
    }
}