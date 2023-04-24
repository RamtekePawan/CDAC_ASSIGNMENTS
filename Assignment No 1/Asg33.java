/*
 * Pass integer, float and double value from command line. Parse 
it appropriately and perform arithmetic operations (+,-,*,/)
on it. Here you can you switch case.
 */

 class Asg33{
    public static void main(String[]args){
        int i = Integer.parseInt(args[0]);
        double d=Double.parseDouble(args[1]);
        float f=Float.parseFloat(args[2]);

        System.out.println("f+i : "+(float)(i + f));
        System.out.println("f+i : "+(float)(d + f));
        System.out.println("f+i : "+(d + i));


    }
 }