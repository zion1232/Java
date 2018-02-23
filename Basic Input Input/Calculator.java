import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 4 integers");
		System.out.println("enter the numerator of fraction 1 :");
		int num1 = scan.nextInt();
		System.out.println("enter the denominator of fraction 1 :");
		int den1 = scan.nextInt();
		System.out.println("enter the numerator of fraction 2 :");
		int num2 = scan.nextInt();
		System.out.println("enter the denominator of fraction 2 :");
		int den2 = scan.nextInt();
		System.out.println(num1+"/"+den1+"+"+num2+"/"+den2+"="+(den1*den2/den1*num1+den1*den2/den2*num2)+"/"+den1*den2);
		System.out.println(num1+"/"+den1+"-"+num2+"/"+den2+"="+(den1*den2/den1*num1-den1*den2/den2*num2)+"/"+den1*den2);
		System.out.println(num1+"/"+den1+"*"+num2+"/"+den2+"="+num1*num2+"/"+den1*den2);
		System.out.println(num1+"/"+den1+":"+num2+"/"+den2+"="+num1*den2+"/"+num2*den1);


	}

}
