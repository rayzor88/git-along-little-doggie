import static java.lang.System.out;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ShowGuests {

    public static void main(String args[]) throws FileNotFoundException {
        int guests[][] = new int[5][10];
        Scanner myScanner = new Scanner(new File("GuestList"));

        for (int floor = 0; floor < 5; floor++) {
            for (int roomNum = 0; roomNum < 10; roomNum++) {
                guests[floor][roomNum] = myScanner.nextInt();
            }
        }

        for (int floor = 4; floor >= 0; floor--) {
            out.print("Floor " + floor + ":");
            for (int roomNum = 0; roomNum < 10; roomNum++) {
                out.print("   ");
                out.print(guests[floor][roomNum]);
            }
            out.println();
        }

        out.println();
        out.print("Room:   ");
        for (int roomNum = 0; roomNum < 10; roomNum++) {
            out.print("   ");
            out.print(roomNum);
        }
    }
}
