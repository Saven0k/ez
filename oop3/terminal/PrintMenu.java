import java.util.Scanner;
public class PrintMenu {
    // Single Responsbility Principle
    private String menu;
    public Scanner iScanner = new Scanner(System.in);
    private int Variant;

    public PrintMenu(String menu) {
        this.menu = menu;
        System.out.print(this.menu);
        this.Variant  = iScanner.nextInt();

        returnVariant();
        
    }
    public int returnVariant(){
        return this.Variant;
    }
}
