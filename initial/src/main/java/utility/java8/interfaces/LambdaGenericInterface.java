package utility.java8.interfaces;

@FunctionalInterface
public interface LambdaGenericInterface<T> {
	
	T compute(T t);
	
//	public int computes(T t1, T t2);

}
