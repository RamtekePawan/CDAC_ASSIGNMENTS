/**
Write a program to convert:
*/
public class Asg8{
    public static void main(String[] args ){
        // Prob1: byte value into String
        byte b = 12;
        System.out.println("String : "+ Byte.toString(b));

       //Prob2: byte value into Byte instance.
       byte b1 = 23;
       Byte obj= new Byte(b1);
       System.out.println("Byte instance : "+ obj);

       //Prob 3:  String instance into Byte instance.
       String str = new String("123");
       Byte b3 = Byte.parseByte(str);
       System.out.println("Byte instance by string : " +b3);
    }

 






}