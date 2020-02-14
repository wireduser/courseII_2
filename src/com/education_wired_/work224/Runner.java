package com.education_wired_.work224;

import com.education_wired_.work224.calcarea.Calculate;

import java.util.Scanner;

public class Runner {
    public static void run() {
        int diameter = 0;
        int height = 0;
        int width = 0;

        Scanner scd = new Scanner(System.in);
        System.out.print("Enter a circle diameter -> ");
        diameter = scd.nextInt();
        System.out.println(" circle area - " + Calculate.areaCircle(diameter));

        Scanner sch = new Scanner(System.in);
        System.out.print("Enter a square width -> ");
        height= sch.nextInt();
        Scanner scw = new Scanner(System.in);
        System.out.print("Enter a square height -> ");
        width= scw.nextInt();
        System.out.println(" square area - " + Calculate.areaSquare(height,width));

    }
}
