import java.util.List;

public class ZooCommandParser implements CommandParser {

    @Override
    public Command parseCommmand(String inputCommand) {
        String[] commandString = inputCommand.split("\\s+");
        System.out.println(commandString.length);
        if(commandString.length > 1){
            return new Command(commandString[0]);  
        }
        else if (commandString.length == 1){    
            return new Command(commandString[0]);
        }
        return null;
    }

}