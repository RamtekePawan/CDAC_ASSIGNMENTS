/*
 * Write a program to convert:
a. float value into String
b. float value into Float instance.
c. String instance into Float instance.
d. float value into hexadecimal string
 */
class Asg24{
    public static void main (String[] args){
        float f = 10.32f;
        String str = new String("122.94");  
        System.out.println("String : "+	Float.toString(f));
        System.out.println("Float Instance : "+ Float.valueOf(f));
        System.out.println("String instance to float instance : "+Float.parseFloat(str));
        System.out.println("Float value into Hexa : "+Float.toHexString(f)); 
    }
}
