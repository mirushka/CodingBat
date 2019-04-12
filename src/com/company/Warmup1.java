package com.company;

public class Warmup1 {

    /* Warmup-1 > sleepIn
    The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
    sleepIn(false, false) → true
    sleepIn(true, false) → false    */
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == false || vacation == true) {
            return true;
        } else {
            return false;
        }
    }
    /* Solution 2
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }   */

    /* Warmup-1 > monkeyTrouble
    We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
    monkeyTrouble(true, true) → true
    monkeyTrouble(false, false) → true
    monkeyTrouble(true, false) → false  */
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (!aSmile && !bSmile) {
            return true;
        } else if (aSmile && bSmile) {
            return true;
        }
        return false;
    }

    /* Warmup-1 > sumDouble
    Given two int values, return their sum. Unless the two values are the same, then return double their sum.   */
    public int sumDouble(int a, int b) {
        if (a == b) {
            return (a + b) * 2;
        }
        return a + b;
    }
    /* Solution2
    public int sumDouble(int a, int b) {
  int sum = a+b;
  if(a == b){
    return sum
    *2;
  }
  return sum;}      */

    /* Warmup-1 > diff21
    Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
    diff21(19) → 2     */
    public int diff21(int n) {
        int result = 21 - n;
        if (result > 0) {
            return result;
        }
        return 2 * result * (-1);
    }

    /* Warmup-1 > parrotTrouble
    We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20.
    Return true if we are in trouble.
    parrotTrouble(true, 6) → true
    parrotTrouble(true, 7) → false       */
    public boolean parrotTrouble(boolean talking, int hour) {
        if ((hour < 7 & talking) || (hour > 20 & talking)) {
            return true;
        }
        return false;
    }
    /* Solution 2
    public boolean parrotTrouble(boolean talking, int hour) {
  if(talking && (hour<7 || hour>20)){
    return true;
  }
  return false; }
    */

    /* Warmup-1 > makes10
    Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
    makes10(9, 10) → true
     */
    public boolean makes10(int a, int b) {
        return (a + b == 10 || a == 10 || b == 10);
    }

    /* Warmup-1 > nearHundred
    Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
    nearHundred(93) → true
     */
    public boolean nearHundred(int n) {
        return (n >= 90 & n <= 110 || n >= 190 & n <= 210);
    }

    /* Warmup-1 > posNeg
    Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.
    posNeg(1, -1, false) → true
     */
    public boolean posNeg(int a, int b, boolean negative) {
        if (negative == false & (a < 0 & b > 0 || a > 0 & b < 0)) {
            return true;
        } else if (negative == true & a < 0 & b < 0) {
            return true;
        }
        return false;
    }
    /* Solution 2
    public boolean posNeg(int a, int b, boolean negative) {
  if (negative) {
    return (a < 0 && b < 0);
  }
  else {
    return ((a < 0 && b > 0) || (a > 0 && b < 0));
  }}     */

    /* Warmup-1 > notString
    Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
    notString("candy") → "not candy"    */
    public String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }
        return "not " + str;
    }

   /* Warmup-1 > missingChar
    Given a non-empty string and an int n, return a new string where the char at index n has been removed.
    The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
    missingChar("kitten", 1) → "ktten"
    missingChar("kitten", 0) → "itten" */

    public String missingChar(String str, int n) {

        StringBuffer buff = new StringBuffer(str);
        return buff.deleteCharAt(n).toString();
    }

    /* Warmup-1 > frontBack
    Given a string, return a new string where the first and last chars have been exchanged.
    frontBack("code") → "eodc"
    frontBack("a") → "a"
     */
    public String frontBack(String str) {
        if (str.length() <= 1) {
            return str;
        }

        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);
        return last + str.substring(1, str.length() - 1) + first;

    }

    /* Warmup-1 > front3
    Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.
    front3("Java") → "JavJavJav"
    front3("Chocolate") → "ChoChoCho"
     */
    public String front3(String str) {
        String front;

        if (str.length() >= 3) {
            front = str.substring(0, 3);
        } else {
            front = str;
        }
        return front + front + front;
    }

    /* Warmup-1 > backAround
    Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
    backAround("cat") → "tcatt"
    backAround("Hello") → "oHelloo"
     */
    public String backAround(String str) {
        char last = str.charAt(str.length() - 1);
        return last + str + last;
    }
    /* Solution 2
    public String backAround(String str) {
  // Get the last char
    String last = str.substring(str.length() - 1);
    return last + str + last;
    }     */


}
