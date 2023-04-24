class Asg6{
    
    public static void main (String[] args){
        //Problem1 : boolean value into String
        boolean num1 = true;
        String strNum1 = Boolean.toString(num1);
        System.out.println("String : "+strNum1);


        //Problem2 : boolean value into Boolean instance.
        boolean num2= false;
        Boolean bNum2= new Boolean(num2);
        System.out.println("Boolean : "+bNum2);

        //Problem 3: String value into boolean value

        String str1 = new String("Pawan");
        boolean strBoolean = Boolean.parseBoolean(str1);
        System.out.println("Boolean : "+strBoolean);

        //Problem 4 : String value into Boolean instance
        String str2 = "ABCD";
        Boolean numB= new Boolean(str2);
        System.out.println("Boolean : "+numB);   //false


    }
}