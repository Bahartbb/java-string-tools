package com.bahar;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        System.out.print("Enter a word to find: ");
        String search = scanner.nextLine();

        int index = StringTools.findIndex(text, search);
        System.out.println("Index: " + index);

        System.out.print("Enter word to replace: ");
        String target = scanner.nextLine();

        System.out.print("Enter replacement: ");
        String replacement = scanner.nextLine();

        String replaced = StringTools.replaceText(text, target, replacement);
        System.out.println("Replaced text: " + replaced);

        System.out.print("Enter start index: ");
        int start = scanner.nextInt();

        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        String sub = StringTools.getSubstring(text, start, end);
        System.out.println("Substring: " + sub);

        scanner.nextLine();

        System.out.print("Enter another text to compare: ");
        String text2 = scanner.nextLine();

        boolean equal = StringTools.isEqual(text, text2);
        System.out.println("Are equal: " + equal);
    }
}