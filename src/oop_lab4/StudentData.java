package oop_lab4;
// สร้าง method สำหรับรับค่าข้อมูลนักศึกษาประกอบด้วย
//1. ชื่อ-สกุล
//2. ที่อยู่
//3. รหัสนักศึกษา
//4. สาขาและมหาวิทยาลัย
//5. email

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentData {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static String getName() throws IOException{
     System.out.print("Enter your name: ");
     return  reader.readLine();
    }// getName

    public static String getaddresd() throws IOException{
        System.out.print("Enter your addresd: ");
     return  reader.readLine();
    }// getaddresd

    public static String getid() throws IOException{
        System.out.print("Enter your id: ");
        return  reader.readLine();
    }// getid

    public static String getmajorfaculty() throws IOException{
        System.out.print("Enter your majorfaculty: ");
        return  reader.readLine();
    }// getmajorfaculty


    public static String getemail() throws IOException{
        System.out.print("Enter your email: ");
        return  reader.readLine();
    }// getemail

    public static void main (String[] args) throws IOException{
        String name = getName();
        String address = getaddresd();
        String id = getid();
        String fac = getmajorfaculty();
        String email = getemail();
        System.out.println(name+"\n"+address+"\n"+id+"\n"+fac+"\n"+email);


    }//main
}//class
