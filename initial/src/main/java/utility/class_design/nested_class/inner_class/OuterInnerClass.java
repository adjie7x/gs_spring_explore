package utility.class_design.nested_class.inner_class;

public class OuterInnerClass {

	// static member
	static int outer_x = 10;

	// instance(non-static) member
	int outer_y = 20;

	// private member
	private int outer_private = 30;

	class InnerClass {
		void display() {
			// can access static member of outer class
			System.out.println("outer_x = " + outer_x);

			// can also access non-static member of outer class
			System.out.println("outer_y = " + outer_y);

			// can also access private member of outer class
			System.out.println("outer_private = " + outer_private);

		}
	}

}
