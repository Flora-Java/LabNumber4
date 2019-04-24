import java.util.Scanner;

public class MultiplicationTable {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		int numb ;
		
		String cont ;
		String form1 = "%-10s %10s %13s %n";

		String form = "         ";
		
		do {
			System.out.println("Please enter a number :");
			numb = scan.nextInt();
			System.out.println("Number" + form + "Squared" + form + "cubed");
			System.out.println("======" + form + "=======" + form + "======");

			for (int i = 1; i <= numb; i++) {
				System.out.printf(form1, i , squared(i), cubed(i));
			}
			System.out.println("Do you want to continue (yes/no)? ");
			cont =scan.next();
		}
		 while (cont.equalsIgnoreCase ("yes"));
		
	
		
		scan.close();

	}
	
 public static int squared(int number) {
	 return number * number;
 }
 public static int cubed(int number) {
	 return number * number * number;
 }
}
