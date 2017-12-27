package oop_lab6;

import java.util.StringTokenizer;

public class StringToken {
    public static void main(String[] args){
        String msg = "Hello, RMUTSV Suwadee Anantranon";
        StringTokenizer myToken = new StringTokenizer(msg);
        System.out.println(myToken.countTokens());

        while (myToken.hasMoreElements()){
            StringBuffer myBuf = new StringBuffer(myToken.nextToken());
            System.out.print(myBuf.reverse()+" ");
        }//whle





    }//main


}//class
