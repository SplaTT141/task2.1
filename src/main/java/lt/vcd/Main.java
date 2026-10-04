package lt.vcd;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
            Scanner in = new Scanner(System.in);
            int firstOlympics = 1896;

            System.out.print("Iveskite metus: ");
            int year = in.nextInt();

            if (year < firstOlympics || year % 4 != 0) {
                System.out.println("Tai neolimpiniai metai");
            } else {
                System.out.print((year - firstOlympics) / 4 + 1 + " olimpines zaidynes");
            }
        }
    }
