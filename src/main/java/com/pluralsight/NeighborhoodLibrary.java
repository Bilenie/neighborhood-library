package com.pluralsight;
import java.util.Scanner;
public class NeighborhoodLibrary {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Welcome to Bilenie’s Liabrary App !!!");

        System.out.print("How many cars today? ");
        int carCount = input.nextInt();
        input.nextLine();

        NeighborhoodLibrary[] library = new NeighborhoodLibrary[carCount];


    }
}
