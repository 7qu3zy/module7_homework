package CommandSmartHome;

public class TempIncreaseCommand implements ICommand {

    private Thermostat thermostat;

    public TempIncreaseCommand(Thermostat thermostat){
        this.thermostat = thermostat;
    }

    public void execute(){
        thermostat.increase();
    }

    public void undo(){
        thermostat.decrease();
    }
}