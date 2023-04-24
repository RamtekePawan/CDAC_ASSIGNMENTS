/*
 * Write a program to convert state of Double instance into byte, 
short, int, long, float and double
 */
class Asg29{
    public static void main(String[] args){
        Double d =new Double (12.94);
        
        System.out.println("Byte: "+d.byteValue() );
        System.out.println("Short : "+ d.shortValue());
        System.out.println("Double : "+d.intValue());
        System.out.println("Long  : "+d.longValue());
        System.out.println("Double : "+d.floatValue());
        System.out.println("Double : "+d.doubleValue());
    }
}