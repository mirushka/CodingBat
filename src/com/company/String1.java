package com.company;

public class String1 {


    public static void main(String[] args) {
        // write your code here

    }

    // String-1 > helloName
    // Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
    public static String helloName(String name) {
        return "Hello " + name + "!";
    }


    // String-1 > makeAbba
    // Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
    public static String makeAbba(String a, String b) {
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

    /* String-1 > comboString
    Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).
    comboString("Hello", "hi") → "hiHellohi"
    comboString("hi", "Hello") → "hiHellohi"     */
    public String comboString(String a, String b) {
        if (a.length() > b.length()) {
            return b + a + b;
        } else {
            return a + b + a;
        }
    }

    /* String-1 > nonStart
    Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.
    nonStart("Hello", "There") → "ellohere"  */
    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    /* String-1 > left2
    Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.
    left2("Hello") → "lloHe"    */
    public String left2(String str) {
        if (str.length() > 2) {
            return str.substring(2) + str.substring(0, 2);
        } else {
            return str;
        }
    }

    /* String-1 > right2
    Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.
    right2("Hello") → "loHel"   */
    public String right2(String str) {
        int len = str.length() - 2;
        return str.substring(str.length() - 2) + str.substring(0, len);
    }

    /* String-1 > theEnd
    Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.
    theEnd("Hello", true) → "H"   */
    public String theEnd(String str, boolean front) {
        if (front == true) {
            return str.substring(0, 1);
        } else {
            return (str.substring(str.length() - 1));
        }
    }

    /* String-1 > withouEnd2
    Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.
    withouEnd2("Hello") → "ell"    */
    public String withouEnd2(String str) {
        if (str.length() > 2) {
            return str.substring(1, str.length() - 1);
        }
        return "";
    }

    /* nTwice
    Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.
    nTwice("Hello", 2) → "Helo"
    nTwice("Chocolate", 3) → "Choate"
     */
    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }



    /* String-1 > twoChar
    Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.
    twoChar("java", 0) → "ja"
     */
    public String twoChar(String str, int index) {
        if (index < 0) {
            return str.substring(0, 2);
        } else if (index + 2 <= str.length()) {
            return str.substring(index, index + 2);
        }
        return str.substring(0, 2);
    }

    /* String-1 > middleThree
    Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.
    middleThree("Candy") → "and"
     */
    public String middleThree(String str) {
        //Defin the position of the middle character
        int middle = str.length() / 2;
        //Substract 1 from middle as startign point, define and of the string
        String modif = str.substring(middle - 1, middle + 2);
        return modif;
    }

    /* String-1 > hasBad
    Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.
    hasBad("badxx") → true
    hasBad("xbadxx") → true
    hasBad("xxbadxx") → false     */
    public boolean hasBad(String str) {
        if (str.length() == 3 & str.equals("bad")) {
            return true;
        } else if (str.length() >= 4) {
            return str.substring(0, 4).contains("bad");
        } else {
            return false;
        }
    }
    /* Solution 2
    public boolean hasBad(String str) {
  if (str.length()>=3 && str.substring(0, 3).equals("bad")) {
    return true;
  }
  if (str.length()>=4 && str.substring(1, 4).equals("bad")) {
    return true;
  }
  return false;}      */


    /* String-1 > lastChars
    Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
    lastChars("last", "chars") → "ls"
    lastChars("hi", "") → "h@"   */
    public String lastChars(String a, String b) {
        String first = "@";
        String last = "@";

        if (a.length() > 0) {
            first = a.substring(0, 1);
        }

        if (b.length() > 0) {
            last = b.substring(b.length() - 1);
        }
        return first + last;
    }

    /* String-1 > conCat
    Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
    conCat("abc", "cat") → "abcat"
    conCat("abc", "") → "abc"   */
    public String conCat(String a, String b) {
        if (a.length() == 0 || b.length() == 0)
            return a + b;

        if (a.charAt(a.length() - 1) == b.charAt(0))
            return a + b.substring(1);
        return a + b;
    }

    /* String-1 > lastTwo
    Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
    lastTwo("coding") → "codign"     */
    public String lastTwo(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
    }


}