package com.company;

public class Array_prac_2 {
    public static void main(String[] args) {

        int[][] flats;
        flats = new int[2][3];

        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        System.out.println("Printing 2-D Array --->");
        for (int[] flat : flats) {
            for (int j = 0; j < flats[0].length; j++) {
                System.out.print(flat[j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
