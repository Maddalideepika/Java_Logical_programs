import java.util.Scanner;
class StudentDetails
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int sno,math,phy,chem,total;
String sname;
float savg;
System.out.println("Enter student no");
 sno=sc.nextInt();
System.out.println("Enter student name");
 sname=sc.next();
System.out.println("Enter math marks");
math=sc.nextInt();
System.out.println("Enter physics marks");
phy=sc.nextInt();
System.out.println("Enter chem marks");
chem=sc.nextInt();
total=math+phy+chem;
savg=total/3;
System.out.println("The student no is:"+sno);
System.out.println("The student name is:"+sname);
System.out.println("The student math marks is:"+math);
System.out.println("The student physics marks is:"+phy);
System.out.println("The student chemistry marks is:"+chem);
System.out.println("The student total is:"+total);
System.out.println("The student average is:"+savg);
}
}


