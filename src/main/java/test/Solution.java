package test;

//Write an algorithm that given a string containing any combination of the characters
//      '(', ')', '{', '}', '[' and ']', determines if the input string is valid.
//
//      An input string is valid when:
//
//      - Opening parentheses are closed by the same type of closing parentheses, and
//      - Opening parentheses are closed in the correct order.
//
//      No other characters are present in the string except those mentioned above.
//
//      Examples:
//
//      1. "()" -> true
//      2. "()[]{}" -> true
//      3. "(]" -> false
//      4. ")(" -> false
//      5. "([)]" -> false
//      6. "{[]}" -> true
//      7. ")" -> false
//      8. "([]" -> false
//      9. "{" -> false
//      10. "([)])" -> false
//      11. "(((((((((())))))))))" -> true
//      12. "" -> true
//      13. "()]]" -> false

import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class Solution {

    private static final Map<Character, Character> PAIRS = Map.of('(', ')', '[', ']', '{', '}');

    private static final Set<Character> CLOSING = Set.of(')', ']', '}');

    public static boolean isCorrect(String input) {
        var stack = new LinkedList<Character>();
        if (input == null) {
            return false;
        }
        if (input.isBlank()) {
            return true;
        }
        for (Character character : input.toCharArray()) {
            if (stack.isEmpty() && isClosing(character)) {
                return false;
            } else if (!isClosing(character)) {
                stack.push(character);
            } else if (matchesPair(stack.pop(), character)) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    private static boolean matchesPair(char characterA, char characterB) {
        return PAIRS.get(characterA) != characterB;
    }

    private static boolean isClosing(char character) {
        return CLOSING.contains(character);
    }
}
