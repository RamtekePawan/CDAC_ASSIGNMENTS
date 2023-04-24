/**Write a program to convert state of Byte instance into byte, 
short, int. long, float and double. */
class Asg9{
    public static void main(String[] args){
byte b = 13;
Byte obj= new Byte(b);

System.out.println("BYTE : "+ obj.byteValue());
System.out.println("SHORT : "+ obj.shortValue());
System.out.println("INT : "+ obj.intValue());
System.out.println("LONG : "+ obj.longValue());
System.out.println("FLOAT : "+ obj.floatValue());
System.out.println("DOUBLE : "+ obj.doubleValue());



    }
}