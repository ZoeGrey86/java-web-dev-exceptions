package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        //test divide method
        //System.out.println(Divide(12,2));

        // Test out your CheckFileExtension() function!
        for(Map.Entry<String, String> student: studentFiles.entrySet()){
            String studentFile = student.getValue();
            System.out.println(student.getKey() + ", " +CheckFileExtension(studentFile));
        }
    }

    public static int Divide(int x, int y)
    {
        // Write code here!
        if( y == 0){
            try{throw new DivideException("Can't divide by zero.");
            }catch (DivideException e){
                e.printStackTrace();
            }
            System.out.println();
        }
        int z = x/y;
        return z;
    }

    public static int CheckFileExtension(String fileName)
    { int grade = 0;
        if(fileName.isEmpty() || fileName == null){
            grade -= 1;
            try{
                throw new Exception("Invalid File! Minus one point ");
            }catch (DivideException e){e.printStackTrace();} catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println();
        }
        if(fileName.contains(".java")){
            grade =+ 1;
        }else if(!fileName.contains(".java")){grade += 0;}
        return grade;
    }

}
