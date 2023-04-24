/*
 * Write a program to convert state of Integer instance into 
byte, short, int, long, float and double.

 */

 class Asg17{
    public static void main(String[] args){
        Integer s =new Integer (12);
        
        System.out.println("Byte: "+s.byteValue() );
        System.out.println("Short : "+ s.shortValue());
        System.out.println("Integer : "+s.intValue());
        System.out.println("Long  : "+s.longValue());
        System.out.println("Float : "+s.floatValue());
        System.out.println("Double : "+s.doubleValue());
    }
}