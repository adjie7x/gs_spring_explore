package utility.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loop2 {

	static List<int[]> result = new ArrayList<int[]>();

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

	static void execute(int a, int b, int n) {
		int[] arrTmp = new int[n];

		int x = 1;
		int eachResult = 0;

		for (int i = 0; i < arrTmp.length; i++) {

			if (i == 0) {
				eachResult = a + (x * b);
			} else {
				eachResult += (x * b);
			}
			arrTmp[i] = eachResult;
			x = x * 2;
		}

		result.add(arrTmp);

	}

	static void printResult() {
		String str = "";
		int arrIdx = 0;
		for (int[] is : result) {

			for (int i = 0; i < is.length; i++) {
				str += is[i];
				if (i < is.length - 1) {
					str += " ";
				}
			}
			if (arrIdx < result.size() - 1) {
				str += "\n";
			}
			arrIdx++;
		}

		System.out.print(str);
	}

	static boolean isValid(int t, int a, int b, int n) {
		boolean x = t >= 0 && t <= 500;
		boolean y = (a >= 0 && a <= 50) && (b >= 0 && b <= 50);
		boolean z = n >= 1 && n <= 15;

		if (x && y && z) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		System.out.println(t);
		for (int i = 0; i < t; i++) {
			System.out.println("masukan a :");
			int a = in.nextInt();

			System.out.println("masukan b :");
			int b = in.nextInt();

			System.out.println("masukan n :");
			int n = in.nextInt();

			if (isValid(t, a, b, n)) {
				execute(a, b, n);
			} else {
				break;
			}

		}
		in.close();

		printResult();
	}

}
