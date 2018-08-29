package com.srikanth;

public class SecondsAndMinutesChallenge {
    public static String getDuration(int minutes, int seconds){
        if(minutes <0 || seconds < 0 || seconds > 59){
            return "invalid value";
        }

        int totalSecs = seconds;
        totalSecs += minutes *60;

        int hours = totalSecs / 3600;
        int minutes1 = (totalSecs % 3600) / 60;
        int seconds1 = totalSecs % 60;

        return String.format("%02dh %02dm %02ds", hours, minutes1, seconds1);
    }
    public static String getDuration( int seconds){
        if(seconds < 0 ) return "invalid value";

        return getDuration(seconds/60,seconds%60);
    }

    public static void main(String[] args) {
        System.out.println(getDuration(65,59));
        System.out.println(getDuration(5,59));
        System.out.println(getDuration(5,69));
    }
}
