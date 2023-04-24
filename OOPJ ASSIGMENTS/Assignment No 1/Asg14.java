/*
Write a program to convert state of Short instance into byte, 
short, int, long, float and double.
*/

class Asg14{
    public static void main(String[] args){
        short s1=22;
        Short s =new Short(s1);
        
        System.out.println("Byte: "+s.byteValue() );
        System.out.println("Short : "+ s.shortValue());
        System.out.println("Integer : "+s.intValue());
        System.out.println("Long  : "+s.longValue());
        System.out.println("Float : "+s.floatValue());
        System.out.println("Double : "+s.doubleValue());
       
    }
}