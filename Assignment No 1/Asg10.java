/**
Write a program to perform below operations on char type to 
get
 */
 class Asg10{
    public static void main(String[] args ){
        //Problem1 : The number of bits used to represent a char value
        System.out.println("BITES : "+ Character.SIZE);
        //Problem2 : The number of bytes used to represent a char value
        System.out.println("BYTES : "+  Character.BYTES);
        //Problem3 :The minimum value a char
         System.out.println("MIN : " + (byte)Character.MIN_VALUE);
       
        //Problem4 :The maximum value a char
          System.out.println("MAX : " + (int)Character.MAX_VALUE);
        
    }  
 }