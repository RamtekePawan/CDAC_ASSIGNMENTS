
/*
 Write a program to convert:
a. short value into String
b. short value into Short instance.
c. String instance into Short instance.
 */

class Asg13{
    public static void main(String[] args){
        short s = 12;
        String str = new String("122");
        System.out.println("String : "+	Short.toString(s));
        System.out.println("Short Instance : "+ Short.valueOf(s));
        System.out.println("Short instance from String : "+Short.valueOf(str));
       
    }
}