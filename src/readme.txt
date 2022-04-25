Write an algorithm that given a string containing any combination of the characters
'(', ')', '{', '}', '[' and ']', determines if the input string is valid.

An input string is valid when:

- Opening parentheses are closed by the same type of closing parentheses, and
- Opening parentheses are closed in the correct order.

No other characters are present in the string except those mentioned above.

Examples:

1. "()" -> true
2. "()[]{}" -> true
3. "(]" -> false
4. ")(" -> false
5. "([)]" -> false
6. "{[]}" -> true
7. ")" -> false
8. "([]" -> false
9. "{" -> false
10. "([)])" -> false
11. "(((((((((())))))))))" -> true
12. "" -> true
13. "()]]" -> false

Note that an empty string is also considered valid.
