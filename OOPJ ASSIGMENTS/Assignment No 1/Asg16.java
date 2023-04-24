/*
Write a program to convert:
a. int value into String
b. int value into Integer instance.
c. String instance into Integer instance.
d. int value into binary, octal and hexadecimal string.

 */

class Asg16{
    public static void main(String[] args){
        int i = 122;
        String str = new String("123");
        
        System.out.println("String : "+	Integer.toString(i));
        System.out.println("Int Instance : "+ Integer.valueOf(i));
        System.out.println("String instance to integer instance : "+Integer.parseInt(str));
        System.out.println("int value into binary : "+Integer.toBinaryString(i));
        System.out.println("int value into octal : "+Integer.toOctalString(i));
        System.out.println("int value into Hexa : "+Integer.toHexString(i));
       
    }
}