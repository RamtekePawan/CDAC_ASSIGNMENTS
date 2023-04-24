/*
 * Write a program to convert:
a. double value into String
b. double value into Double instance.
c. String instance into Double instance.
d. double value into binary and hexadecimal 
string(Note: Here you can use doubleToLongBits() method 
along with methods of Long class).
 */
class Asg28{
    public static void main(String[] args){
        double d = 122.94d;
        String str = new String("123.543");
        toOctalString(long i)
        System.out.println("String : "+	Double.toString(d));
        System.out.println("Double Instance : "+ Double.valueOf(d));
        System.out.println("String instance to Double instance : "+Double.parseDouble(str));
        System.out.println("Double value into binary : "+Double.doubleToLongBits(d))
        System.out.println("Double value into Hexa : "+Double.toHexString(d)); 
    }
}