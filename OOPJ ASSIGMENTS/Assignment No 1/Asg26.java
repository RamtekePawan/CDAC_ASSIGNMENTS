/*
 * Write a program to find minimum and maximum number as well as 
to add two float numbers using methods of Float.
 */
class Asg26{
    public static void main(String[] args){
        float n1 = 100.5f;
        float n2= 200.5f;

       System.out.println("Max : "+Float.max(n1, n2));
       System.out.println("Min : "+Float.min(n1, n2));
       System.out.println("Sum : "+Float.sum(n1, n2));
    }
}