package oop_lab6;

public class myString {
    public static void main(String[] args){
        char []c = {'H', 'e', 'l', 'l', 'o'};
        String strl = new String(c);
        System.out.println(strl);
        String str2 = "suwadee Anantranon";
        System.out.println(str2);

        //String concatenation
        //type 1 (+)
        String str3 = strl +" "+ str2;
        System.out.println(str3);
        //type 2 (concat () method)
        String str4 = str3.concat(" RMUTSV");
        System.out.println(str4);

        //String Methods
        System.out.println(str4.length());
        System.out.println(str4.substring(10,20));
        System.out.println(str4.toUpperCase());
        System.out.println(str4.toLowerCase());
        str4.replace('r','t');
        System.out.println( str4.replace('r','t'));



    }//main


}//class
