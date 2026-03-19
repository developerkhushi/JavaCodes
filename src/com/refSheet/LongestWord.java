/*
"Given a dictionary (list of words) and a substring, you have to return the length of the longest word in the dictinary containing the substring.

Example:
String[] dict = {""CODGE"", ""ODG"", ""LODGES"", ""SODG"", ""dodge"", ""mODJ"", ""LODGESSSS""}
String toSearch = ""ODG"";

//Returns 9 (LODGESSSS)"
* */

package com.refSheet;

public class LongestWord {
    public static void main(String[] args) {
        String[] dict = new String[]{"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
        String toSearch = "ODG";

        int max = 0;
        for (String word : dict) {
            if (word.contains(toSearch)) {
                max = Math.max(max, word.length());
            }
        }
        System.out.print(max);
    }
}
