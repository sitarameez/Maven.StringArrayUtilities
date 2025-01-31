package com.zipcodewilmington;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        String result = "";

        result = array[array.length - 1];

        return result;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        String result = "";
        result = array[array.length - 2];
        return result;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        Boolean result = false;
        for (String word : array) {
            if (word == value) {
                result = true;
            }
        }
        return result;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] result = new String[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j] = array[i];
            j++;
        }
        return result;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        Boolean result = true;
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(array[array.length - i - 1])) {
                result = false;
            }
        }
        return result;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String check=String.join("",array).toLowerCase();
        String[] letters={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
           for(int i=0;i<letters.length;i++){
            if(check.contains(letters[i])){
            }
            else
            {
                return false;
            }
           }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                result++;
            }
        }
        return result;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> tempArray = new ArrayList<String>();
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(valueToRemove)) {
                tempArray.add(array[i]);

            }
        }
        String[] result = new String[tempArray.size()];
        result = tempArray.toArray(result);
        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        ArrayList<String> tempArrayList = new ArrayList<String>();
        for (int i = 0; i < array.length; i++) {
            tempArrayList.add(array[i]);
            if (i > 0) {
                if (array[i].equals(array[i - 1])) {
                    tempArrayList.remove(tempArrayList.size() - 1);
                }
            }
        }
        String[] result = new String[tempArrayList.size()];
        result = tempArrayList.toArray(result);
        return result;
    }


    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> tempArrayList = new ArrayList<String>();
//{"a", "a", "a", "b", "c", "c", "a", "a", "d"};
        int j = 0;
        tempArrayList.add(array[0]);

        for(int i = 1; i < array.length; i++){
            if(tempArrayList.get(j).contains(array[i]))
            {
                tempArrayList.set(j, (tempArrayList.get(j) + array[i]));
            }
            else
            {
                j++;
                tempArrayList.add(array[i]);
            }
        }

        String[] result = new String[tempArrayList.size()];
        result = tempArrayList.toArray(result);

        return result;
    }
}