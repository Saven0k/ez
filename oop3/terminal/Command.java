import java.lang.System;

public class Command {
    private String commandString;

    public Command(String commandString){
        this.commandString = commandString;
    }

    String menu = ("1 - Добавить льва"
            + "2 - Удалить льва"
            + "3 - Просмотр зоопарка"
            + "stop - Выйти");

    public String getCommandString() {
        return commandString;
    }

    // PrintMenu pM = new PrintMenu(menu); Если хотим вывести меню наверное надо , а
    // так вроде нет

    public boolean isCreateLion() {
        return (commandString.equals("create"));
    }

    public boolean isDeleteLion() {
        return (commandString.equals("delete"));
    }

}
