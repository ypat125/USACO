package USACO_Training.your_ride_is_here;

/*
ID: yash.s.1
LANG: JAVA
TASK: ride
*/

import java.io.*;
import java.util.Scanner;

public class ride {

    public static void main (String args[]) throws IOException {

        Scanner scanner = new Scanner(new File("ride.in"));

        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        String ufoName = scanner.next();
        String groupName = scanner.next();

        int ufoProduct = 1;
        int groupProduct = 1;

        for (int i = 0; i < ufoName.length(); i++) {
            for (int x = 0; x < alphabet.length; x++){
               if (alphabet[x] == ufoName.charAt(i)) {
                   ufoProduct *= (x+1);
               }
            }
        }

        for (int i = 0; i < groupName.length(); i++) {
            for (int x = 0; x < alphabet.length; x++){
                if (alphabet[x] == groupName.charAt(i)) {
                    groupProduct *= (x+1);
                }
            }
        }

        PrintWriter printWriter = new PrintWriter(new FileWriter("ride.out"));

        if (ufoProduct % 47 == groupProduct % 47) {
            printWriter.println("GO");
        } else {
            printWriter.println("STAY");
        }

        printWriter.close();

    }

}
