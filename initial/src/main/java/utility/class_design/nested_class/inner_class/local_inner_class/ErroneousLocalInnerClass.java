package utility.class_design.nested_class.inner_class.local_inner_class;

//Java code to demonstrate that inner 
//classes cannot be declared as static
public class ErroneousLocalInnerClass {

	private int getValue(int data) {

		// static class Inner { --> Compilation error
		class Inner {
			private int getData() {
				System.out.println("Inside inner class");
				if (data < 10) {
					return 5;
				} else {
					return 15;
				}
			}
		}

		Inner inner = new Inner();
		return inner.getData();
	}
	
	public static void main(String[] args) 
    { 
		ErroneousLocalInnerClass outer = new ErroneousLocalInnerClass(); 
        System.out.println(outer.getValue(10)); 
    }

}
