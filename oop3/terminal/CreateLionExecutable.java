public class CreateLionExecutable implements CommandExecutable {
    private Zoo zoo;
    private Lion lion;
    

    public CreateLionExecutable(Lion lion) {
        this.lion = lion;
        execute();
        
    }

    @Override
    public void execute() {
        zoo.CreateLionOutCage(lion);
    }

}
