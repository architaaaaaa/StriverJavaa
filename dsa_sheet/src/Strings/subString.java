package Strings;
import java.util.*;
public class subString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the strings separated by commas: ");
        String input = scanner.nextLine();
            // Split the input string by commas and trim each part
        String[] strings = input.split("");
        List<String> substrings = new ArrayList<>();

            for (int i = 0; i < strings.length; i++) {
                String current = strings[i];

                for (int j = 0; j < strings.length; j++) {
                    boolean isSubstring = false;
                    if (i != j && strings[j].contains(current)) {
                        isSubstring = true;
                        break;
                    }
                }
                if (substrings.isEmpty()) {
                    substrings.add(current);
                }
            }
            System.out.println(substrings);
        }
}
