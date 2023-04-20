package view;
import java.util.Scanner;

public class MainPanel {

    public MainPanel() {
    }
    

    public void startIndex() {
        double Index = this.bekerDatas();
        //nyomtat(Index);
        double Index2 = this.bekerDatas2();
        //nyomtat2(Index2);
    }

    private void nyomtat(double magassag) {
        System.out.println(magassag);
    }
    private void nyomtat2(double tomeg) {
        System.out.println(tomeg);
    }
    private double bekerDatas() {
        String magassagStr = beker("Magasság: ");
        double magassag = Double.parseDouble(magassagStr);
        return magassag;
    }
    private double bekerDatas2() {
        String tomegStr = beker("Tömeg: ");
        double tomeg = Double.parseDouble(tomegStr);
        return tomeg;
    }

    private String beker(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg);
        return scanner.nextLine();
    }
    public boolean checkInput(String input) {
        if(input.matches("[0-9.]+")) {
            return true;
        }else {
            return false;
        }  
    }      

}

    





//input/output