import java.util.Scanner;
public class InputCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WHO KILLED GREGORI DECODER");
        boolean proceed = true;
        while (proceed) {
            System.out.println();
            System.out.println("Input Your Code Below. Enter 'N' To End The Program");
            String code = scanner.nextLine();
            if (code.toLowerCase().equals("wicor")) {
                System.out.println("Code WICOR Activated!");
                System.out.println("CLUE: Rifle Is Clean");
            }
            else if (code.toLowerCase().equals("believe")) {
                System.out.println("Code BELIEVE Activated!");
                System.out.println("CLUE: Bilaal Is Clean");
                System.out.println("Continue To This Video: https://youtube.com/shorts/YU1EIphtLkE");
            }
            else if (code.toLowerCase().equals("n")) {
                System.exit(0);
            }
            else if (code.toLowerCase().equals("3bf27c")) {
                System.out.println("Code 3BF27C Activated!");
                System.out.println("CLUE: Baseball Bat Is Clean");
            }
            else {
                System.out.println("CODE UNRECOGNIZED");
            }
        }
    }
}
