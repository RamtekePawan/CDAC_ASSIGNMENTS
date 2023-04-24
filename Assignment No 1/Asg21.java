/*
 * Write a program to convert state of Long instance into byte, 
short, int, long, float and double.

 */
class Asg21{
    public static void main(String[] args){
     Long s =new Long(12);
        
        System.out.println("Byte: "+s.byteValue() );
        System.out.println("Short : "+ s.shortValue());
        System.out.println( "Long : "+s.intValue());
        System.out.println("Long  : "+s.longValue());
        System.out.println("Float : "+s.floatValue());
        System.out.println("Double : "+s.doubleValue());
    }
}