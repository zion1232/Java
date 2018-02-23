import java.util.Scanner;

public class Train {
private static final int S_IN_H=60;
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 4 integers");
		System.out.println("Please enter the speed of train 1 :");
		int speed1 = scan.nextInt();
		System.out.println("Please enter the time of train 1 :");
		int time1 = scan.nextInt();
		System.out.println("Please enter the speed of train 2 :");
		int speed2 = scan.nextInt();
		System.out.println("Please enter the time of train 2 :");
		int time2 = scan.nextInt();
		int d1=speed1*time1/S_IN_H;
		int d2=speed2*time2/S_IN_H;
		System.out.println("The distance between the trains is " + (d1-d2) +" km.");
	


	}

}
