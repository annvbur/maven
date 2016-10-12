package com.buryanova.homeworks.wordSplit;

/**
 * Created by Ann on 10/1/16.
 */
public class Word {
    public static void main(String[] args) {
        String myString = "kabriolet";
        System.out.println(java.util.Arrays.toString(
                myString.split("(?<=[aeiouy])")
        ));
    }
}

//add if block - where we can say - if only 1 letter is remained - to not split it as part - correct?