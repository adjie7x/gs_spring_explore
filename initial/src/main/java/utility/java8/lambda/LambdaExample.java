package utility.java8.lambda;

import utility.java8.interfaces.LambdaGenericInterface;
import utility.java8.interfaces.LambdaInterface1;
import utility.java8.interfaces.LambdaInterface2;
import utility.java8.interfaces.LambdaInterfaceFunction;

public class LambdaExample {

	public static String reverseStr(LambdaInterfaceFunction reverse, String str) {
		return reverse.myStringFunction(str);
	}

	public static void main(String[] args) {
		System.out.println("1. The Arrow Operator");
		LambdaInterface1 isEven = (n) -> (n % 2) == 0;
		LambdaInterface1 isNegative = (n) -> (n < 0);

		// Output: false
		System.out.println(isEven.computeTest(5));

		// Output: true
		System.out.println(isNegative.computeTest(-5));

		System.out.println();
		
		System.out.println("2. The Arrow Operator");

		LambdaInterface2 morningGreeting = (str) -> "Good Morning " + str + "!";
		LambdaInterface2 eveningGreeting = (str) -> "Good Evening " + str + "!";

		// Output: Good Morning Luis!
		System.out.println(morningGreeting.processName("Luis"));

		// Output: Good Evening Jessica!
		System.out.println(eveningGreeting.processName("Jessica"));

		System.out.println();
		
		System.out.println("3. Block Lambda Expressions");

		// Block lambda to reverse string
		LambdaInterfaceFunction reverseStr = (str) -> {
			String result = "";

			for (int i = str.length() - 1; i >= 0; i--)
				result += str.charAt(i);

			return result;
		};

		// Output: omeD adbmaL
		System.out.println(reverseStr.myStringFunction("Lambda Demo"));

		System.out.println();
		
		System.out.println("4. Generic Functional Interfaces");

		// String version of MyGenericInteface
		LambdaGenericInterface<String> reverse = (str) -> {
			String result = "";

			for (int i = str.length() - 1; i >= 0; i--)
				result += str.charAt(i);

			return result;
		};

		// Integer version of MyGeneric
		LambdaGenericInterface<Integer> factorial = (Integer n) -> {
			int result = 1;

			for (int i = 1; i <= n; i++)
				result = i * result;

			return result;
		};

		// Output: omeD adbmaL
		System.out.println(reverse.compute("Lambda Demo"));

		// Output: 120
		System.out.println(factorial.compute(5));
		
		System.out.println();
		
		System.out.println("5. Lambda Expressions as arguments");
		System.out.println(reverseStr(reverseStr, "Lambda Demo"));
		
	}
}
