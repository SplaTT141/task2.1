package lt.vcd;
import java.util.Scanner;

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
