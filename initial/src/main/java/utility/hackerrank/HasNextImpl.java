package utility.hackerrank;

import java.util.Scanner;

public class HasNextImpl {

	static void test1() {
		String s = "Hello World! 3 + 3.0 = 6";

		// create a new scanner with the specified String Object
		Scanner scanner = new Scanner(s);

		// check if the scanner has a token
		System.out.println("" + scanner.hasNext());

		// print the rest of the string
		System.out.println("" + scanner.nextLine());

		// check if the scanner has a token after printing the line
		System.out.println("" + scanner.hasNext());

		// close the scanner
		scanner.close();
	}

	static void test2() {
		// Initialize Scanner object
		Scanner scan = new Scanner("This an example string");
		// Printing the delimiter used
		System.out.println("Delimiter:" + scan.delimiter());
		// Printing the tokenized Strings
		while (scan.hasNext()) {
			System.out.println(scan.next());
		}
		// closing the scanner stream
		scan.close();
	}

	static void test3() {
		Scanner read = new Scanner(System.in);
		String cadena;
		boolean cond = true;
		int i = 0;
		while (cond){
		    cadena = read.nextLine();
		    
		    if(cadena.isEmpty()){
		        cond = false;
		    }else{
		    	System.out.println(++i +" "+ cadena);
		    }
		}
		
		read.close();
	}
	
	public static void main(String[] args) {
		test3();
	}

}
