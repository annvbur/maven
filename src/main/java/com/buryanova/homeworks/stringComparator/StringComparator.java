package com.buryanova.homeworks.stringComparator;

/**
 * Created by Ann on 10/1/16.
 */
public class StringComparator {

    private static final int maxCount = 10000;

    public static void main(String[] args) {

        int loopCount = 0;

        long start = System.currentTimeMillis();
        while (loopCount < maxCount) {
            concatWithPlus();
            loopCount++;
        }
        long finish = System.currentTimeMillis();
        long diffPlus = finish - start;
        System.out.println("concatWithPlusOperator = " + (diffPlus));

        long start1 = System.currentTimeMillis();
        while (loopCount < maxCount) {
            concatWithConcat();
            loopCount++;
        }
        long finish1 = System.currentTimeMillis();
        long diffConcat = finish1 - start1;
        System.out.println("concatWithConcat = " + (diffConcat));


        long start2 = System.currentTimeMillis();
        while (loopCount < maxCount) {
            concatWithBuffer();
            loopCount++;
        }
        long finish2 = System.currentTimeMillis();
        long diffBuffer = finish2 - start2;
        System.out.println("concatStringFormat = " + (diffBuffer));

        long start3 = System.currentTimeMillis();
        while (loopCount < maxCount) {
            concatWithBuilder();
            loopCount++;
        }
        long finish3 = System.currentTimeMillis();
        long diffBuilder = finish3 - start3;
        System.out.println("concatStringFormat = " + (diffBuilder));


    }

    private static void concatWithConcat() {
        String concat = "first".concat("second");
    }

    private static void concatWithBuilder() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("first").append("second");
        String builder = stringBuilder.toString();
    }

    private static void concatWithBuffer() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("first").append("second");
        String buffer = stringBuffer.toString();
    }

    private static void concatWithPlus() {
        String plus = "first" + "second";
    }
}

/* How can I extract method to make one function and pass parameters( concatWithConcat(), concatWithBuffer(), concatWithPlus())?

 */

