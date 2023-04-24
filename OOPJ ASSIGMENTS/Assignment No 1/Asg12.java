/*2.Write a program to perform below operations on short type to 
get:
a. The number of bits used to represent a short value
b. The number of bytes used to represent a short value
c. The minimum value a short
d. The maximum value a short */

class Asg12{
    public static void main(String[] args){
        
        System.out.println("Size : "+Short.SIZE);
        System.out.println("BYTES : "+Short.BYTES);
        System.out.println("Min Value : "+Short.MIN_VALUE);
        System.out.println("Max Value : "+Short.MAX_VALUE);
    }
}