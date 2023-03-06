import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.SysexMessage;
import javax.sound.sampled.AudioFormat.Encoding;

public class TerminalReader {

    private static TerminalReader tR;
    private CommandParser comP;
    public Scanner iScanner = new Scanner(System.in);
    private Zoo zoo;
    private static CommandExecutableFactory execFactory;

    private TerminalReader(CommandParser comP, CommandExecutableFactory execFactory) {
        this.comP = comP;
        this.execFactory = execFactory;
    }

    public static TerminalReader newTR(CommandParser comP) {
        if (tR == null) {
            tR = new TerminalReader(comP, execFactory);
        }
        return tR;

    }

    void endless() {
        Scanner iScanner = new Scanner(System.in);
        while (true) {
            String[] input = iScanner.nextLine().split(" ");
            if (input.equals("enough"))
                iScanner.close();
            CommandExecutable CE = new CommandExecutable() {
                @Override
                public void execute() {
                }
            };
        }
    }

    public String loopScan() {

        String command;

        while (true) {
            command = iScanner.next();
            Command newCom = this.comP.parseCommmand(command);
            CommandExecutable newExec = this.execFactory.create(newCom, this.zoo);
            newExec.execute();
            
        }
    }

}