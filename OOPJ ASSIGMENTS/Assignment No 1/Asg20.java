/*
 Write a program to convert:
a. long value into String
b. long value into Long instance.
c. String instance into Long instance.
d. long value into binary, octal and hexadecimal string.
 */
class Asg20{
    public static void main(String[] args){
        long i = 122;
        String str = new String("123");
        
        System.out.println("String : "+	Long.toString(i));
        System.out.println("Long Instance : "+ Long.valueOf(i));
        System.out.println("String instance to long instance : "+Long.parseLong(str));
        System.out.println("Long value into binary : "+Long.toBinaryString(i));
        System.out.println("Long value into octal : "+Long.toOctalString(i));
        System.out.println("Long value into Hexa : "+Long.toHexString(i));
       
    }
}