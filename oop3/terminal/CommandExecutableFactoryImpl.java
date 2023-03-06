public class CommandExecutableFactoryImpl implements CommandExecutableFactory {

    public CommandExecutableFactoryImpl(Zoo zoo) {
    }

    public CommandExecutable create(Command command, Zoo zoo) {
        if (command.equals("DeleteLion")) {
            return new DeleteLionExecutable(zoo);
        }

        else if (command.equals("CreateLion")) {
            Lion lion = new Lion(15 , 5 ,1511 , 12);
            return new CreateLionExecutable(lion);
        }

        return null;
    }
}
