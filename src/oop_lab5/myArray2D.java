package oop_lab5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class myArray2D {
    public  static void main (String[] args) throws IOException {
        //array 2D
        int[][] num = new int[2][3];

        num[0][0] = 100;
        num[0][2] = 200;
        num = inputData (num);
        showData(num);

    }//main

    private static int[][] inputData(int[][] num) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an integer");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print("num [" + i + "] [" + j + "]: ");
                num[i] [j] = Integer.parseInt(reader.readLine());

            }//j
        }//i
        return num;
    }//inputdata

    private static void showData(int[][] num) {
        System.out.println("Data in array: ");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j]+" ");

            }//j
            System.out.println();
        }//i
    }//shovdata

}//class
