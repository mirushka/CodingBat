package com.company;

public class Array1 {

    /* Array-1 > firstLast6
    Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
    firstLast6([1, 2, 6]) → true
    firstLast6([13, 6, 1, 2, 3]) → false */

    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        }
        return false;

    }

    /* Array-1 > sameFirstLast
    Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
    sameFirstLast([1, 2, 3]) → false
    sameFirstLast([1, 2, 3, 1]) → true     */

    public boolean sameFirstLast(int[] nums) {
        if (nums.length >= 1) {
            if (nums[0] == nums[nums.length - 1]) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /* Array-1 > commonEnd
    Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.
    commonEnd([1, 2, 3], [7, 3]) → true
    commonEnd([1, 2, 3], [7, 3, 2]) → false      */

    //Solution 1
    public boolean commonEnd(int[] a, int[] b) {
        if (a[0] == b[0]) {
            return true;
        } else if (a[a.length - 1] == b[b.length - 1]) {
            return true;
        }
        return false;
    }

    /* Solution 2
    public boolean commonEnd(int[] a, int[] b) {
        return (a[0]== b[0] || a[a.length-1] == b[b.length-1]); } */

    /* Array-1 > sum3
    Given an array of ints length 3, return the sum of all the elements.
    sum3([1, 2, 3]) → 6
    sum3([5, 11, 2]) → 18      */
    public int sum3(int[] nums) {
        //return nums[0] + nums[1] + nums[2];
        int sum = 0;
        // Iterate through all elements and add them to sum
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }

    /* Solution 2
    return nums[0]+ nums[1] + nums[2]; */



}
