package com.srikanth;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0 ){
            System.out.println("Invalid Value");
            return;
        }
        System.out.println(kiloBytes + " KB ="+ kiloBytes/1024 +" MB and " + kiloBytes%1024 +" KB");
    }

    public static void main(String[] args) {
        MegaBytesConverter.printMegaBytesAndKiloBytes(5);
    }
}
