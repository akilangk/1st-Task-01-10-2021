package DuplicateCharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharacterFinder {
    public void findAndCountDuplicateCharacters(String text) {
        Map<Character, Integer> textMap = new HashMap<>();
        char[] textArray = text.toCharArray();
        for (char character : textArray) {
            if (textMap.containsKey(character)) {
                textMap.put(character, textMap.get(character) + 1);
            } else {
                textMap.put(character, 1);
            }
        }
        System.out.println("\nDuplicate characters and its count in the given text is displayed below:\n");
        for (Map.Entry<Character, Integer> lineOfText : textMap.entrySet()) {
            if (lineOfText.getValue() > 1) {
                System.out.println("The Character '"+lineOfText.getKey() + "' is repeating " + lineOfText.getValue()+" times in the given text.");
            }
        }
    }
    public static void main(String[] args) {
        DuplicateCharacterFinder duplicateCharacter = new DuplicateCharacterFinder();
        Scanner scanner = new Scanner(System.in);
        String text;
        System.out.println("Enter the text: ");
        text = scanner.nextLine().replaceAll(" ","");
        duplicateCharacter.findAndCountDuplicateCharacters(text);
    }
}

