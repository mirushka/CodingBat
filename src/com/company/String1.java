package com.company;

public class String1 {


    public static void main(String[] args) {
        // write your code here

    }

    // String-1 > helloName
    // Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    // String-1 > makeAbba
    // Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    // String-1 > makeTags
    // The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
    // Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";

    }

    // String-1 > makeOutWord
    // Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>".
    // Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2);
    }

    // String-1 > extraEnd
    // Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
    public String extraEnd(String str) {
        String modif = str.length() > 2 ? str.substring(str.length() - 2) : str;
        return modif + modif + modif;
    }

    /* String-1 > firstTwo
    Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.
    firstTwo("Hello") → "He"
    firstTwo("abcdefg") → "ab"*/
    public String firstTwo(String str) {
        String modif = str.length() >= 2 ? str.substring(0, 2) : str;
        return modif;
    }

    /*String-1 > firstHalf
    Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
    firstHalf("WooHoo") → "Woo"  */
    public String firstHalf(String str) {
        String modif = str.substring(0, str.length() / 2);
        return modif;
    }

    /* String-1 > withoutEnd
    Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.
    withoutEnd("Hello") → "ell"      */
    public String withoutEnd(String str) {
        String modif = str.substring(1, str.length() - 1);
        return modif;
    }

}