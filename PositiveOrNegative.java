import java.util.Scanner;


public class PositiveOrNegative {
	private static Scanner s;

	public static void main(String[] args) {
	s = new Scanner(System.in);
 int num;
 System.out.println("ENTER THE NUMBER TO CHECK");
 num=s.nextInt();
  if(num==0)
	 System.out.println("Number is equal to Zero");
  else if(num>0)
	 System.out.println("Positive Number");
  else
	 System.out.println(" Negative Number");
	 
}
}