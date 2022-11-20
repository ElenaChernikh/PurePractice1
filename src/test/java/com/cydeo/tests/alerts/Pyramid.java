package com.cydeo.tests.alerts;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
System.out.println("How many rows you want in your pyramid?");
        int noOfRows=scan.nextInt();
        int rowCount=1;
        System.out.println("Here is your pyramid");
        for(int i=noOfRows;i>0;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print(" "); }
                for(int j=1;j<=rowCount;j++) { System.out.print(rowCount+ " "); }
                        System.out.println();
                    rowCount++; }}}
