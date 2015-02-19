import java.util.Scanner;
class Adder 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int num1, num2;
		System.out.print("num1 = ");
		num1 = scan.nextInt();
		System.out.print("num2 = ");
		num2 = scan.nextInt();
		System.out.println("num1 + num2 = " + (num1+num2));
	}
}
