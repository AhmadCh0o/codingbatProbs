// Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.

public String lastChars(String a, String b) {

    char firstChar = (a.length() > 0) ? a.charAt(0) : '@';
    char lastChar = (b.length() > 0) ? b.charAt(b.length() - 1) : '@';

    return String.valueOf(firstChar) + String.valueOf(lastChar);

}
