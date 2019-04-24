import java.util.Scanner;

public class ExtraMultiplicationEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// multiplicaTion table 1-10
		
		int numb ;
		
		String cont ;
		String form = "   ";
		String form1 = " %10s";
		
		do {
			System.out.println("Please enter a number between 1 and 10 :");
			numb = scan.nextInt();
			System.out.println("Multiplication table for number: " + numb);
			System.out.println("~~~~");

			for (int i = 1; i <= numb; i++) {
				System.out.print(i + "  ");
				for (int j = 1 ; j <=numb ; j++) {
				System.out.printf(form1 , multi(i,j));
						//) + form + cubed(i) + "\n");
				}
				System.out.print( "\n");
				
			}
			System.out.println("Do you want to continue (yes/no)? ");
			cont =scan.next();
		}
		 while (cont.equalsIgnoreCase ("yes"));
		
	
		
		scan.close();


		
	}
	public static int multi(int number1, int number2) {
		 return number1 * number2;
	 }

}
