/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author student
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = "Hello World";  
String s2 = "Hello World";  
String s3 = s1.substring(6);  
System.out.println(s1); // Hello World  
System.out.println(s2); // Hello World  
System.out.println(s3); // World  

Feild field = String.class.getDeclaredField("value");  
field.setAccessible(true);  
char[] value = (char[])field.get(s1);  
value[6] = 'J';  
value[7] = 'a';  
value[8] = 'v';  
value[9] = 'a';  
value[10] = '!';  

System.out.println(s1); // Hello Java!  
System.out.println(s2); // Hello Java!  
System.out.println(s3); // World  

    }
    
}
