package oop_lab3;

//0-49 = F
//50-59= D
//60-69 = C
//70-79 = B
//80-100 = A

import java.util.Scanner;
public class Calgrade {
    public static void main(String[] args) {
        // 1. create object for get input from user.
        Scanner scanner = new Scanner(System.in);
        // 2. create vriable for store data.
        int score;
        //3. test variable with condition above.
        score = scanner.nextInt();
        //4. show the output on screen.
        if(score<=49)System.out.println("Your grade is F");
        else if(score<=59)System.out.println("Your grade is D");
        else if(score<=69)System.out.println("Your grade is C");
        else if(score<=79)System.out.println("Your grade is B");
        else System.out.println("Your grade is A");
    }
}
