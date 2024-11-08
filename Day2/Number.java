

import java.util.Scanner;
class Number{

public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int no;
System.out.print("Enter a number");
no=sc.nextInt();
if(no>0)
{
System.out.println("Given number is positive");
}
else
{
System.out.println("Given number is negative");
}
}
}