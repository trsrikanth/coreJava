package com.srikanth;

public class CalcFeetAndInchesToCentimenter {

    private static double calcFeetAndInchesToCentimenter(int feet, int inch){

        System.out.println("Feets : "+ feet + " inch : "+ inch);
        if(feet <0 || inch <0 || inch >12) {
            System.out.println("invalid value feet | inch ");
            return -1;
        }
        double cms;

        cms = feet * 30.48;
        cms += inch * 2.54;

        System.out.println(" cms = "+ cms);
        return  cms;
    }

    public static double calcFeetAndInchesToCentimenter( int inch){
        System.out.println(" inch : "+ inch);
        if (inch < 0) {
            System.out.println("invalid inch values ");
            return -1;
        }
        return calcFeetAndInchesToCentimenter(inch/12, inch %12);
    }


    public static void main(String[] args) {
              calcFeetAndInchesToCentimenter(52);
        calcFeetAndInchesToCentimenter(192);
        calcFeetAndInchesToCentimenter(-1);
        calcFeetAndInchesToCentimenter(648);
        calcFeetAndInchesToCentimenter(1098);

    }
}
