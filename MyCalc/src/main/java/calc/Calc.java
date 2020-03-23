package calc;
import java.util.Scanner;
public class Calc{
	public static final void main(String[] args){
		Integer a = new Integer(0);
		Integer b = new Integer(0);
		String op = new String();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first number");
		a = in.nextInt();
		System.out.println("Enter second number");
		b = in.nextInt();
		System.out.println("Enter operation");
		op = in.next();
		switch (op){
			case"+":{
				System.out.println(a+b);
			}break;
			case"-":{
				System.out.println(a-b);
			}break;
			case"*":{
				System.out.println(a*b);
			}break;
			case"/":{
				if(b==0)System.out.println("Error, division by zero");
				else System.out.println(a+b);
			}break;
			default:{}break;
		}
	}
}
