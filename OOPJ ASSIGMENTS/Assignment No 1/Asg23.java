/*
 Write a program to perform below operations on float type to 
get: 
a. The number of bits used to represent a float value
b. The number of bytes used to represent a float value
c. The minimum value a float
d. The maximum value a float

 */
class Asg23{
    public static void main(String[] args){
        
        System.out.println("Size : "+Float.SIZE);
        System.out.println("BYTES : "+Float.BYTES);
        System.out.println("Min Value : "+Float.MIN_VALUE);
        System.out.println("Max Value : "+Float.MAX_VALUE);
    }
}