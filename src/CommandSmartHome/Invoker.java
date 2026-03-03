package CommandSmartHome;

import java.util.Stack;

public class Invoker {

    private Stack<ICommand> history = new Stack<>();

    public void executeCommand(ICommand command){

        if(command == null){
            System.out.println("Команда не назначена");
            return;
        }

        command.execute();
        history.push(command);
    }

    public void undo(){

        if(history.isEmpty()){
            System.out.println("Нет команд для отмены");
            return;
        }

        ICommand last = history.pop();
        last.undo();
    }
}