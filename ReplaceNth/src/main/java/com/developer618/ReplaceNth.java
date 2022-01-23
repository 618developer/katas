package com.developer618;

public class ReplaceNth {

    public static String replaceNth(String text, int n, char oldValue, char newValue) {
        int occurrences = 0;
        StringBuilder updatedText = new StringBuilder();
        for (char charInString :
                text.toCharArray()) {
            if (oldValue == charInString) {
                occurrences++;
                if(occurrences % n == 0) {
                    charInString = newValue;
                }
            }
            updatedText.append(charInString);
        }
        return updatedText.toString();
    }
}
