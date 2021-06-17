
 class abc {
 // int x = 5;
 int get(int a,float b)
  {
	 float z=a+b;
	 return z;

  }


}

public class Main {
  public static void main(String[] args) {
    abc myObj = new abc();

    int a=myObj.get(5,10.9);
    System.out.println("The Z is: "+ a);

  }
}
