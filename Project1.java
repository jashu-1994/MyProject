import java.util.*;
abstract class wheel
{
	abstract int pahiya();
}
class car extends wheel
{ public int pahiya()

	{ return 4;}

}
class auto extends wheel
{
	public int pahiya()

		{return 3;}


}
class Project1
{
public static void main(String[] args)
{

 /*Scanner SC=new Scanner(System.in);
 System.out.println("Enter First number");
 int num1=SC.nextInt();
 System.out.println("Enter Second number");
 int num2=SC.nextInt();
 int total=num1+num2;
 System.out.println("Addition is :"+total);*/
 /*int [][]count={{2,3,4},{5,80,70}};
 for(int []x:count)
 {
	 for(int x1:x)
	 {
		 System.out.println(x1);
	 }}

 char [][]name={{103,105,95},{5,80,70}};
 	  for(char []x:name)
 	  {
 	 	for(char x1:x)
 	 	 {
 	 		 System.out.println(x1);}}*/


/*String s="This is book";
String s1="This is book1";
String s2="This is pen";
s=s1+s2;

 	 	  System.out.println(s);
 	 	   System.out.println(s1);
 	 	    System.out.println(s2);
 	 	    Scanner sc=new Scanner(System.in);
 	 	    System.out.println("Enter Searching Number");
 	 	    int a1=sc.nextInt();
 	 	    int [][]a={{1,2,5},{3,6,9},{10,20,30},{100,200,300}};
 	 	    for(int []x:a)
 	 	    { for(int y:x)

 	 	   {    if(a1==y)

			   {System.out.println("Found"+y);}
			   else { System.out.println("Not Found");}

			}


				}*/
				 wheel c=new car();
				 int e=c.pahiya();
				 System.out.println(e);
				 wheel a=new auto();
				var d=a.pahiya();
				 System.out.println(d);


 	 	  }
}