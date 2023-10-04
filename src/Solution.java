//import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String mockInput = "5\n" +
                            "12 0 1 78 12\n" +
                            "2\n" +
                            "Insert\n" +
                            "5 23\n" +
                            "Delete\n" +
                            "0" ;
        Scanner scanner = new Scanner(mockInput);
        int N = scanner.nextInt();
        List <Integer> L = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int value = scanner.nextInt();
            L.add(value);
        }
        //System.out.println(L);
        int Q = scanner.nextInt();
        for (int j = 0; j < Q; j++) {
            scanner.nextLine();
            String command = scanner.nextLine();
            if (command.equals("Insert")) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                L.add(x, y);
            }
            if (command.equals("Delete")) {
                int x = scanner.nextInt();
                L.remove(x);
            }
        }
        //System.out.println(L);
        for (int element : L) {
            System.out.print(element + " ");
        }
        scanner.close();
    }
}
