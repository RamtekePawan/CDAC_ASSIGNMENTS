package timepass;

import java.util.Arrays;
import java.util.Scanner;
enum ArithmeticOperation{
EXIT, SUM, SUB, MULTIPLICATION, DIVISION
}
class ArithmeticOperationTest{
public static int sum( int num1, int num2 ) {
return num1 + num2;
}
public static int sub( int num1, int num2 ) {
return num1 - num2;
}
public static int multiplication( int num1, int num2 ) {
return num1 * num2;
}
public static int division( int num1, int num2 ) {
return num1 / num2;
}
public static void printRecord( int result ) {
System.out.println("Result : "+result);
}
private static Scanner sc = new Scanner(System.in);
public static ArithmeticOperation menuList( ) {
System.out.println("0.Exit");
System.out.println("1.Sum");
System.out.println("2.Sub");
System.out.println("3.Multiplication");
System.out.println("4.Division");
System.out.print("Enter choice : ");
int choice = sc.nextInt();
return ArithmeticOperation.values()[ choice ];
/* ArithmeticOperation[] arr = ArithmeticOperation.values();
//[EXIT, SUM, SUB, MULTIPLICATION, DIVISION]
return arr[ choice ]; */
}
}class Program {
public static void main(String[] args) {
ArithmeticOperation choice;
while( ( choice = ArithmeticOperationTest.menuList( ) ) !=
ArithmeticOperation.EXIT ) {
int result = 0;
switch( choice ) {
case SUM:
result = ArithmeticOperationTest.sum(100, 20);
break;
case SUB:
result = ArithmeticOperationTest.sub(100, 20);
break;
case MULTIPLICATION:
result = ArithmeticOperationTest.multiplication(100, 20);
break;
case DIVISION:
result = ArithmeticOperationTest.division(100, 20);
break;
}
ArithmeticOperationTest.printRecord(result);
}
}
}
