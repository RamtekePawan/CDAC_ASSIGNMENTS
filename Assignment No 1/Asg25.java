/*
 * Write a program to convert state of Float instance into byte, 
short, int, long, float and double.
 */
class Asg25{
    public static void main(String[] args){
        Float f =new Float (12.94f);
        
        System.out.println("Byte: "+f.byteValue() );
        System.out.println("Short : "+ f.shortValue());
        System.out.println("Float : "+f.intValue());
        System.out.println("Long  : "+f.longValue());
        System.out.println("Float : "+f.floatValue());
        System.out.println("Double : "+f.doubleValue());
    }
}