import java.util.Scanner;
public class StringEqualsDemo{
  public static void main(String[] args)
  {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Please enter the first string:");
    String str1=scanner.nextLine();
    System.out.println("Please enter the second string");
    String str2=scanner.nextLine();
    scanner.close();
    if (str1.equals(str2))
    {
      System.out.println("Both stings are same.");
    }
    else{
      System.out.println("Both string are not same.");
    }
  }
}