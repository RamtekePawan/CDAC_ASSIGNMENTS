/**
*Write a program to perform below operations on byte type to 
get:
 */

class Asg7{
    public static void main(String[] args){
        //Problem1: The number of bits used to represent a byte value
        Byte num1 =12;
        System.out.println("No of BITS : "+num1.SIZE);
        //Problem2 :The number of bytes used to represent a byte value 
        System.out.println("No of BYTES : "+num1.BYTES);

        //Problem3: The minimum value a byte
         System.out.println("Min Value In BYTES : "+num1.MIN_VALUE);

        //Problem4: The maximum value a byte
        System.out.println("Max Value In BYTES : "+num1.MAX_VALUE);


    }
}