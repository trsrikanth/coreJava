package com.srikanth;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double d1, double d2){


        /*if(Double.toString(d1).split("\\.")[1].substring(0,3).equals(Double.toString(d2).split("\\.")[1].substring(0,3))){
            return true;
        }else{
            return false;
        }*/


        int i1 = (int) d1 * 1000;
        int i2 = (int) d2 * 1000;

        return (i1 == i2) ? true : false;
    }

    public static void main(String[] args) {
        System.out.println( DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756,-3.17567));

        System.out.println( DecimalComparator.areEqualByThreeDecimalPlaces(3.0,3.0));
    }


}
