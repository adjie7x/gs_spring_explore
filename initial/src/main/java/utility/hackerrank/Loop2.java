package utility.hackerrank;

import java.util.Scanner;

public class Loop2 {

	void example() {
		// Declare the object and initialize with
		// predefined standard input object
		Scanner sc = new Scanner(System.in);

		// String input
		String name = sc.nextLine();

		// Character input
		char gender = sc.next().charAt(0);

		// Numerical data input
		// byte, short and float can be read
		// using similar-named functions.
		int age = sc.nextInt();
		long mobileNo = sc.nextLong();
		double cgpa = sc.nextDouble();

		// Print the values to check if input was correctly obtained.
		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender);
		System.out.println("Age: " + age);
		System.out.println("Mobile Number: " + mobileNo);
		System.out.println("CGPA: " + cgpa);
	}
	
	static execute

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        System.out.println(t);
        for(int i=0;i<t;i++){
        	System.out.println("masukan a :");
            int a = in.nextInt();
            
            System.out.println("masukan b :");
            int b = in.nextInt();
            
            System.out.println("masukan n :");
            int n = in.nextInt();
        }
        in.close();
	}

}
