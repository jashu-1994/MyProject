import java.util.*;
class Table
{
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);

	 System.out.println("Enter Table Number");
	 int num=sc.nextInt();


	 int table=num;
	 while(table<=num*10)
	 {
		 System.out.println(table);
		 table=table+num;
	 }
 }
}
//now taking table from keyboard