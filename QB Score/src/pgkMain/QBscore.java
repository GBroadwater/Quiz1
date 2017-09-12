package pgkMain;
import java.util.Scanner;


public class QBscore {

	Scanner input;
	
	public static void main(String[] args) {
		System.out.println("Enter Passes Attempted:");
		Scanner input = new Scanner(System.in);
		double Att = input.nextDouble();
		System.out.println("Enter Passes Completed:");
		double Comp = input.nextDouble();
		System.out.println("Enter Yards Gained by Passing:");
		double Yds = input.nextDouble();
		System.out.println("Enter Passing Touchdowns:");
		double Td = input.nextDouble();
		System.out.println("Enter Interceptions Thrown:");
		double Int = input.nextDouble();
		
		double a = (((Comp / Att) - 0.3) * 5);
		if (a > 2.375) {
			a = 2.375;}
		else if (a < 0) {
			a = 0;}
		
		double b = (((Yds / Att) - 3) * 0.25);
		if (b > 2.375) {
			b = 2.375;}
		else if (b < 0) {
			b = 0;}
		
		double c = ((Td / Att) * 20);
		if (c > 2.375) {
			c = 2.375;}
		else if (c < 0) {
			c = 0;}
	
		
		double d = (2.375 - ((Int / Att) * 25));
		if (d > 2.375) {
			d = 2.375;}
		else if (d < 0) {
			d = 0;}
		
		double PasserRating = (((a+b+c+d) / 6) * 100);
		System.out.println("The Passer Rating is:" +PasserRating);
	}

}
