package utility.java8.lambda;

import java.util.Comparator;

public class LambdaVsAnonymousImpl {
	
	public static void main(String[] args) {
		System.out.println("1. Anonymous Implementation :");
		Comparator<String> stringComparator = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		};
		
		int comparison = stringComparator.compare("Hello", "World");
		System.out.println(comparison);
		
		System.out.println("1. Lambda Implementation :");
		Comparator<String> stringComparatorLambda = 
				(String o1, String o2) -> {
					return o1.compareTo(o2);
				};
				
		System.out.println(stringComparatorLambda.compare("a", "a"));
	}

}
