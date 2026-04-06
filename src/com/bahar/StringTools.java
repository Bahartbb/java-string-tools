package com.bahar;

public class StringTools {

    public static int findIndex(String text, String search) {
        return text.indexOf(search);
    }

    public static String replaceText(String text, String target, String replacement) {
        return text.replace(target, replacement);
    }

    public static String getSubstring(String text, int start, int end) {
        return text.substring(start, end);
    }

    public static boolean isEqual(String text1, String text2) {
        return text1.equals(text2);
    }
}