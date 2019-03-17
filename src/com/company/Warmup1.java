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

}
